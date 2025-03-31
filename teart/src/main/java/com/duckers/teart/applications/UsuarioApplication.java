package com.duckers.teart.applications;

import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApplication {
    private UsuarioRepository usuarioRepository;

    public UsuarioApplication(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepository.createUsuario(usuario);
    }

    public Usuario getUsuarioById(long id) {
        return usuarioRepository.getUsuarioById(id);
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.getAllUsuarios();
    }

    public void updateUsuario(long id, Usuario usuario) {
        usuarioRepository.updateUsuario(id, usuario);
    }

    public void deleteUsuario(long id) {
        usuarioRepository.deleteUsuario(id);
    }
}
