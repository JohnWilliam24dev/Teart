package com.duckers.teart.repositories;

import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.repositories.interfaces.EnderecoAtelierJPA;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
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

    public void updateEnderecoAtelier(EnderecoAtelier enderecoAtelier) {
        this.enderecoAtelierJPA.save(enderecoAtelier);
    }

    public void deleteUsuario(long id) {
        enderecoAtelierJPA.deleteById(id);
    }
}

