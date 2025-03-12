package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.repositorie.UsuarioRepositorie;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApplication {
    private UsuarioRepositorie usuarioRepositorie;

    public UsuarioApplication(UsuarioRepositorie usuarioRepositorie) {
        this.usuarioRepositorie = usuarioRepositorie;
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepositorie.add(usuario);
    }

    public Usuario getUsuarioById(int id) {
        return usuarioRepositorie.getUsuarioById(id);
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepositorie.getUsuariosList();
    }

    public void updateUsuario(int id, Usuario usuario) {
        usuarioRepositorie.update(id, usuario);
    }

    public void deleteUsuario(int id) {
        usuarioRepositorie.remove(id);
    }
}