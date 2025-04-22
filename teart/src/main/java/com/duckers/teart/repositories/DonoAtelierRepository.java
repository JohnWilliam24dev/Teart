package com.duckers.teart.repositories;

import java.util.List;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.models.DonoAtelierModel;
import com.duckers.teart.repositories.interfaces.DonoAtelierJPA;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class DonoAtelierRepository {
    private DonoAtelierJPA donoAtelierJPA;
    
    public DonoAtelierRepository(DonoAtelierJPA donoAtelierJPA) {
        this.donoAtelierJPA = donoAtelierJPA;
    }
    
    public void createDonoAtelier(DonoAtelierModel donoAtelier) {
        donoAtelierJPA.save(donoAtelier);
    }
    
    public DonoAtelierModel getDonoAtelierById(long id) {
        return donoAtelierJPA.findById(id).get();
    }
    
    public List<DonoAtelierModel> getDonoAteliersList() {
        return donoAtelierJPA.findAll();
    }

    public void updateDonoAtelier(DonoAtelierModel donoAtelier) {
        this.donoAtelierJPA.save(donoAtelier);
    }

    public void deleteDonoAtelier(long id) {
        donoAtelierJPA.deleteById(id);
    }
}
