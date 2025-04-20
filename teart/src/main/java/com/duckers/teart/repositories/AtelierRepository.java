package com.duckers.teart.repositories;

import java.util.List;
import com.duckers.teart.entities.Atelier;
import com.duckers.teart.models.AtelierModel;
import com.duckers.teart.repositories.interfaces.AtelierJPA;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class AtelierRepository {
    private final AtelierJPA atelierJPA;

    public AtelierRepository(AtelierJPA atelierJPA) {
        this.atelierJPA = atelierJPA;
    }

    public void createAtelier(AtelierModel atelier) {
        atelierJPA.save(atelier);
    }

    public AtelierModel getAtelierById(long id) {
        return atelierJPA.findById(id).get();
    }

    public List<AtelierModel> getAllAtelier() {
        return atelierJPA.findAll();
    }

    public void updateAtelier(AtelierModel atelier) {
        this.atelierJPA.save(atelier);
    }

    public void deleteAtelier(long id) {
        atelierJPA.deleteById(id);
    }
}

