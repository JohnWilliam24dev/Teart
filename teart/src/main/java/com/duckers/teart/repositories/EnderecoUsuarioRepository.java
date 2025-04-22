package com.duckers.teart.repositories;


import com.duckers.teart.models.EnderecoUsuarioModel;
import com.duckers.teart.repositories.interfaces.EnderecoUsuarioJPA;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EnderecoUsuarioRepository {
    private final EnderecoUsuarioJPA enderecoUsuarioJPA;

    public EnderecoUsuarioRepository(EnderecoUsuarioJPA enderecoUsuarioJPA) {
        this.enderecoUsuarioJPA = enderecoUsuarioJPA;
    }

    public void createEnderecoUsuario(EnderecoUsuarioModel enderecoUsuario) {
        enderecoUsuarioJPA.save(enderecoUsuario);
    }

    public EnderecoUsuarioModel getEnderecoUsuarioById(long id) {
        return enderecoUsuarioJPA.findById(id).get();
    }

    public List<EnderecoUsuarioModel> getAllEnderecoUsuario() {
        return enderecoUsuarioJPA.findAll();
    }

    public void updateEnderecoUsuario(EnderecoUsuarioModel enderecoUsuario) {
        this.enderecoUsuarioJPA.save(enderecoUsuario);
    }

    public void deleteEnderecoUsuario(long id) {
        enderecoUsuarioJPA.deleteById(id);
    }
}

