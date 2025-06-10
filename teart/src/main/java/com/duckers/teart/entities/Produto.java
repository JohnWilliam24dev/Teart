package com.duckers.teart.entities;
import com.duckers.teart.entities.Object.*;
import com.duckers.teart.entities.enums.Moda;
import com.duckers.teart.entities.enums.Tamanho;

import java.math.BigDecimal;
import java.util.List;


public class Produto {

    private long id;

    private Moda moda;

    private Tamanho tamanho;

    private Text nome;

    private Money preco;

    private Atelier atelier;

    private long idAtelier;


    private List<ItemPedidoProduto> itemPedidoProdutoList;

    // Construtor padrão
    public Produto(){}

    // Construtor com parâmetros (sem o id)
    public Produto(Moda moda, Tamanho tamanho, String nome, BigDecimal preco, Atelier atelier) {
        this.moda = moda;
        this.tamanho = tamanho;
        this.nome.setText(nome);
        this.preco.setNumero(preco);
        this.atelier = atelier;
    }
    public void validation(){
        nome.isNullOrEmpty();
        nome.verificarTamanhoMaximo();
        preco.verificarnumeroPositivo();

    }



}
