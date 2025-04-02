package com.duckers.teart.facades;

import java.util.List;
import org.springframework.stereotype.Component;
import com.duckers.teart.applications.AtelierApplication;
import com.duckers.teart.entities.Atelier;

@Component
public class AtelierFacade {

    private AtelierApplication atelierApplication;

    public AtelierFacade(AtelierApplication atelierApplication) {
        this.atelierApplication = atelierApplication;
    }

    public void createAtelier(Atelier atelier) {
        atelierApplication.createAtelier(atelier);
    }

    public Atelier getAtelierById(long id) {
        return atelierApplication.getAtelierById(id);
    }

    public List<Atelier> getAllAteliers() {
        return atelierApplication.getAllAteliers();
    }

    public void updateAtelier(long id, Atelier atelier) {
        atelierApplication.updateAtelier(id, atelier);
    }

    public void deleteAtelier(long id) {
        atelierApplication.deleteAtelier(id);
    }
}
