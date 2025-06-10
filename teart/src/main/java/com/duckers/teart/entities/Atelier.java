package com.duckers.teart.entities;


import com.duckers.teart.entities.Object.*;

import java.util.List;

public class Atelier {

    private long id;
    private Text nome;
    private CNPJ cnpj;
    private DonoAtelier donoAtelier;
    private long idDonoAtelier;
    private List<Servico> servicos;
    private List<Produto> produtos;
    private List<EnderecoAtelier> enderecosAtelier;

    // Construtor padrão
    public Atelier() {}

    // Construtor com parâmetros
    public Atelier(String nome, String cnpj, DonoAtelier donoAtelier) {
        this.nome.setText(nome);
        this.cnpj.setCNPJ(cnpj);
        this.donoAtelier = donoAtelier;
    }



}
