package com.duckers.teart.repositories;

import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.repositories.Interfaces.EnderecoAtelierJPA;

import java.util.List;

public class EnderecoAtelierRepository {
    private final EnderecoAtelierJPA enderecoAtelierJPA;

    public EnderecoAtelierRepository(EnderecoAtelierJPA enderecoAtelierJPA) {
        this.enderecoAtelierJPA = enderecoAtelierJPA;
    }

    public void createEnderecoAtelier(EnderecoAtelier enderecoAtelier) {
        enderecoAtelierJPA.save(enderecoAtelier);
    }

    public EnderecoAtelier getEnderecoAtelierById(long id) {
        return enderecoAtelierJPA.findById(id).get();
    }

    public List<EnderecoAtelier> getAllEnderecoAtelier() {
        return enderecoAtelierJPA.findAll();
    }

    public void updateEnderecoAtelier(long id, EnderecoAtelier enderecoAtelier) {
        EnderecoAtelier enderecoAtelierPersistido = this.enderecoAtelierJPA.findById(id).get();

        enderecoAtelierPersistido.setIdAtelier(enderecoAtelier.getIdAtelier());
        enderecoAtelierPersistido.setRua(enderecoAtelier.getRua());
        enderecoAtelierPersistido.setNumero(enderecoAtelier.getNumero());
        enderecoAtelierPersistido.setLogradouro(enderecoAtelier.getLogradouro());
        enderecoAtelierPersistido.setBairro(enderecoAtelier.getBairro());
        enderecoAtelierPersistido.setCidade(enderecoAtelier.getCidade());
        enderecoAtelierPersistido.setEstado(enderecoAtelier.getEstado());
        enderecoAtelierPersistido.setCep(enderecoAtelier.getCep());


        this.enderecoAtelierJPA.save(enderecoAtelierPersistido);
    }

    public void deleteUsuario(long id) {
        enderecoAtelierJPA.deleteById(id);
    }
}

