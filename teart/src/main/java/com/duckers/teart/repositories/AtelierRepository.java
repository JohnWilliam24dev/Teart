package com.duckers.teart.repositories;

import com.duckers.teart.entities.Atelier;
import com.duckers.teart.repositories.Interfaces.AtelierJPA;

import java.util.List;

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

    public void updateAtelier(long id, Atelier atelier) {
        Atelier atelierPersistido = this.atelierJPA.findById(id).get();

        atelierPersistido.setNome(atelier.getNome());
        atelierPersistido.setCnpj(atelier.getCnpj());

        this.atelierJPA.save(atelierPersistido);
    }

    public void deleteAtelier(long id) {
        atelierJPA.deleteById(id);
    }
}

