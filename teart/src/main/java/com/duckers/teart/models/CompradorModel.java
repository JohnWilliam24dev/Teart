package com.duckers.teart.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="compradores")
public class CompradorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String senha;

    @OneToMany(mappedBy = "comprador", cascade = { CascadeType.PERSIST })
    private List<PedidoModel> pedidos = new ArrayList<>();

    @OneToMany(mappedBy = "comprador", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<EnderecoUsuarioModel> enderecoUsuarioList;

    public CompradorModel() {
    }

    public CompradorModel(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<EnderecoUsuarioModel> getEnderecoUsuarioList() {
        return enderecoUsuarioList;
    }

    public void setEnderecoUsuarioList(List<EnderecoUsuarioModel> enderecoUsuarioList) {
        this.enderecoUsuarioList = enderecoUsuarioList;
    }

    public List<PedidoModel> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoModel> pedidos) {
        this.pedidos = pedidos;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
