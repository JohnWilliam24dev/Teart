package com.duckers.teart.application;

import java.util.ArrayList;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.repositorie.DonoAtelierRepositorie;

public class DonoAtelierApplication {
    private DonoAtelierRepositorie donoRepository;
    
    public DonoAtelierApplication(DonoAtelierRepositorie donoAtelierRepositorie) {
        this.donoRepository = donoAtelierRepositorie;
    }
    
    public void createDonoAtelier(DonoAtelier dono) {
        donoRepository.add(dono);
    }
    
    public DonoAtelier getDonoAtelierById(int id) {
        return donoRepository.getDonoAtelierById(id);
    }
    
    public ArrayList<DonoAtelier> getAllDonoAteliers() {
        return donoRepository.getDonoAtelierList();
    }
    
    public void updateDonoAtelier(int id, DonoAtelier dono) {
        donoRepository.update(id, dono);
    }
    
    public void deleteDonoAtelier(int id) {
        donoRepository.remove(id);
    }
}
