package com.duckers.teart.repositories;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.repositories.interfaces.UsuarioJPA;

@Repository
public class UsuarioRepository {
    private UsuarioJPA usuarioRepository;

    public UsuarioRepository(UsuarioJPA usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuario getUsuarioById(long id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public void updateUsuario(long id, Usuario usuario) {
        Usuario usuarioPersistido = this.usuarioRepository.findById(id).get();
        BeanUtils.copyProperties(usuario, usuarioPersistido, "id");
        this.usuarioRepository.save(usuarioPersistido);
    }

    public void deleteUsuario(long id) {
        usuarioRepository.deleteById(id);
    }
}