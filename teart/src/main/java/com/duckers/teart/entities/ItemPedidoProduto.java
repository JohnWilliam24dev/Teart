package com.duckers.teart.entities;

public class ItemPedidoProduto {

    private long id;

    private int quantidade;

    private Produto produto;

    private long idProduto; 

    private Pedido pedido;

    private long idPedido;

 
    public ItemPedidoProduto() {}

    public ItemPedidoProduto(int quantidade, Produto produto, Pedido pedido) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public long getIdPedido() {
        return idPedido;
    }
    
    public long getIdProduto() {
        return idProduto;
    }

    

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }
}
