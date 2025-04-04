package com.duckers.teart.entities;

import jakarta.persistence.*;

@Table(name="item_pedidos_servico")
@Entity
public class ItemPedidoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="quantidade")
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "id_servico", referencedColumnName = "id", insertable = false, updatable = false)
    private Servico servico;

    @Column(name = "id_servico")
    private int servicoId;

    @ManyToOne(cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "id_pedido", referencedColumnName = "id", insertable = false, updatable = false)
    private Pedido pedido;

    @Column(name = "id_pedido")
    private int pedidoId;

    

    // Construtor padrão
    public ItemPedidoServico() {}

    // Construtor com parâmetros (sem o id)
    public ItemPedidoServico(int quantidade, Servico servico, Pedido pedido) {
        this.quantidade = quantidade;
        this.servico = servico;
        this.pedido = pedido;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public Servico getServico() {
        return servico;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getServicoId() {
        return servicoId;
    }

    public void setServicoId(int servicoId) {
        this.servicoId = servicoId;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }
}
