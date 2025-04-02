package com.duckers.teart.applications;

import java.util.List;
import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.repositories.EnderecoAtelierRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoAtelierApplication {
    private EnderecoAtelierRepository enderecoAtelierRepository;
    
    public EnderecoAtelierApplication(EnderecoAtelierRepository enderecoAtelierRepository) {
        this.enderecoAtelierRepository = enderecoAtelierRepository;
    }
    
    public void createEnderecoAtelier(EnderecoAtelier enderecoAtelier) {
        enderecoAtelierRepository.createEnderecoAtelier(enderecoAtelier);
    }
    
    public EnderecoAtelier getEnderecoAtelierById(long id) {
        return enderecoAtelierRepository.getEnderecoAtelierById(id);
    }
    
    public List<EnderecoAtelier> getAllEnderecoAteliers() {
        return enderecoAtelierRepository.getAllEnderecoAtelier();
    }
    
    public void updateEnderecoAtelier(long id, EnderecoAtelier endereco) {
        enderecoAtelierRepository.updateEnderecoAtelier(id,endereco);
    }
    
    public void deleteEnderecoAtelier(long id) {
        enderecoAtelierRepository.deleteUsuario(id);
    }
}
