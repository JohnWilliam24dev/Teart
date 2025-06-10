package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;

import java.util.ArrayList;
import java.util.List;

public class Comprador {

    private long id;

    private Text nome;

    private Email email;

    private Senha senha;

    private List<Pedido> pedidos = new ArrayList<>();

    private List<EnderecoUsuario> enderecoUsuarioList;

    public Comprador() {
    }

    public Comprador(String nome, String email, String senha) {
        this.nome.setText(nome);
        this.email.setEmail(email);
        this.senha.setSenha(senha);
    }
    public void validation(){
        nome.verificarTamanhoMaximo();
        nome.isNullOrEmpty();
        email.validaEmail();
        senha.validarSenha();


    }




}
