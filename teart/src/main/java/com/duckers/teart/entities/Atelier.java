package com.duckers.teart.entities;

import jakarta.persistence.*;



@Entity
@Table(name="atelier")
public class Atelier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nome;
    @Column
    private String cnpj;
    @Column
    private long idDonoAtelier;

    public Atelier(){
        
    }

    public Atelier(String cnpj, long id, long idDonoAtelier, String nome) {
        this.cnpj = cnpj;
        this.id = id;
        this.idDonoAtelier = idDonoAtelier;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdDonoAtelier() {
        return idDonoAtelier;
    }

    public void setIdDonoAtelier(long idDonoAtelier) {
        this.idDonoAtelier = idDonoAtelier;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
