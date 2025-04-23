package com.duckers.teart.entities;

import com.duckers.teart.entities.utils.Generic;
import com.duckers.teart.entities.utils.Pessoa;

public class DonoAtelier {

    private long id;

    private String nomeSocial;

    private String nomeUsuario;

    private String email;

    private String senha;

    private String cpf;

    private Atelier atelier;

    // Construtor padrão
    public DonoAtelier() {}

    // Construtor com parâmetros
    public DonoAtelier(String nomeSocial, String nomeUsuario, String email, String senha, String cpf, Atelier atelier) {
        this.nomeSocial = nomeSocial;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.atelier = atelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public Atelier getAtelier() {
        return atelier;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }

    public void validarNome(String nome) {
        Generic.verificarNaoNuloOuVazio(nome);
        Generic.verificarTamanhoMaximo(nome, 500);
    }

    public void validarEmail(String email){
        Generic.verificarNaoNuloOuVazio(email);
        Generic.verificarTamanhoMaximo(email, 500);
        Pessoa.validaEmail(email);
    }

    public void validarSenha(String senha){
        
    }
}
