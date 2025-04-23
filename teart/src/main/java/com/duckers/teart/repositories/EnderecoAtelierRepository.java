package com.duckers.teart.repositories;


import com.duckers.teart.models.EnderecoAtelierModel;
import com.duckers.teart.repositories.interfaces.EnderecoAtelierJPA;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EnderecoAtelierRepository {
    private final EnderecoAtelierJPA enderecoAtelierJPA;

    public EnderecoAtelierRepository(EnderecoAtelierJPA enderecoAtelierJPA) {
        this.enderecoAtelierJPA = enderecoAtelierJPA;
    }

    public void createEnderecoAtelier(EnderecoAtelierModel enderecoAtelier) {
        enderecoAtelierJPA.save(enderecoAtelier);
    }

    public EnderecoAtelierModel getEnderecoAtelierById(long id) {
        return enderecoAtelierJPA.findById(id).get();
    }

    public List<EnderecoAtelierModel> getAllEnderecoAtelier() {
        return enderecoAtelierJPA.findAll();
    }

    public void updateEnderecoAtelier(EnderecoAtelierModel enderecoAtelier) {
        this.enderecoAtelierJPA.save(enderecoAtelier);
    }

    public void deleteUsuario(long id) {
        enderecoAtelierJPA.deleteById(id);
    }
}

