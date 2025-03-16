package com.duckers.teart.application;

import java.util.List;
import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.repositorie.EnderecoAtelierRepositorie;

public class EnderecoAtelierApplication {
    private EnderecoAtelierRepositorie enderecoRepository;
    
    public EnderecoAtelierApplication(EnderecoAtelierRepositorie enderecoAtelierRepositorie) {
        this.enderecoRepository = enderecoAtelierRepositorie;
    }
    
    public void createEnderecoAtelier(EnderecoAtelier endereco) {
        enderecoRepository.add(endereco);
    }
    
    public EnderecoAtelier getEnderecoAtelierById(int id) {
        return enderecoRepository.getEnderecoAtelierById(id);
    }
    
    public List<EnderecoAtelier> getAllEnderecoAteliers() {
        return enderecoRepository.getEnderecoAtelierList();
    }
    
    public void updateEnderecoAtelier(int id, EnderecoAtelier endereco) {
        enderecoRepository.update(id, endereco);
    }
    
    public void deleteEnderecoAtelier(int id) {
        enderecoRepository.remove(id);
    }
}
