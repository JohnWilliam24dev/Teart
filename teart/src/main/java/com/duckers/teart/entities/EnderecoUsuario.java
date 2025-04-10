package com.duckers.teart.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "enderecos_usuario")
public class EnderecoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String rua;

    @Column
    private String bairro;

    @Column
    private String logradouro;

    @Column
    private String cidade;

    @Column
    private String estado;


    @Column
    private String pais;

    @Column
    private String cep;

    @Column
    private int numero;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false, insertable = false, updatable=false)
    private Usuario usuario;

    @Column(name = "id_usuario")
    private long idUsuario;

    public EnderecoUsuario() {}

    public EnderecoUsuario(Usuario usuario, String rua, String bairro, String cidade, String estado, String pais, int numero, String cep, String logradouro) {
        this.usuario = usuario;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getRua() {
        return rua;
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

    public String getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
