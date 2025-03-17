package com.duckers.teart.facade;

import java.util.List;

import com.duckers.teart.application.EnderecoAtelierApplication;
import com.duckers.teart.entities.EnderecoAtelier;
import org.springframework.stereotype.Component;

@Component
public class EnderecoAtelierFacade {

    private EnderecoAtelierApplication applicationEnderecoAtelier;

    public EnderecoAtelierFacade(EnderecoAtelierApplication applicationEnderecoAtelier) {
        this.applicationEnderecoAtelier = applicationEnderecoAtelier;
    }

    public void cadastrar(EnderecoAtelier enderecoAtelier) {
        applicationEnderecoAtelier.createEnderecoAtelier(enderecoAtelier);
    }

    public void atualizar(int id, EnderecoAtelier enderecoAtelier) {
        applicationEnderecoAtelier.updateEnderecoAtelier(id, enderecoAtelier);
    }

    public List<EnderecoAtelier> listaEnderecoAteliers() {
        return applicationEnderecoAtelier.getAllEnderecoAteliers();
    }

    public EnderecoAtelier buscarEnderecoAtelierPorId(int id) {
        return applicationEnderecoAtelier.getEnderecoAtelierById(id);
    }

    public void excluir(int id) {
        applicationEnderecoAtelier.deleteEnderecoAtelier(id);
    }
}
