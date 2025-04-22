package com.duckers.teart.facades;
import java.util.List;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.models.UsuarioModel;
import com.duckers.teart.applications.UsuarioApplication;
import org.springframework.stereotype.Component;
@Component
public class UsuarioFacade {
    private UsuarioApplication applicationUsuario;

    public UsuarioFacade(UsuarioApplication applicationUsuario){
        this.applicationUsuario = applicationUsuario;

    }

    public void cadastrar(UsuarioModel usuario) {
        applicationUsuario.createUsuario(usuario);
    }

    public void atualizar(UsuarioModel usuario) {
        applicationUsuario.updateUsuario(usuario);
    }

    public List<UsuarioModel> listaUsuarios() {
        return applicationUsuario.getAllUsuarios();
    }

    public UsuarioModel buscarUsuarioPorId(long id) {
        return applicationUsuario.getUsuarioById(id);
    }

    public void excluir(long id) {
        applicationUsuario.deleteUsuario(id);
    }
}