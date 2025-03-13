package com.duckers.teart.repositorie;
import com.duckers.teart.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
@Repository
public class UsuarioRepositorie {
    List<Usuario> usuarios = new ArrayList<>();

    public Usuario getUsuarioById(int id) {
        return usuarios.stream().filter(usuario -> usuario.getId() == id).findFirst().orElse(null);
    }

    public void add(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void remove(int id) {
        Usuario usuario = getUsuarioById(id);
        if (!usuario.equals(null))
            usuarios.remove(usuario);
    }

    public void update(int id, Usuario usuarioUpdate){
        Usuario usuario  = getUsuarioById(id);
        usuario.setEmail(usuarioUpdate.getEmail());
        usuario.setSenha(usuarioUpdate.getSenha());
    }

    public List<Usuario> getUsuariosList() {
        return usuarios;
    }
}