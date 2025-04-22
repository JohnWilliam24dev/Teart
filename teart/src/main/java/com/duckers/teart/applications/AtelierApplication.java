package com.duckers.teart.applications;

import java.util.List;
import com.duckers.teart.entities.Atelier;
import com.duckers.teart.models.AtelierModel;
import com.duckers.teart.repositories.AtelierRepository;

import org.springframework.stereotype.Service;

@Service
public class AtelierApplication {
    private AtelierRepository atelierRepository;

    public AtelierApplication(AtelierRepository atelierRepository) {
        this.atelierRepository = atelierRepository;
    }

    public void createAtelier(AtelierModel atelier) {
        atelierRepository.createAtelier(atelier);
    }

    public AtelierModel getAtelierById(long id) {
        return atelierRepository.getAtelierById(id);
    }

    public List<AtelierModel> getAllAteliers() {
        return atelierRepository.getAllAtelier();
    }

    public void updateAtelier(AtelierModel atelier) {
        atelierRepository.updateAtelier(atelier);
    }

    public void deleteAtelier(long id) {
        atelierRepository.deleteAtelier(id);
    }
}
