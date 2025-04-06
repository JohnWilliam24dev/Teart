package com.duckers.teart.repositories;

import java.util.List;
import com.duckers.teart.entities.Atelier;
import com.duckers.teart.repositories.interfaces.AtelierJPA;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class AtelierRepository {
    private final AtelierJPA atelierJPA;

    public AtelierRepository(AtelierJPA atelierJPA) {
        this.atelierJPA = atelierJPA;
    }

    public void createAtelier(Atelier atelier) {
        atelierJPA.save(atelier);
    }

    public Atelier getAtelierById(long id) {
        return atelierJPA.findById(id).get();
    }

    public List<Atelier> getAllAtelier() {
        return atelierJPA.findAll();
    }

    public void updateAtelier(Atelier atelier) {
        this.atelierJPA.save(atelier);
    }

    public void deleteAtelier(long id) {
        atelierJPA.deleteById(id);
    }
}

