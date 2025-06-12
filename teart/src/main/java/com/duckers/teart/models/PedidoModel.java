package com.duckers.teart.models;

import com.duckers.teart.enums.FormaPagamento;
import com.duckers.teart.enums.StatusPedido;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="pedidos")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private LocalDate dataPedido;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private LocalDate dataEnvio;

    @Column
    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;

    @Column
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    @Column
    private BigDecimal valorTotal; // testar itemped.qtd * preco + itemser.qtd * preco

    @ManyToOne
    @JoinColumn(name = "id_comprador", referencedColumnName = "id", insertable = false, updatable=false)
    private CompradorModel comprador;

    @Column(name = "id_comprador")
    private long idComprador;

    @OneToMany(mappedBy = "pedido", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ItemPedidoProdutoModel> itemPedidoProdutoList;

    @OneToMany(mappedBy = "pedido", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ItemPedidoServicoModel> itemPedidoServicoList;

    // Construtor padrão da JPA
    public PedidoModel() {
    }

    // Construtor com parâmetros (sem as listas de itens de pedido)
    public PedidoModel(LocalDate dataPedido, LocalDate dataEnvio, StatusPedido statusPedido, FormaPagamento formaPagamento, BigDecimal valorTotal, CompradorModel compradorModel) {
        this.dataPedido = dataPedido;
        this.dataEnvio = dataEnvio;
        this.statusPedido = statusPedido;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.comprador = compradorModel;
    }

    // Getters
    public long getId() {
        return id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public long getIdUsuario() {
        return idComprador;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setIdUsuario(long idUsuario) {
        this.idComprador = idUsuario;
    }

    public CompradorModel getComprador() {
        return comprador;
    }
    public void setComprador(CompradorModel usuario) {
        this.comprador = usuario;
    }

    public List<ItemPedidoProdutoModel> getItemPedidoProdutoList() {
        return itemPedidoProdutoList;
    }

    public void setItemPedidoProdutoList(List<ItemPedidoProdutoModel> itemPedidoProdutoList) {
        this.itemPedidoProdutoList = itemPedidoProdutoList;
    }

    public List<ItemPedidoServicoModel> getItemPedidoServicoList() {
        return itemPedidoServicoList;
    }

    public void setItemPedidoServicoList(List<ItemPedidoServicoModel> itemPedidoServicoList) {
        this.itemPedidoServicoList = itemPedidoServicoList;
    }
}
