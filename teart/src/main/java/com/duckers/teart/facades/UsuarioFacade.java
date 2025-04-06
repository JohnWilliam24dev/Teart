package com.duckers.teart.facades;
import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.applications.UsuarioApplication;
import org.springframework.stereotype.Component;
@Component
public class UsuarioFacade {
    private UsuarioApplication applicationUsuario;

    public UsuarioFacade(UsuarioApplication applicationUsuario){
        this.applicationUsuario = applicationUsuario;

    }

    public void cadastrar(Usuario usuario) {
        applicationUsuario.createUsuario(usuario);
    }

    public void atualizar(Usuario usuario) {
        applicationUsuario.updateUsuario(usuario);
    }

    public List<Usuario> listaUsuarios() {
        return applicationUsuario.getAllUsuarios();
    }

    public Usuario buscarUsuarioPorId(long id) {
        return applicationUsuario.getUsuarioById(id);
    }

    public void excluir(long id) {
        applicationUsuario.deleteUsuario(id);
    }
}