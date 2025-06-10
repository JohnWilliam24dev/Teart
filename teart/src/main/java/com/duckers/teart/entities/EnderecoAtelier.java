package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;

public class EnderecoAtelier {

    private long id;

    private Text rua;

    private Text numero;

    private Text logradouro;

    private Text bairro;

    private Text cidade;

    private Text estado;

    private CEP cep;

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




}
