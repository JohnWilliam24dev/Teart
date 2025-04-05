package com.duckers.teart.entities;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "ateliers")
public class Atelier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    @Column
    private String cnpj;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "id_dono_atelier", referencedColumnName = "id")
    private DonoAtelier donoAtelier;

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST })
    private List<Servico> servicos;

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST })
    private List<Produto> produtos;

    @OneToMany(mappedBy = "atelier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<EnderecoAtelier> enderecosAtelier;

    // Construtor padrão
    public Atelier() {}

    // Construtor com parâmetros
    public Atelier(String nome, String cnpj, DonoAtelier donoAtelier) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.donoAtelier = donoAtelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public DonoAtelier getDonoAtelier() {
        return donoAtelier;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<EnderecoAtelier> getEnderecosAtelier() {
        return enderecosAtelier;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setDonoAtelier(DonoAtelier donoAtelier) {
        this.donoAtelier = donoAtelier;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setEnderecosAtelier(List<EnderecoAtelier> enderecosAtelier) {
        this.enderecosAtelier = enderecosAtelier;
    }
}
