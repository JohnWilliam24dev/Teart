package com.duckers.teart.facade;

import java.util.List;
import com.duckers.teart.application.EnderecoAtelierApplication;
import com.duckers.teart.entities.EnderecoAtelier;

public class FacadeEnderecoAtelier {

    private EnderecoAtelierApplication applicationEnderecoAtelier;

    public FacadeEnderecoAtelier(EnderecoAtelierApplication applicationEnderecoAtelier) {
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
