package com.duckers.teart.models;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name="servicos")
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private double valorMaximo;

    @Column
    private double valorMinimo;




    @ManyToOne 
    @JoinColumn(name = "id_atelier", nullable = false, insertable = false, updatable=false)
    private AtelierModel atelier;

    @Column(name = "id_atelier")
    private long idAtelier;

    @OneToMany(mappedBy = "servico")
    private List<ItemPedidoServicoModel> itemPedidoServicoList;

    // Construtor padrão
    public ServicoModel() {}

    // Construtor com parâmetros (sem o id)
    public ServicoModel(AtelierModel atelier, String nome, String descricao, double valorMaximo, double valorMinimo) {
        this.atelier = atelier;
        this.nome = nome;
        this.descricao = descricao;
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valorMinimo;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public long getIdAtelier() {
        return idAtelier;
    }

   

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorMaximo(double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }
}
