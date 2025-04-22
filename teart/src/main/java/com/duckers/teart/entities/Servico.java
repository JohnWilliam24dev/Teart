package com.duckers.teart.entities;
import java.util.List;


public class Servico {

    private long id;

    private String nome;

    private String descricao;

    private double valorMaximo;

    private double valorMinimo;

    private Atelier atelier;

    private long idAtelier;

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
