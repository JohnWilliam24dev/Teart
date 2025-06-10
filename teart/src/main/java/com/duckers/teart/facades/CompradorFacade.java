package com.duckers.teart.facades;
import java.util.List;

import com.duckers.teart.models.CompradorModel;
import com.duckers.teart.applications.CompradorApplication;
import org.springframework.stereotype.Component;
@Component
public class CompradorFacade {
    private CompradorApplication compradorApplication;

    public CompradorFacade(CompradorApplication compradorApplication){
        this.compradorApplication = compradorApplication;

    }

    public void cadastrar(CompradorModel compradorModel) {
        compradorApplication.createUsuario(compradorModel);
    }

    public void atualizar(CompradorModel compradorModel) {
        compradorApplication.updateUsuario(compradorModel);
    }

    public List<CompradorModel> listaUsuarios() {
        return compradorApplication.getAllUsuarios();
    }

    public CompradorModel buscarUsuarioPorId(long id) {
        return compradorApplication.getUsuarioById(id);
    }

    public void excluir(long id) {
        compradorApplication.deleteUsuario(id);
    }
}