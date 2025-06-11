package com.duckers.teart.models;
import com.duckers.teart.entities.Object.Number;
import jakarta.persistence.*;


@Table(name="item_pedidos_servico")
@Entity
public class ItemPedidoServicoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="quantidade")
    private int quantidade;

    @ManyToOne

    @JoinColumn(name = "id_servico", referencedColumnName = "id", insertable = false, updatable=false)
    private ServicoModel servico;

    @Column(name = "id_servico")
    private long idServico;

    

    @ManyToOne

    @JoinColumn(name = "id_pedido", referencedColumnName = "id", insertable = false, updatable=false)
    private PedidoModel pedido;

    @Column(name = "id_pedido")
    private long idPedido;

    

    // Construtor padrão
    public ItemPedidoServicoModel() {}

    // Construtor com parâmetros (sem o id)
    public ItemPedidoServicoModel(int quantidade, ServicoModel servico, PedidoModel pedido) {
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


    public ServicoModel getServico() {
        return servico;
    }

    public void setServico(ServicoModel servico) {
        this.servico = servico;
    }

    public PedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(PedidoModel pedido) {
        this.pedido = pedido;
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
