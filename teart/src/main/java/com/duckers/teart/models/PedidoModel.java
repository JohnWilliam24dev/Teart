package com.duckers.teart.models;

import com.duckers.teart.models.enums.FormaPagamento;
import com.duckers.teart.models.enums.StatusPedido;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;



@Table(name="pedidos")
@Entity
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
    private double valorTotal; // testar itemped.qtd * preco + itemser.qtd * preco

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", insertable = false, updatable=false)
    private UsuarioModel usuario;

    @Column(name = "id_usuario")
    private long idUsuario;

    @OneToMany(mappedBy = "pedido", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ItemPedidoProdutoModel> itemPedidoProdutoList;

    @OneToMany(mappedBy = "pedido", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ItemPedidoServicoModel> itemPedidoServicoList;

    // Construtor padrão da JPA
    public PedidoModel() {
    }

    // Construtor com parâmetros (sem as listas de itens de pedido)
    public PedidoModel(LocalDate dataPedido, LocalDate dataEnvio, StatusPedido statusPedido, FormaPagamento formaPagamento, double valorTotal, UsuarioModel usuario) {
        this.dataPedido = dataPedido;
        this.dataEnvio = dataEnvio;
        this.statusPedido = statusPedido;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.usuario = usuario;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public long getIdUsuario() {
        return idUsuario;
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

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    
}
