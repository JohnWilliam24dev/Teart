package com.duckers.teart.entities;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;


    public Usuario(int id, String nome, String email, String senha, String endereco){
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.id = id;
        this.nome = nome;
        
    }

    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
