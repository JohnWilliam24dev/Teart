package com.duckers.teart.repositorie;

import java.util.ArrayList;
import com.duckers.teart.entities.DonoAtelier;

public class DonoAtelierRepositorie {
    ArrayList<DonoAtelier> donoAtelierList = new ArrayList<>();

    public DonoAtelier getDonoAtelierById(int id) {
        return donoAtelierList.stream()
                              .filter(d -> d.getId() == id)
                              .findFirst()
                              .orElse(null);
    }

    public ArrayList<DonoAtelier> getDonoAtelierList() {
        return donoAtelierList;
    }

    public void add(DonoAtelier donoAtelier) {
        donoAtelierList.add(donoAtelier);
    }

    public void remove(int id) {
        DonoAtelier d = getDonoAtelierById(id);
        if (d != null) {
            donoAtelierList.remove(d);
        }
    }

    public void update(int id, DonoAtelier d) {
        DonoAtelier dInMemory = getDonoAtelierById(id);
        if (dInMemory != null) {
            dInMemory.setCpf(d.getCpf());
            dInMemory.setEmail(d.getEmail());
            dInMemory.setNomeSocial(d.getNomeSocial());
            dInMemory.setNomeUsuario(d.getNomeUsuario());
            dInMemory.setSenha(d.getSenha());
        }
    }
}

