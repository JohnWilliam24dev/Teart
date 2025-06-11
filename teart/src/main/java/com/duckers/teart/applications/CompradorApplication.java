package com.duckers.teart.applications;

import java.util.List;

import com.duckers.teart.entities.Atelier;
import com.duckers.teart.entities.Comprador;
import com.duckers.teart.entities.mapper.DataMapper;
import com.duckers.teart.models.AtelierModel;
import com.duckers.teart.models.CompradorModel;
import com.duckers.teart.repositories.CompradorRepository;
import org.springframework.stereotype.Service;

@Service
public class CompradorApplication {
    private CompradorRepository compradorRepository;

    public CompradorApplication(CompradorRepository compradorRepository) {
        this.compradorRepository = compradorRepository;
    }

    public void createUsuario(CompradorModel compradorModel) {
        Comprador entity= DataMapper.toEntity(compradorModel);
        entity.validation();
        //regras de negocio instanciadas aqui
        CompradorModel model=DataMapper.toModel(entity);
        compradorRepository.createUsuario(model);
    }

    public CompradorModel getUsuarioById(long id) {
        return compradorRepository.getUsuarioById(id);
    }

    public List<CompradorModel> getAllUsuarios() {
        return compradorRepository.getAllUsuarios();
    }

    public void updateUsuario( CompradorModel compradorModel) {
        compradorRepository.updateUsuario(compradorModel);
    }

    public void deleteUsuario(long id) {
        compradorRepository.deleteUsuario(id);
    }
}
