package com.duckers.teart.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.duckers.teart.entities.Usuario;

public interface UsuarioJPA extends JpaRepository<Usuario,Long> {

}