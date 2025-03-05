package com.duckers.teart.entities;

public class DonoAtelier {
    private long id;
    private String nomeSocial;
    private String nomeUsuario;
    private String email;
    private String senha;
    private String cpf;

    public DonoAtelier(String cpf, String email, long id, String nomeSocial, String nomeUsuario, String senha) {
        this.cpf = cpf;
        this.email = email;
        this.id = id;
        this.nomeSocial = nomeSocial;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
