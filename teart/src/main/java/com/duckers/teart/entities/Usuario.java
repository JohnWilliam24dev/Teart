package com.duckers.teart.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String senha;
    @Column
    private String endereco;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<EnderecoUsuario> enderecoUsuarioList = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String endereco, List<EnderecoUsuario> enderecoUsuarioList) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.enderecoUsuarioList = enderecoUsuarioList;
    }

}
