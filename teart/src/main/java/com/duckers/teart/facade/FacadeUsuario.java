package com.duckers.teart.facade;
import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.application.UsuarioApplication;
import org.springframework.stereotype.Component;
@Component
public class FacadeUsuario {
    private UsuarioApplication applicationUsuario;

    public FacadeUsuario(UsuarioApplication applicationUsuario){
        this.applicationUsuario = applicationUsuario;

    }

    public void cadastrar(Usuario usuario) {
        applicationUsuario.createUsuario(usuario);
    }

    public void atualizar(int id, Usuario usuario) {
        applicationUsuario.updateUsuario(id, usuario);
    }

    public List<Usuario> listaUsuarios() {
        return applicationUsuario.getAllUsuarios();
    }

    public Usuario buscarUsuarioPorId(int id) {
        return applicationUsuario.getUsuarioById(id);
    }

    public void excluir(int id) {
        applicationUsuario.deleteUsuario(id);
    }
}
