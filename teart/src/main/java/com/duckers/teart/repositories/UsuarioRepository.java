package com.duckers.teart.repositories;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.duckers.teart.models.UsuarioModel;
import com.duckers.teart.repositories.interfaces.UsuarioJPA;

@Repository
public class UsuarioRepository {
    private UsuarioJPA usuarioRepository;

    public UsuarioRepository(UsuarioJPA usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void createUsuario(UsuarioModel usuario) {
        usuarioRepository.save(usuario);
    }

    public UsuarioModel getUsuarioById(long id) {
        return usuarioRepository.findById(id).get();
    }

    public List<UsuarioModel> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public void updateUsuario(UsuarioModel usuario) {
        this.usuarioRepository.save(usuario);
    }

    public void deleteUsuario(long id) {
        usuarioRepository.deleteById(id);
    }
}