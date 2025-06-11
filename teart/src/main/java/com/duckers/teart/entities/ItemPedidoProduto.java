package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;
import com.duckers.teart.entities.Object.Number;

public class ItemPedidoProduto {

    private long id;

    private Number quantidade=new Number();

    private Produto produto;

    private long idProduto; 

    private Pedido pedido;

    private long idPedido;

 
    public ItemPedidoProduto() {}

    public ItemPedidoProduto(int quantidade, Produto produto, Pedido pedido) {
        this.quantidade.setNumero(quantidade);
        this.produto = produto;
        this.pedido = pedido;
    }

    public void validation(){
        quantidade.verificarQuantidadePositiva();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Number getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade.setNumero(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }
}
