package com.duckers.teart.applications;

import java.util.List;

import com.duckers.teart.entities.Comprador;
import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.entities.mapper.DataMapper;
import com.duckers.teart.models.CompradorModel;
import com.duckers.teart.models.EnderecoAtelierModel;
import com.duckers.teart.repositories.EnderecoAtelierRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoAtelierApplication {
    private EnderecoAtelierRepository enderecoAtelierRepository;
    
    public EnderecoAtelierApplication(EnderecoAtelierRepository enderecoAtelierRepository) {
        this.enderecoAtelierRepository = enderecoAtelierRepository;
    }
    
    public void createEnderecoAtelier(EnderecoAtelierModel enderecoAtelier) {
        EnderecoAtelier entity= DataMapper.toEntity(enderecoAtelier);
        entity.validation();
        //regras de negocio instanciadas aqui
        EnderecoAtelierModel model=DataMapper.toModel(entity);
        enderecoAtelierRepository.createEnderecoAtelier(model);
    }
    
    public EnderecoAtelierModel getEnderecoAtelierById(long id) {
        return enderecoAtelierRepository.getEnderecoAtelierById(id);
    }
    
    public List<EnderecoAtelierModel> getAllEnderecoAteliers() {
        return enderecoAtelierRepository.getAllEnderecoAtelier();
    }
    
    public void updateEnderecoAtelier(EnderecoAtelierModel endereco) {
        enderecoAtelierRepository.updateEnderecoAtelier(endereco);
    }
    
    public void deleteEnderecoAtelier(long id) {
        enderecoAtelierRepository.deleteUsuario(id);
    }
}
