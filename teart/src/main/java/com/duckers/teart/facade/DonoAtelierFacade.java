package com.duckers.teart.facade;
import java.util.List;
import com.duckers.teart.application.DonoAtelierApplication;
import org.springframework.stereotype.Component;
import com.duckers.teart.entities.DonoAtelier;

@Component
public class DonoAtelierFacade {
    private DonoAtelierApplication donoAtelierApplication;

    public DonoAtelierFacade(DonoAtelierApplication donoAtelierApplication) {
        this.donoAtelierApplication = donoAtelierApplication;
    }

    public void cadastrar(DonoAtelier donoAtelier) {
        donoAtelierApplication.createDonoAtelier(donoAtelier);
    }

    public void atualizar(int id, DonoAtelier donoAtelier) {
        donoAtelierApplication.updateDonoAtelier(id, donoAtelier);
    }

    public List<DonoAtelier> listaDonoAteliers() {
        return donoAtelierApplication.getAllDonoAteliers();
    }

    public DonoAtelier buscarDonoAtelierPorId(int id) {
        return donoAtelierApplication.getDonoAtelierById(id);
    }

    public void excluir(int id) {
        donoAtelierApplication.deleteDonoAtelier(id);
    }
}
