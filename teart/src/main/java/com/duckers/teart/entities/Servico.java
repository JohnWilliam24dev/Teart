package com.duckers.teart.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="servicos")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    @ManyToOne
    @JoinColumn(name = "id_atelier", nullable = false) // Define a FK no banco
    private Atelier atelier;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private double valorMaximo;
    @Column
    private double valorMinimo;

    public Servico(){}

    public Servico(int id, Atelier atelier, String nome, String descricao, double valorMaximo, double valoMinimo) {
        this.id = id;
        this.atelier = atelier;
        this.nome = nome;
        this.descricao = descricao;
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valoMinimo;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Atelier getIdAtelier() {
        return atelier;
    }

    public void setIdAtelier(Atelier atelier) {
        this.atelier = atelier;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public double getValoMinimo() {
        return valorMinimo;
    }

    public void setValoMinimo(double valoMinimo) {
        this.valorMinimo = valoMinimo;
    }
}
