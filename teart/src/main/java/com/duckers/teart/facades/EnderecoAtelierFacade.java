package com.duckers.teart.facades;

import java.util.List;
import com.duckers.teart.applications.EnderecoAtelierApplication;

import com.duckers.teart.models.EnderecoAtelierModel;

import org.springframework.stereotype.Component;

@Component
public class EnderecoAtelierFacade {

    private EnderecoAtelierApplication enderecoAtelierApplication;

    public EnderecoAtelierFacade(EnderecoAtelierApplication enderecoAtelierApplication) {
        this.enderecoAtelierApplication = enderecoAtelierApplication;
    }

    public void createEnderecoAtelier(EnderecoAtelierModel enderecoAtelier) {
        enderecoAtelierApplication.createEnderecoAtelier(enderecoAtelier);
    }

    public void updateEnderecoAtelier(EnderecoAtelierModel enderecoAtelier) {
        enderecoAtelierApplication.updateEnderecoAtelier(enderecoAtelier);
    }

    public List<EnderecoAtelierModel> getAllEnderecoAteliers() {
        return enderecoAtelierApplication.getAllEnderecoAteliers();
    }

    public EnderecoAtelierModel getEnderecoAtelierById(long id) {
        return enderecoAtelierApplication.getEnderecoAtelierById(id);
    }

    public void deleteEnderecoAtelier(long id) {
        enderecoAtelierApplication.deleteEnderecoAtelier(id);
    }
}
