package com.duckers.teart.entities;

public class Endereco_Usuario {
    private int Id;
    private int Id_Usuario;
    private String Tipo_Moradia;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Pais;
    private String Cep;
    private int Numero;

    public Endereco_Usuario(int Id, int Id_Usuario, String Tipo_Moradia, String Rua, String Bairro, String Cidade, String Estado, String Pais, int Numero, String Cep){
        this.Id = Id;
        this.Id_Usuario = Id_Usuario;
        this.Tipo_Moradia = Tipo_Moradia;
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
        this.Cep = Cep;
        this.Numero = Numero;

    }

    public int getId() {
        return Id;
    }
    public String getRua() {
        return Rua;
    }
    public String getBairro() {
        return Bairro;
    }
    public String getCep() {
        return Cep;
    }
    public String getCidade() {
        return Cidade;
    }
    public String getEstado() {
        return Estado;
    }
    public int getNumero() {
        return Numero;
    }
    public int getId_Usuario() {
        return Id_Usuario;
    }
    public String getPais() {
        return Pais;
    }
    public String getTipo_Moradia() {
        return Tipo_Moradia;
    }


    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    public void setCep(String cep) {
        Cep = cep;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public void setId_Usuario(int id_Usuario) {
        Id_Usuario = id_Usuario;
    }
    public void setPais(String pais) {
        Pais = pais;
    }
    public void setTipo_Moradia(String tipo_Moradia) {
        Tipo_Moradia = tipo_Moradia;
    }
    

}
