package com.duckers.teart.entities;

import jakarta.persistence.*;

@Table(name="item_pedidos_produto")
@Entity
public class ItemPedidoProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="quantidade")
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "id_produto", referencedColumnName = "id", insertable = false, updatable = false)
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_pedido", referencedColumnName = "id", insertable = false, updatable = false)
    private Pedido pedido;

    // Construtor padrão
    public ItemPedidoProduto() {}

    // Construtor com parâmetros
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

    public Pedido getPedido() {
        return pedido;
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
}
