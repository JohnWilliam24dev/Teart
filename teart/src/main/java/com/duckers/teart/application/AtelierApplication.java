package com.duckers.teart.application;

import java.util.List;
import com.duckers.teart.entities.Atelier;
import com.duckers.teart.repositories.Interfaces.AtelierJPA;

import org.springframework.stereotype.Service;

@Service
public class AtelierApplication {
    private AtelierJPA atelierRepository;

    public AtelierApplication(AtelierJPA atelierRepositorie) {
        this.atelierRepository = atelierRepositorie;
    }

    public void createAtelier(Atelier atelier) {
        atelierRepository.save(atelier);
    }

    public Atelier getAtelierById(long id) {
        return atelierRepository.findById(id).get();
    }

    public List<Atelier> getAllAteliers() {
        return atelierRepository.findAll();
    }

    public void updateAtelier(long id, Atelier atelier) {
        Atelier AtelierPersistido = getAtelierById(id);

        AtelierPersistido.setNome(atelier.getNome());
        AtelierPersistido.setCnpj(atelier.getCnpj());
        AtelierPersistido.setIdDonoAtelier(atelier.getIdDonoAtelier());

        atelierRepository.save(AtelierPersistido);
    }

    public void deleteAtelier(long id) {
        atelierRepository.deleteById(id);
    }
}
