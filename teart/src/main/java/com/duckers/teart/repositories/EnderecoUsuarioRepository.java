package com.duckers.teart.repositories;

import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.repositories.interfaces.EnderecoUsuarioJPA;
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

        enderecoUsuarioPersistido.setRua(enderecoUsuario.getRua());
        enderecoUsuarioPersistido.setBairro(enderecoUsuario.getBairro());
        enderecoUsuarioPersistido.setCidade(enderecoUsuario.getCidade());
        enderecoUsuarioPersistido.setEstado(enderecoUsuario.getEstado());
        enderecoUsuarioPersistido.setPais(enderecoUsuario.getPais());
        enderecoUsuarioPersistido.setCep(enderecoUsuario.getCep());
        enderecoUsuarioPersistido.setNumero(enderecoUsuario.getNumero());

        this.enderecoUsuarioJPA.save(enderecoUsuarioPersistido);
    }

    public void deleteEnderecoUsuario(long id) {
        enderecoUsuarioJPA.deleteById(id);
    }
}

