package com.duckers.teart.facade;

import java.util.List;
import com.duckers.teart.application.AtelierApplication;
import com.duckers.teart.entities.Atelier;

public class FacadeAtelier {

    private AtelierApplication applicationAtelier;

    public FacadeAtelier(AtelierApplication applicationAtelier) {
        this.applicationAtelier = applicationAtelier;
    }

    public void cadastrar(Atelier atelier) {
        applicationAtelier.createAtelier(atelier);
    }

    public void atualizar(int id, Atelier atelier) {
        applicationAtelier.updateAtelier(id, atelier);
    }

    public List<Atelier> listaAteliers() {
        return applicationAtelier.getAllAteliers();
    }

    public Atelier buscarAtelierPorId(int id) {
        return applicationAtelier.getAtelierById(id);
    }

    public void excluir(int id) {
        applicationAtelier.deleteAtelier(id);
    }
}
