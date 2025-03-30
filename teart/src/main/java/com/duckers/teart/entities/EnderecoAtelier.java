package com.duckers.teart.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "enderecos_atelier")
public class EnderecoAtelier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "id_atelier", referencedColumnName = "id")
    private Atelier atelier;

    // Construtor padrão
    public EnderecoAtelier() {}

    // Construtor com parâmetros
    public EnderecoAtelier(String rua, String numero, String logradouro, String bairro, String cidade, String estado, String cep, Atelier atelier) {
        this.rua = rua;
        this.numero = numero;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.atelier = atelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public Atelier getAtelier() {
        return atelier;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }
}
