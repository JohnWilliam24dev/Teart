package com.duckers.teart.entities;
import com.duckers.teart.entities.Object.*;


import java.math.BigDecimal;
import java.util.List;


public class Servico {

    private long id;

    private Text nome;

    private Text descricao;

    private Money valorMaximo;

    private Money valorMinimo;

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


}
