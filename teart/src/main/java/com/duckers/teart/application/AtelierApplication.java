package com.duckers.teart.application;

import java.util.List;
import com.duckers.teart.entities.Atelier;
import com.duckers.teart.repositories.AtelierRepositorie;
import org.springframework.stereotype.Service;

@Service
public class AtelierApplication {
    private AtelierRepositorie atelierRepository;

    public AtelierApplication(AtelierRepositorie atelierRepositorie) {
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
