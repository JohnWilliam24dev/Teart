package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.entities.mapper.DataMapper;
import com.duckers.teart.models.EnderecoAtelierModel;
import com.duckers.teart.models.EnderecoUsuarioModel;
import com.duckers.teart.repositories.EnderecoUsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoUsuarioApplication {
    private EnderecoUsuarioRepository enderecoUsuarioRepository;

    public EnderecoUsuarioApplication(EnderecoUsuarioRepository enderecoUsuarioRepository) {
        this.enderecoUsuarioRepository = enderecoUsuarioRepository;
    }

    public void createEnderecoUsuario(EnderecoUsuarioModel enderecoUsuario) {
        EnderecoUsuario entity= DataMapper.toEntity(enderecoUsuario);
        entity.validation();
        //regras de negocio instanciadas aqui
        EnderecoUsuarioModel model=DataMapper.toModel(entity);
        enderecoUsuarioRepository.createEnderecoUsuario(model);
    }

    public EnderecoUsuarioModel getEnderecoUsuarioById(long id) {
        return enderecoUsuarioRepository.getEnderecoUsuarioById(id);
    }

    public List<EnderecoUsuarioModel> getAllEnderecoUsuarios() {
        return enderecoUsuarioRepository.getAllEnderecoUsuario();
    }

    public void updateEnderecoUsuario(EnderecoUsuarioModel enderecoUsuario) {
        enderecoUsuarioRepository.updateEnderecoUsuario(enderecoUsuario);
    }

    public void deleteEnderecoUsuario(long id) {
        enderecoUsuarioRepository.deleteEnderecoUsuario(id);
    }
}