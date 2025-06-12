package com.duckers.teart.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "enderecos_usuario")
public class EnderecoUsuarioModel {

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
    @JoinColumn(name = "id_comprador", referencedColumnName = "id", nullable = false, insertable = false, updatable=false)
    private CompradorModel comprador;

    @Column(name = "id_comprador")
    private long idComprador;

    public EnderecoUsuarioModel() {}

    public EnderecoUsuarioModel(CompradorModel usuario, String rua, String bairro, String cidade, String estado, String pais, int numero, String cep, String logradouro) {
        this.comprador = usuario;
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
        return idComprador;
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
        this.idComprador = idUsuario;
    }

    public CompradorModel getUsuario() {
        return comprador;
    }

    public void setUsuario(CompradorModel usuario) {
        this.comprador = usuario;
    }
}
