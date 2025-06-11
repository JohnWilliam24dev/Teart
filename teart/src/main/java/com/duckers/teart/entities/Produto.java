package com.duckers.teart.entities;
import com.duckers.teart.entities.Object.*;
import com.duckers.teart.enums.Moda;
import com.duckers.teart.enums.Tamanho;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Moda getModa() {
        return moda;
    }

    public void setModa(Moda moda) {
        this.moda = moda;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Text getNome() {
        return nome;
    }

    public void setNome(Text nome) {
        this.nome = nome;
    }

    public Money getPreco() {
        return preco;
    }

    public void setPreco(Money preco) {
        this.preco = preco;
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

    public List<ItemPedidoProduto> getItemPedidoProdutoList() {
        return itemPedidoProdutoList;
    }

    public void setItemPedidoProdutoList(List<ItemPedidoProduto> itemPedidoProdutoList) {
        this.itemPedidoProdutoList = itemPedidoProdutoList;
    }


}
