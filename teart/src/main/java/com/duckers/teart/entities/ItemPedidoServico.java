package com.duckers.teart.entities;
import jakarta.persistence.*;

@Table(name="item_pedidos_servico")
@Entity
public class ItemPedidoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //    mapear relacionamento
    @Column(name="id_servico")
    private long idServico;

    //    mapear relacionamento
    @Column(name="id_pedido")
    private long idPedido;

    @Column(name="quantidade")
    private int quantidade;

    public ItemPedidoServico() {}

    public ItemPedidoServico(int id, int idServico, int idPedido, int quantidade) {
        this.id = id;
        this.idServico = idServico;
        this.idPedido = idPedido;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public long getIdServico() {
        return idServico;
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

    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
