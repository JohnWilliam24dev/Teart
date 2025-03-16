package com.duckers.teart.facade;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.duckers.teart.application.DonoAtelierApplication;
import com.duckers.teart.entities.DonoAtelier;

@Component
public class DonoAtelierFacade {

    private DonoAtelierApplication applicationDonoAtelier;

    public DonoAtelierFacade(DonoAtelierApplication applicationDonoAtelier) {
        this.applicationDonoAtelier = applicationDonoAtelier;
    }

    public void cadastrar(DonoAtelier donoAtelier) {
        applicationDonoAtelier.createDonoAtelier(donoAtelier);
    }

    public void atualizar(int id, DonoAtelier donoAtelier) {
        applicationDonoAtelier.updateDonoAtelier(id, donoAtelier);
    }

    public ArrayList<DonoAtelier> listaDonoAteliers() {
        return applicationDonoAtelier.getAllDonoAteliers();
    }

    public DonoAtelier buscarDonoAtelierPorId(int id) {
        return applicationDonoAtelier.getDonoAtelierById(id);
    }

    public void excluir(int id) {
        applicationDonoAtelier.deleteDonoAtelier(id);
    }
}
