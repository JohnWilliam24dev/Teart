package com.duckers.teart.repositorie;

import java.util.ArrayList;

import com.duckers.teart.entities.Atelier;

import org.springframework.stereotype.Repository;
@Repository
public class AtelierRepositorie {
    ArrayList<Atelier> atelierList= new ArrayList<Atelier>();
    
    public Atelier getAtelierById(int id){
        return atelierList.stream().filter(p->p.getId()==id).findFirst().orElse(null); 
    }
    public ArrayList<Atelier> getAtelierList(){
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
