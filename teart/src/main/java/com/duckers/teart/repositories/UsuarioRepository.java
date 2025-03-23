package com.duckers.teart.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.duckers.teart.entities.Usuario;
import com.duckers.teart.repositories.Interfaces.UsuarioJPA;
@Repository
public class UsuarioRepository {
    private UsuarioJPA usuarioRepositorie;

    public UsuarioRepository(UsuarioJPA usuarioRepositorie) {
        this.usuarioRepositorie = usuarioRepositorie;
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepositorie.save(usuario);
    }

    public Usuario getUsuarioById(long id) {
        return usuarioRepositorie.findById(id).get();
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepositorie.findAll();
    }

    public void updateUsuario(long id, Usuario usuario) {
        Usuario usuario1 = this.usuarioRepositorie.findById(id).get();


        usuario1.setNome(usuario.getNome());
        usuario1.setEmail(usuario.getEmail());
        usuario1.setSenha(usuario.getSenha());
        usuario1.setEndereco(usuario.getEndereco());


        this.usuarioRepositorie.save(usuario1);
    }

    public void deleteUsuario(long id) {
        usuarioRepositorie.deleteById(id);
    }
}