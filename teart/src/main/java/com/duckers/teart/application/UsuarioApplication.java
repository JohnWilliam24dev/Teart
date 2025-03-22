package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.repositories.UsuarioRepositorie;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApplication {
    private UsuarioRepositorie usuarioRepositorie;

    public UsuarioApplication(UsuarioRepositorie usuarioRepositorie) {
        this.usuarioRepositorie = usuarioRepositorie;
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepositorie.save(usuario);
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepositorie.getReferenceById(id);
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepositorie.findAll();
    }

    public void updateUsuario(Usuario usuario) {
        usuarioRepositorie.save(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepositorie.deleteById(id);
    }
}