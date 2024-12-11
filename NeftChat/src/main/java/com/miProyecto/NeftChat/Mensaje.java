package com.miProyecto.NeftChat;
import jakarta.persistence .*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity

public class Mensaje {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String contenido;
        private String canal; // Null para chat global
        private Long remitenteId;
        private Long destinatarioId; // Null si no es privado
        private String timestamp;

        public Long getDestinatarioId() {
                return destinatarioId;
        }

        public void setDestinatarioId(Long destinatarioId) {
                this.destinatarioId = destinatarioId;
        }
    }
