package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;

public class DonoAtelier {

    private long id;

    private Text nomeSocial=new Text();
    private Text nomeUsuario=new Text();

    private Email email=new Email();

    private Senha senha=new Senha();

    private CPF cpf=new CPF();

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
    public void validation(){
        nomeSocial.isNullOrEmpty();
        nomeSocial.verificarTamanhoMaximo();
        nomeUsuario.isNullOrEmpty();
        nomeUsuario.verificarTamanhoMaximo();
        email.validaEmail();
        senha.validarSenha();
        cpf.validaCpf();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Text getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(Text nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public Text getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(Text nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public Atelier getAtelier() {
        return atelier;
    }

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }
}
