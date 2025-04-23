package com.duckers.teart.facades;

import java.util.List;
import com.duckers.teart.applications.DonoAtelierApplication;
import org.springframework.stereotype.Component;

import com.duckers.teart.models.DonoAtelierModel;

@Component
public class DonoAtelierFacade {
    private DonoAtelierApplication donoAtelierApplication;

    public DonoAtelierFacade(DonoAtelierApplication donoAtelierApplication) {
        this.donoAtelierApplication = donoAtelierApplication;
    }

    public void cadastrar(DonoAtelierModel donoAtelier) {
        donoAtelierApplication.createDonoAtelier(donoAtelier);
    }

    public void atualizar(DonoAtelierModel donoAtelier) {
        donoAtelierApplication.updateDonoAtelier(donoAtelier);
    }

    public List<DonoAtelierModel> listaDonoAteliers() {
        return donoAtelierApplication.getAllDonoAteliers();
    }

    public DonoAtelierModel buscarDonoAtelierPorId(int id) {
        return donoAtelierApplication.getDonoAtelierById(id);
    }

    public void excluir(int id) {
        donoAtelierApplication.deleteDonoAtelier(id);
    }
}
