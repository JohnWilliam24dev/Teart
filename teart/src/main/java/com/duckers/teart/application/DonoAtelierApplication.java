package com.duckers.teart.application;

import java.util.List;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.repositories.Interfaces.DonoAtelierJPA;

import org.springframework.stereotype.Service;

@Service
public class DonoAtelierApplication {
    private DonoAtelierJPA donoRepositorie;
    
    public DonoAtelierApplication(DonoAtelierJPA donoAtelierRepositorie) {
        this.donoRepositorie = donoAtelierRepositorie;
    }
    
    public void createDonoAtelier(DonoAtelier dono) {
        donoRepositorie.save(dono);
    }
    
    public DonoAtelier getDonoAtelierById(long id) {
        return donoRepositorie.findById(id).get();
    }
    
    public List<DonoAtelier> getAllDonoAteliers() {
        return donoRepositorie.findAll();
    }

    public void updateDonoAtelier(long id, DonoAtelier dono) {
        DonoAtelier DonoPersistido = getDonoAtelierById(id);

        DonoPersistido.setCpf(dono.getCpf());
        DonoPersistido.setEmail(dono.getEmail());
        DonoPersistido.setNomeSocial(dono.getNomeSocial());
        DonoPersistido.setNomeUsuario(dono.getNomeUsuario());
        DonoPersistido.setSenha(dono.getSenha());

        this.donoRepositorie.save(DonoPersistido);
    }


    public void deleteDonoAtelier(long id) {
        donoRepositorie.deleteById(id);
    }
}
