package com.duckers.teart.entities;
import ch.qos.logback.classic.model.LevelModel;
import com.duckers.teart.entities.Object.*;
import com.duckers.teart.entities.Object.Number;


import java.math.BigDecimal;
import java.util.List;


public class Servico {

    private long id;

    private Text nome=new Text();

    private Text descricao=new Text();

    private Money valorMaximo=new Money();

    private Money valorMinimo=new Money();

    private Atelier atelier;

    private long idAtelier;

    private List<ItemPedidoServico> itemPedidoServicoList;

    // Construtor padrão
    public Servico() {}

    // Construtor com parâmetros (sem o id)
    public Servico(Atelier atelier, String nome, String descricao, BigDecimal valorMaximo, BigDecimal valorMinimo) {
        this.atelier = atelier;
        this.nome.setText(nome);
        this.descricao.setText(descricao);
        this.valorMaximo.setNumero(valorMaximo);
        this.valorMinimo.setNumero(valorMinimo);
    }
    public void validation(){
        nome.verificarTamanhoMaximo();
        nome.isNullOrEmpty();
        descricao.isNullOrEmpty();
        descricao.verificarTamanhoMaximo(1000);
        valorMaximo.verificarnumeroPositivo();
        valorMinimo.verificarnumeroPositivo();
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

    public Text getDescricao() {
        return descricao;
    }

    public void setDescricao(Text descricao) {
        this.descricao = descricao;
    }

    public Money getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(Money valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public Money getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Money valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Atelier getAtelier() {
        return atelier;
    }

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }

    public long getIdAtelier() {
        return idAtelier;
    }

    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }

    public List<ItemPedidoServico> getItemPedidoServicoList() {
        return itemPedidoServicoList;
    }

    public void setItemPedidoServicoList(List<ItemPedidoServico> itemPedidoServicoList) {
        this.itemPedidoServicoList = itemPedidoServicoList;
    }


}
