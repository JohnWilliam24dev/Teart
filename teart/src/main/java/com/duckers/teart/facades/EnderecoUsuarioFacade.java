package com.duckers.teart.facades;

import java.util.List;
import com.duckers.teart.applications.EnderecoUsuarioApplication;

import com.duckers.teart.models.EnderecoUsuarioModel;

import org.springframework.stereotype.Component;

@Component
public class EnderecoUsuarioFacade {

    private EnderecoUsuarioApplication enderecoUsuarioApplication;

    public EnderecoUsuarioFacade(EnderecoUsuarioApplication enderecoUsuarioApplication) {
        this.enderecoUsuarioApplication = enderecoUsuarioApplication;
    }

    public void createEnderecoUsuario(EnderecoUsuarioModel enderecoUsuario) {
        enderecoUsuarioApplication.createEnderecoUsuario(enderecoUsuario);
    }

    public void updateEnderecoUsuario(EnderecoUsuarioModel enderecoUsuario) {
        enderecoUsuarioApplication.updateEnderecoUsuario(enderecoUsuario);
    }

    public List<EnderecoUsuarioModel> getAllEnderecoUsuarios() {
        return enderecoUsuarioApplication.getAllEnderecoUsuarios();
    }

    public EnderecoUsuarioModel getEnderecoUsuarioById(long id) {
        return enderecoUsuarioApplication.getEnderecoUsuarioById(id);
    }

    public void deleteEnderecoUsuario(long id) {
        enderecoUsuarioApplication.deleteEnderecoUsuario(id);
    }
}