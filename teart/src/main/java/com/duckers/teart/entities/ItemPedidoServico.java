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

    @JoinColumn(name = "id_servico", referencedColumnName = "id", insertable = false, updatable=false)
    private Servico servico;

    @Column(name = "id_servico")
    private long idServico;

    

    @ManyToOne

    @JoinColumn(name = "id_pedido", referencedColumnName = "id", insertable = false, updatable=false)
    private Pedido pedido;

    @Column(name = "id_pedido")
    private long idPedido;

    

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

    public int getQuantidade() {
        return quantidade;
    }
    
    public long getIdServico() {
        return idServico;
    }

    public long getIdPedido() {
        return idPedido;
    }

    

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }
    
    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }
}
