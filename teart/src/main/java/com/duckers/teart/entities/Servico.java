package com.duckers.teart.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import java.util.List;

@JsonIdentityInfo(scope = Servico.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="servicos")
public class Servico {

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


//    uso incorreto do CascadeType abaixo. Aqui, nao faz sentido persistir o objeto 'atelier' de novo,
//    pois ele ja existe no banco de dados. Nao estamos criando um "servico" sem que antes haja um "atelier"
//    que seja dono desse servico. O atelier ja existe no banco (ja esta persistido).
//    Portanto, o uso desse cascata em 'Servico' eh incorreto, e gerou incosistencia na aplicacao.

//    @ManyToOne(cascade = { CascadeType.PERSIST })

    @ManyToOne // uso correto: sem cascata
    @JoinColumn(name = "id_atelier", nullable = false, insertable = false, updatable=false)
    private Atelier atelier;

    @Column(name = "id_atelier")
    private long idAtelier;

    @OneToMany(mappedBy = "servico")
    private List<ItemPedidoServico> itemPedidoServicoList;

    // Construtor padrão
    public Servico() {}

    // Construtor com parâmetros (sem o id)
    public Servico(Atelier atelier, String nome, String descricao, double valorMaximo, double valorMinimo) {
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

    public Atelier getAtelier() {
        return atelier;
    }

    public List<ItemPedidoServico> getItemPedidoServicoList() {
        return itemPedidoServicoList;
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

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }

    public void setItemPedidoServicoList(List<ItemPedidoServico> itemPedidoServicoList) {
        this.itemPedidoServicoList = itemPedidoServicoList;
    } 
    
    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }
}
