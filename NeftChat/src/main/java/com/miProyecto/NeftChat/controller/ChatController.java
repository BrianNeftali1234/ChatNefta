package com.miProyecto.NeftChat.controller;

import com.miProyecto.NeftChat.Mensaje;
import com.miProyecto.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    private MensajeRepository mensajeRepository;

    @Autowired
    public ChatController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/chat.global")
    @SendTo("/topic/global")
    public Mensaje enviarMensajeGlobal(Mensaje mensaje) {
        mensajeRepository.save(mensaje);
        return mensaje;
    }

    @MessageMapping("/chat.privado")
    public void enviarMensajePrivado(Mensaje mensaje) {
        mensajeRepository.save(mensaje);
        messagingTemplate.convertAndSendToUser(
                String.valueOf(mensaje.getDestinatarioId()), "/queue/privado", mensaje
        );
    }
}
