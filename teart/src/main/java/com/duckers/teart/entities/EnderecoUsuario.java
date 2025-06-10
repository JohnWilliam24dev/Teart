package com.duckers.teart.entities;


import com.duckers.teart.entities.Object.*;

public class EnderecoUsuario {

    private long id;

    private Text rua;

    private Text numero;

    private Text logradouro;

    private Text bairro;

    private Text cidade;

    private Text estado;

    private CEP cep;



    private Comprador comprador;

    private long idUsuario;

    public EnderecoUsuario() {}

    public EnderecoUsuario(Comprador comprador, String rua, String bairro, String cidade, String estado, String numero, String cep, String logradouro) {
        this.comprador = comprador;
        this.rua.setText(rua);
        this.numero.setText(numero);
        this.logradouro.setText(logradouro);
        this.bairro.setText(bairro);
        this.cidade.setText(cidade);
        this.estado.setText(estado);
        this.cep.setCep(cep);

    }

    private void validation(){
        rua.verificarTamanhoMaximo();
        rua.isNullOrEmpty();
        numero.verificarTamanhoMaximo();
        numero.isNullOrEmpty();
        logradouro.verificarTamanhoMaximo();
        logradouro.isNullOrEmpty();
        bairro.verificarTamanhoMaximo();
        bairro.isNullOrEmpty();
        cidade.verificarTamanhoMaximo();
        cidade.isNullOrEmpty();
        estado.verificarTamanhoMaximo();
        estado.isNullOrEmpty();
        cep.validaCep();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Text getRua() {
        return rua;
    }

    public void setRua(Text rua) {
        this.rua = rua;
    }

    public Text getNumero() {
        return numero;
    }

    public void setNumero(Text numero) {
        this.numero = numero;
    }

    public Text getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Text logradouro) {
        this.logradouro = logradouro;
    }

    public Text getBairro() {
        return bairro;
    }

    public void setBairro(Text bairro) {
        this.bairro = bairro;
    }

    public Text getCidade() {
        return cidade;
    }

    public void setCidade(Text cidade) {
        this.cidade = cidade;
    }

    public Text getEstado() {
        return estado;
    }

    public void setEstado(Text estado) {
        this.estado = estado;
    }

    public CEP getCep() {
        return cep;
    }

    public void setCep(CEP cep) {
        this.cep = cep;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
