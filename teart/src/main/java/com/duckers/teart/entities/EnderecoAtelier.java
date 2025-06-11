package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;

public class EnderecoAtelier {

    private long id;

    private Text rua=new Text();

    private Text numero=new Text();

    private Text logradouro=new Text();

    private Text bairro=new Text();

    private Text cidade=new Text();

    private Text estado=new Text();

    private CEP cep=new CEP();

    private Atelier atelier ;

    private long idAtelier;


    // Construtor padrao
    public EnderecoAtelier() {}

    // Construtor com parametros
    public EnderecoAtelier(String rua, String numero, String logradouro, String bairro, String cidade, String estado, String cep, Atelier atelier) {
        this.rua.setText(rua);
        this.numero.setText(numero);
        this.logradouro.setText(logradouro);
        this.bairro.setText(bairro);
        this.cidade.setText(cidade);
        this.estado.setText(estado);
        this.cep.setCep(cep);
        this.atelier = atelier;
    }
    public void validation(){
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

    public Atelier getAtelier() {
        return atelier;
    }

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }

    public long getIdAtelier() {
        return idAtelier;
    }

    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }
}
