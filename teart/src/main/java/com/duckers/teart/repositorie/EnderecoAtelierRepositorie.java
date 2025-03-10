package com.duckers.teart.repositorie;

import java.util.ArrayList;
import com.duckers.teart.entities.EnderecoAtelier;

public class EnderecoAtelierRepositorie {
    ArrayList<EnderecoAtelier> enderecoList = new ArrayList<>();

    public EnderecoAtelier getEnderecoAtelierById(int id) {
        return enderecoList.stream()
                           .filter(e -> e.getId() == id)
                           .findFirst()
                           .orElse(null);
    }

    public ArrayList<EnderecoAtelier> getEnderecoAtelierList() {
        return enderecoList;
    }

    public void add(EnderecoAtelier endereco) {
        enderecoList.add(endereco);
    }

    public void remove(int id) {
        EnderecoAtelier e = getEnderecoAtelierById(id);
        if (e != null) {
            enderecoList.remove(e);
        }
    }

    public void update(int id, EnderecoAtelier endereco) {
        EnderecoAtelier eInMemory = getEnderecoAtelierById(id);
        if (eInMemory != null) {
            eInMemory.setBairro(endereco.getBairro());
            eInMemory.setCep(endereco.getCep());
            eInMemory.setCidade(endereco.getCidade());
            eInMemory.setEstado(endereco.getEstado());
            eInMemory.setIdAtelier(endereco.getIdAtelier());
            eInMemory.setLogradouro(endereco.getLogradouro());
            eInMemory.setNumero(endereco.getNumero());
            eInMemory.setRua(endereco.getRua());
        }
    }
}
