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
    public void init(){
        validation();
    }
    private void validation(){

    }




}
