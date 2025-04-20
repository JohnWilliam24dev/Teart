package com.duckers.teart.repositories.interfaces;

import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.models.EnderecoUsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoUsuarioJPA extends JpaRepository<EnderecoUsuarioModel, Long> {
}
