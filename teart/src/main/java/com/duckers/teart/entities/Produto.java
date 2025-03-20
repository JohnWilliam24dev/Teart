package com.duckers.teart.entities;
import jakarta.persistence.*;
import com.duckers.teart.enums.Moda;
import com.duckers.teart.enums.Tamanho;
@Entity
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long idAtelier;
    @Column
    private Moda moda;
    @Column
    private Tamanho tamanho;
    @Column
    private String nome;
    @Column
    private double preco;

    public Produto(){}

    public Produto(int id, int idAtelier, Moda moda, Tamanho tamanho, String nome, double preco) {
        this.id = id;
        this.idAtelier = idAtelier;
        this.moda = moda;
        this.tamanho = tamanho;
        this.nome = nome;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public long getIdAtelier() {
        return idAtelier;
    }

    public String getModa() {
        return moda.getDescricao();
    }

    public String getTamanho() {
        return tamanho.getDescricao();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setModa(Moda moda) {
        this.moda = moda;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

