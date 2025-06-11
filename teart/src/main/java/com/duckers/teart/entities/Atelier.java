package com.duckers.teart.entities;


import com.duckers.teart.entities.Object.*;

import java.util.List;

public class Atelier {

    private long id;
    private Text nome=new Text();
    private CNPJ cnpj=new CNPJ();
    private DonoAtelier donoAtelier;
    private long idDonoAtelier;
    private List<Servico> servicos;
    private List<Produto> produtos;
    private List<EnderecoAtelier> enderecosAtelier;

    // Construtor padrão
    public Atelier() {}

    // Construtor com parâmetros
    public Atelier(String nome, String cnpj, DonoAtelier donoAtelier) {
        this.nome.setText(nome);
        this.cnpj.setCNPJ(cnpj);
        this.donoAtelier = donoAtelier;
    }
    public void validation(){
        nome.verificarTamanhoMaximo();
        nome.isNullOrEmpty();
        cnpj.validarCnpj();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Text getNome() {
        return nome;
    }

    public void setNome(Text nome) {
        this.nome = nome;
    }

    public CNPJ getCnpj() {
        return cnpj;
    }

    public void setCnpj(CNPJ cnpj) {
        this.cnpj = cnpj;
    }

    public DonoAtelier getDonoAtelier() {
        return donoAtelier;
    }

    public void setDonoAtelier(DonoAtelier donoAtelier) {
        this.donoAtelier = donoAtelier;
    }

    public long getIdDonoAtelier() {
        return idDonoAtelier;
    }

    public void setIdDonoAtelier(long idDonoAtelier) {
        this.idDonoAtelier = idDonoAtelier;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<EnderecoAtelier> getEnderecosAtelier() {
        return enderecosAtelier;
    }

    public void setEnderecosAtelier(List<EnderecoAtelier> enderecosAtelier) {
        this.enderecosAtelier = enderecosAtelier;
    }
}
