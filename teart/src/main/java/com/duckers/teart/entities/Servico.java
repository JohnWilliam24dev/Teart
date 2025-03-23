package com.duckers.teart.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="servicos")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    @Column
    private long idAtelier;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private double valorMaximo;
    @Column
    private double valorMinimo;

    public Servico(){}

    public Servico(int id, int idAtelier, String nome, String descricao, double valorMaximo, double valoMinimo) {
        this.id = id;
        this.idAtelier = idAtelier;
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

    public long getIdAtelier() {
        return idAtelier;
    }

    public void setIdAtelier(int idAtelier) {
        this.idAtelier = idAtelier;
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
