package com.duckers.teart.entities;
import java.util.List;



public class Atelier {


    private long id;

    private String nome;

    private String cnpj;

    private DonoAtelier donoAtelier;

    private long idDonoAtelier;

    private List<Servico> servicos;

    private List<Produto> produtos;

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

    public long getIdDonoAtelier() {
        return idDonoAtelier;
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
    
    public void setIdDonoAtelier(long idDonoAtelier) {
        this.idDonoAtelier = idDonoAtelier;
    }
}
