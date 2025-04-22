package com.duckers.teart.applications;

import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.models.UsuarioModel;
import com.duckers.teart.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApplication {
    private UsuarioRepository usuarioRepository;

    public UsuarioApplication(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void createUsuario(UsuarioModel usuario) {
        usuarioRepository.createUsuario(usuario);
    }

    public UsuarioModel getUsuarioById(long id) {
        return usuarioRepository.getUsuarioById(id);
    }

    public List<UsuarioModel> getAllUsuarios() {
        return usuarioRepository.getAllUsuarios();
    }

    public void updateUsuario( UsuarioModel usuario) {
        usuarioRepository.updateUsuario(usuario);
    }

    public void deleteUsuario(long id) {
        usuarioRepository.deleteUsuario(id);
    }
}
