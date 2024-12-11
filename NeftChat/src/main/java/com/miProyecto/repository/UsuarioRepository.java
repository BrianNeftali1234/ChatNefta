package com.miProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miProyecto.NeftChat.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
