package com.duckers.teart.facade;

import java.util.List;

import com.duckers.teart.application.EnderecoAtelierApplication;
import com.duckers.teart.entities.EnderecoAtelier;
import org.springframework.stereotype.Component;

@Component
public class EnderecoAtelierFacade {

    private EnderecoAtelierApplication enderecoAtelierApplication;

    public EnderecoAtelierFacade(EnderecoAtelierApplication enderecoAtelierApplication) {
        this.enderecoAtelierApplication = enderecoAtelierApplication;
    }

    public void createEnderecoAtelier(EnderecoAtelier enderecoAtelier) {
        enderecoAtelierApplication.createEnderecoAtelier(enderecoAtelier);
    }

    public void updateEnderecoAtelier(long id, EnderecoAtelier enderecoAtelier) {
        enderecoAtelierApplication.updateEnderecoAtelier(id, enderecoAtelier);
    }

    public List<EnderecoAtelier> getAllEnderecoAteliers() {
        return enderecoAtelierApplication.getAllEnderecoAteliers();
    }

    public EnderecoAtelier getEnderecoAtelierById(long id) {
        return enderecoAtelierApplication.getEnderecoAtelierById(id);
    }

    public void deleteEnderecoAtelier(long id) {
        enderecoAtelierApplication.deleteEnderecoAtelier(id);
    }
}
