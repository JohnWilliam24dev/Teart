package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;

public class DonoAtelier {

    private long id;

    private Text nomeSocial;

    private Text nomeUsuario;

    private Email email;

    private Senha senha;

    private CPF cpf;

    private Atelier atelier;

    // Construtor padrão
    public DonoAtelier() {}

    // Construtor com parâmetros
    public DonoAtelier(String nomeSocial, String nomeUsuario, String email, String senha, String cpf, Atelier atelier) {
        this.nomeSocial.setText(nomeSocial);
        this.nomeUsuario.setText(nomeUsuario);
        this.email.setEmail(email);
        this.senha.setSenha(senha);
        this.cpf.setCpf(cpf);
        this.atelier = atelier;
    }




}
