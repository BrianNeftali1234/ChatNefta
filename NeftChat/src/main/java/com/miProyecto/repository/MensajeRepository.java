package com.miProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miProyecto.NeftChat.Mensaje;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
    List<Mensaje> findByCanal(String canal);
    List<Mensaje> findByDestinatarioId(Long destinatarioId);
}
