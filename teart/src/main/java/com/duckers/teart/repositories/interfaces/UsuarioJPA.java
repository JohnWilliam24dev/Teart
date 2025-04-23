package com.duckers.teart.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duckers.teart.models.UsuarioModel;

public interface UsuarioJPA extends JpaRepository<UsuarioModel,Long> {

}