package com.duckers.teart.applications;

import java.util.List;

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
        compradorRepository.createUsuario(compradorModel);
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
