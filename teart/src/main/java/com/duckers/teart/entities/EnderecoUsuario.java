package com.duckers.teart.entities;

public class EnderecoUsuario {
    private int id;
    private int idUsuario;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private int numero;

    public EnderecoUsuario(int id, int idUsuario, String rua, String bairro, String cidade, String estado, String pais, int numero, String cep){
        this.id = id;
        this.idUsuario = idUsuario;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;

    }

    public int getId() {
        return id;
    }
    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public int getNumero() {
        return numero;
    }
    public int getId_Usuario() {
        return idUsuario;
    }
    public String getPais() {
        return pais;
    }
  


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setId_Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    

}
