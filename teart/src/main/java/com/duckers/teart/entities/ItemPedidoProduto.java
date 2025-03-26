package com.duckers.teart.entities;
import jakarta.persistence.*;

@Table(name="item_pedidos_produto")
@Entity
public class ItemPedidoProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //    mapear relacionamento
    @Column(name="id_produto")
    private long idProduto;

    //    mapear relacionamento
    @Column(name="id_pedido")
    private long idPedido;

    @Column(name="quantidade")
    private int quantidade;

    public ItemPedidoProduto() {}

    public ItemPedidoProduto(int id, int idProduto, int idPedido, int quantidade) {
        this.id = id;
        this.idProduto = idProduto;
        this.idPedido = idPedido;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
