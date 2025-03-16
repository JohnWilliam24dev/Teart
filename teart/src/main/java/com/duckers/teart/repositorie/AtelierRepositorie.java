package com.duckers.teart.repositorie;

import java.util.ArrayList;
import java.util.List;

import com.duckers.teart.entities.Atelier;


public class AtelierRepositorie {
    List<Atelier> atelierList= new ArrayList<>();
    
    public Atelier getAtelierById(int id){
        return atelierList.stream().filter(p->p.getId()==id).findFirst().orElse(null); 
    }
    public List<Atelier> getAtelierList(){
        return atelierList;
    }
    public void add(Atelier atelier){
        atelierList.add(atelier);

    }
    public void remove(int id){
        if (getAtelierById(id)!=null) {
            atelierList.remove(getAtelierById(id));
        }  
    }
    public void update(int id, Atelier p){
        Atelier aInMemory=getAtelierById(id);
        aInMemory.setNome(p.getNome());
        aInMemory.setCnpj(p.getCnpj());
        aInMemory.setIdDonoAtelier(p.getIdDonoAtelier());
        

    }
}
