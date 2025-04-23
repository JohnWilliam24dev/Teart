package com.duckers.teart.facades;

import java.util.List;
import org.springframework.stereotype.Component;
import com.duckers.teart.applications.AtelierApplication;

import com.duckers.teart.models.AtelierModel;

@Component
public class AtelierFacade {

    private AtelierApplication atelierApplication;

    public AtelierFacade(AtelierApplication atelierApplication) {
        this.atelierApplication = atelierApplication;
    }

    public void createAtelier(AtelierModel atelier) {
        atelierApplication.createAtelier(atelier);
    }

    public AtelierModel getAtelierById(long id) {
        return atelierApplication.getAtelierById(id);
    }

    public List<AtelierModel> getAllAteliers() {
        return atelierApplication.getAllAteliers();
    }

    public void updateAtelier(AtelierModel atelier) {
        atelierApplication.updateAtelier(atelier);
    }

    public void deleteAtelier(long id) {
        atelierApplication.deleteAtelier(id);
    }
}
