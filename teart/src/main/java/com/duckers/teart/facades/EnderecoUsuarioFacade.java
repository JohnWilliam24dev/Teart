package com.duckers.teart.facades;

import java.util.List;
import com.duckers.teart.applications.EnderecoUsuarioApplication;
import com.duckers.teart.entities.EnderecoUsuario;
import org.springframework.stereotype.Component;

@Component
public class EnderecoUsuarioFacade {

    private EnderecoUsuarioApplication enderecoUsuarioApplication;

    public EnderecoUsuarioFacade(EnderecoUsuarioApplication enderecoUsuarioApplication) {
        this.enderecoUsuarioApplication = enderecoUsuarioApplication;
    }

    public void createEnderecoUsuario(EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioApplication.createEnderecoUsuario(enderecoUsuario);
    }

    public void updateEnderecoUsuario(long id, EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioApplication.updateEnderecoUsuario(id, enderecoUsuario);
    }

    public List<EnderecoUsuario> getAllEnderecoUsuarios() {
        return enderecoUsuarioApplication.getAllEnderecoUsuarios();
    }

    public EnderecoUsuario getEnderecoUsuarioById(long id) {
        return enderecoUsuarioApplication.getEnderecoUsuarioById(id);
    }

    public void deleteEnderecoUsuario(long id) {
        enderecoUsuarioApplication.deleteEnderecoUsuario(id);
    }
}