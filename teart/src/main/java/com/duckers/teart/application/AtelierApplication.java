package com.duckers.teart.application;

import java.util.ArrayList;
import com.duckers.teart.entities.Atelier;
import com.duckers.teart.repositorie.AtelierRepositorie;
import org.springframework.stereotype.Service;

@Service
public class AtelierApplication {
    private AtelierRepositorie atelierRepository;
    
    public AtelierApplication(AtelierRepositorie atelierRepositorie) {
        this.atelierRepository = atelierRepositorie;
    }
    
    public void createAtelier(Atelier atelier) {
        atelierRepository.add(atelier);
    }
    
    public Atelier getAtelierById(int id) {
        return atelierRepository.getAtelierById(id);
    }
    
    public ArrayList<Atelier> getAllAteliers() {
        return atelierRepository.getAtelierList();
    }
    
    public void updateAtelier(int id, Atelier atelier) {
        atelierRepository.update(id, atelier);
    }
    
    public void deleteAtelier(int id) {
        atelierRepository.remove(id);
    }
}
