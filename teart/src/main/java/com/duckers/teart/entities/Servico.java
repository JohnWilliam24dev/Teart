package com.duckers.teart.entities;

public class Servico {
    private int id, idAtelier;
    private String nome, descricao;
    private double valorMaximo, valorMinimo;

    public Servico(int id, int idAtelier, String nome, String descricao, double valorMaximo, double valoMinimo) {
        this.id = id;
        this.idAtelier = idAtelier;
        this.nome = nome;
        this.descricao = descricao;
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valoMinimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAtelier() {
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
