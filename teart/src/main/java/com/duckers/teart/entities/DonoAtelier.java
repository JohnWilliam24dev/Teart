package com.duckers.teart.entities;

import jakarta.persistence.*;

@Entity
@Table(name="donos_atelier")
public class DonoAtelier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nomeSocial;
    @Column
    private String nomeUsuario;
    @Column
    private String email;
    @Column
    private String senha;
    @Column
    private String cpf;

    @OneToOne(mappedBy = "donoAtelier")
    private Atelier atelier;

    public DonoAtelier(){}

    public DonoAtelier(String cpf, String email, long id, String nomeSocial, String nomeUsuario, String senha) {
        this.cpf = cpf;
        this.email = email;
        this.id = id;
        this.nomeSocial = nomeSocial;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    public Atelier getAtelier() {
        return atelier;
    }

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
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
