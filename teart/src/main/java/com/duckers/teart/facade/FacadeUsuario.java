package com.duckers.teart.facade;


import java.util.ArrayList;

import com.duckers.teart.application.EnderecoAtelierApplication;
import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.entities.Usuario;
import com.duckers.teart.entities.UsuarioApplication;

public class FacadeUsuario {
    private UsuarioApplication applicationUsuario;

    public FacadeUsuario(UsuarioApplication applicationUsuario){
        this.applicationUsuario = applicationUsuario;

    }

    public void cadastrar(UsuarioApplication applicationUsuario) {
        applicationUsuario.createUsuario(enderecoAtelier);
    }

    public void atualizar(int id, UsuarioApplication applicationUsuarior) {
        applicationUsuario.updateUsuario(id, usuario);
    }

    public ArrayList<Usuario> listaUsuarios() {
        return applicationUsuario.getAllUsuarios();
    }

    public Usuario buscarUsuarioPorId(int id) {
        return applicationUsuario.getUsuarioById(id);
    }

    public void excluir(int id) {
        applicationUsuario.deleteUsuario(id);
    }
}
