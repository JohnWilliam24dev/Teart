package com.duckers.teart.repositories;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.duckers.teart.models.CompradorModel;
import com.duckers.teart.repositories.interfaces.CompradorJPA;

@Repository
public class CompradorRepository {
    private CompradorJPA compradorJPA;

    public CompradorRepository(CompradorJPA compradorJPA) {
        this.compradorJPA = compradorJPA;
    }

    public void createUsuario(CompradorModel compradorModel) {
        compradorJPA.save(compradorModel);
    }

    public CompradorModel getUsuarioById(long id) {
        return compradorJPA.findById(id).get();
    }

    public List<CompradorModel> getAllUsuarios() {
        return compradorJPA.findAll();
    }

    public void updateUsuario(CompradorModel compradorModel) {
        this.compradorJPA.save(compradorModel);
    }

    public void deleteUsuario(long id) {
        compradorJPA.deleteById(id);
    }
}