package com.duckers.teart.repositories;

import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.repositories.interfaces.EnderecoUsuarioJPA;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EnderecoUsuarioRepository {
    private final EnderecoUsuarioJPA enderecoUsuarioJPA;

    public EnderecoUsuarioRepository(EnderecoUsuarioJPA enderecoUsuarioJPA) {
        this.enderecoUsuarioJPA = enderecoUsuarioJPA;
    }

    public void createEnderecoUsuario(EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioJPA.save(enderecoUsuario);
    }

    public EnderecoUsuario getEnderecoUsuarioById(long id) {
        return enderecoUsuarioJPA.findById(id).get();
    }

    public List<EnderecoUsuario> getAllEnderecoUsuario() {
        return enderecoUsuarioJPA.findAll();
    }

    public void updateEnderecoUsuario(long id, EnderecoUsuario enderecoUsuario) {
        EnderecoUsuario enderecoUsuarioPersistido = this.enderecoUsuarioJPA.findById(id).get();
        BeanUtils.copyProperties(enderecoUsuario, enderecoUsuarioPersistido, "id"); // Ignorando o campo "id"
        this.enderecoUsuarioJPA.save(enderecoUsuarioPersistido);
    }

    public void deleteEnderecoUsuario(long id) {
        enderecoUsuarioJPA.deleteById(id);
    }
}

