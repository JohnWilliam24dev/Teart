package com.duckers.teart.repositories.origin;

import java.util.ArrayList;
import java.util.List;
import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.repositories.jpa.EnderecoAtelierJpa;
import org.springframework.stereotype.Repository;
@Repository
public class EnderecoAtelierRepositorie {

    private final EnderecoAtelierJpa enderecoAtelierJpa;

    public EnderecoAtelierRepositorie(EnderecoAtelierJpa enderecoAtelierJpa) {
        this.enderecoAtelierJpa = enderecoAtelierJpa;
    }

    public EnderecoAtelier getEnderecoAtelierById(int id) {
        return this.enderecoAtelierJpa.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado para o ID: " + id));
    }

    public List<EnderecoAtelier> getEnderecoAtelierList() {

        return this.enderecoAtelierJpa.findAll();
    }

    public void add(EnderecoAtelier endereco) {

        this.enderecoAtelierJpa.save(endereco);
    }

    public void remove(int id) {
        if (this.enderecoAtelierJpa.existsById(id)){
            this.enderecoAtelierJpa.deleteById(id);
        }else{
            throw new RuntimeException("Endereço não encontrado para o ID: " + id);
        }

    }

    public void update(int id, EnderecoAtelier endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("Os dados para atualização não podem ser nulos.");
        }

        EnderecoAtelier enderecoInDb = this.enderecoAtelierJpa.findById(id).
                orElseThrow(() -> new RuntimeException("Endereço não encontrado para o ID: " + id));;

        enderecoInDb.setBairro(endereco.getBairro());
        enderecoInDb.setCep(endereco.getCep());
        enderecoInDb.setCidade(endereco.getCidade());
        enderecoInDb.setEstado(endereco.getEstado());
        enderecoInDb.setIdAtelier(endereco.getIdAtelier());
        enderecoInDb.setLogradouro(endereco.getLogradouro());
        enderecoInDb.setNumero(endereco.getNumero());
        enderecoInDb.setRua(endereco.getRua());

        this.enderecoAtelierJpa.save(enderecoInDb);
    }
}
