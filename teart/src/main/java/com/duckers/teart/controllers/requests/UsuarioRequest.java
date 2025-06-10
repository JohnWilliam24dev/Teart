package com.duckers.teart.controllers.requests;

public class UsuarioRequest {
    private String usuario;
    private String nome;
    private String senha;
    private String papel;

    public UsuarioRequest(String usuario, String nome, String senha, String papel) {
        this.usuario = usuario;
        this.nome = nome;
        this.senha = senha;
        this.papel = papel;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
