package com.duckers.teart.repositories;

import java.util.List;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.repositories.interfaces.DonoAtelierJPA;
import org.springframework.stereotype.Repository;

@Repository
public class DonoAtelierRepository {
    private DonoAtelierJPA donoAtelierJPA;
    
    public DonoAtelierRepository(DonoAtelierJPA donoAtelierJPA) {
        this.donoAtelierJPA = donoAtelierJPA;
    }
    
    public void createDonoAtelier(DonoAtelier donoAtelier) {
        donoAtelierJPA.save(donoAtelier);
    }
    
    public DonoAtelier getDonoAtelierById(long id) {
        return donoAtelierJPA.findById(id).get();
    }
    
    public List<DonoAtelier> getDonoAteliersList() {
        return donoAtelierJPA.findAll();
    }

    public void updateDonoAtelier(long id, DonoAtelier donoAtelier) {
        DonoAtelier donoAtelierPersistido = getDonoAtelierById(id);

        donoAtelierPersistido.setCpf(donoAtelier.getCpf());
        donoAtelierPersistido.setEmail(donoAtelier.getEmail());
        donoAtelierPersistido.setNomeSocial(donoAtelier.getNomeSocial());
        donoAtelierPersistido.setNomeUsuario(donoAtelier.getNomeUsuario());
        donoAtelierPersistido.setSenha(donoAtelier.getSenha());

        donoAtelierJPA.save(donoAtelierPersistido);
    }

    public void deleteDonoAtelier(long id) {
        donoAtelierJPA.deleteById(id);
    }
}
