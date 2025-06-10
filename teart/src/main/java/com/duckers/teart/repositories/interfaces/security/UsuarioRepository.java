package com.duckers.teart.repositories.interfaces.security;

import com.duckers.teart.models.security.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
