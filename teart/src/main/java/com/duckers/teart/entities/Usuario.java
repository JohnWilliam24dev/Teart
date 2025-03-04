package com.duckers.teart.entities;

public class Usuario {
    private int Id;
    private String Nome;
    private String Email;
    private String Senha;
    private String Endereco;


    public Usuario(int Id, String Nome, String Email, String Senha, String Endereco){
        this.Email = Email;
        this.Senha = Senha;
        this.Endereco = Endereco;
        this.Id = Id;
        this.Nome = Nome;
        
    }

    public String getEmail() {
        return Email;
    }
    public String getEndereco() {
        return Endereco;
    }
    public int getId() {
        return Id;
    }
    public String getNome() {
        return Nome;
    }
    public String getSenha() {
        return Senha;
    }
    

    public void setEmail(String email) {
        Email = email;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }

}
