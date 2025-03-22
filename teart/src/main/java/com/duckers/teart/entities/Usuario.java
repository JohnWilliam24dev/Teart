package com.duckers.teart.entities;

import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String senha;
    @Column
    private String endereco;

    public Usuario(Long id, String nome, String email, String senha, String endereco){
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
    public Long getId() {
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
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
