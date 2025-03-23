package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.repositories.UsuarioRepository;


import org.springframework.stereotype.Service;

@Service
public class UsuarioApplication {
    private UsuarioRepository usuarioRepositorie;

    public UsuarioApplication(UsuarioRepository usuarioRepository) {
        this.usuarioRepositorie = usuarioRepository;
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepositorie.createUsuario(usuario);
    }

    public Usuario getUsuarioById(long id) {
        return usuarioRepositorie.getUsuarioById(id);
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepositorie.getAllUsuarios();
    }

    public void updateUsuario(long id, Usuario usuario) {
        usuarioRepositorie.updateUsuario(id, usuario);
    }

    public void deleteUsuario(long id) {
        usuarioRepositorie.deleteUsuario(id);
    }
}
