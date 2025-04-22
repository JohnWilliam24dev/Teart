package com.duckers.teart.entities;



public class EnderecoAtelier {

    private long id;

    private String rua;

    private String numero;

    private String logradouro;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private Atelier atelier ;

    private long idAtelier;


    // Construtor padrao
    public EnderecoAtelier() {}

    // Construtor com parametros
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
    
    public long getIdAtelier() {
        return idAtelier;
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
    
    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }
}
