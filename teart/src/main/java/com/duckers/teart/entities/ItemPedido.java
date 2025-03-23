package com.duckers.teart.entities;
import com.duckers.teart.enums.TipoProdutoServico;
import jakarta.persistence.*;

@Table(name="item_pedidos")
@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="id_produto") // FK -> @ManyToOne
    private long idProduto;

    @Column(name="id_servico") // FK -> @ManyToOne
    private long idServico;

    @Column(name="id_pedido") // FK -> @ManyToOne
    private long idPedido;

    @Column(name="id_quantidade")
    private int quantidade;

    @Column(name="tipo_produto_servico")
    TipoProdutoServico tipoProdutoServico;

    public ItemPedido() { // JPA construtor

    }

    public ItemPedido(int id, int idProduto, int idServico, int idPedido, int quantidade, TipoProdutoServico tipoProdutoServico) {
        this.id = id;
        this.idProduto = idProduto;
        this.idServico = idServico;
        this.idPedido = idPedido;
        this.quantidade = quantidade;
        this.tipoProdutoServico = tipoProdutoServico;
    }

    public long getId() {
        return id;
    }

    public long getIdProduto() {
        return idProduto;
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

    public TipoProdutoServico getTipoProdutoServico() {
        return tipoProdutoServico;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
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

    public void setTipoProdutoServico(TipoProdutoServico tipoProdutoServico) {
        this.tipoProdutoServico = tipoProdutoServico;
    }
}
