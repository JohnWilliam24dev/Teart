package com.duckers.teart.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "endereco_atelier")
public class EnderecoAtelier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long idAtelier;
    @Column
    private String rua;
    @Column
    private String numero;
    @Column
    private String logradouro;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String estado;
    @Column
    private String cep;


    public EnderecoAtelier(String bairro, String cep, String cidade, String estado, long id, long idAtelier, String logradouro, String numero, String rua) {
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.id = id;
        this.idAtelier = idAtelier;
        this.logradouro = logradouro;
        this.numero = numero;
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdAtelier() {
        return idAtelier;
    }

    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
