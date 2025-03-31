package com.duckers.teart.facade;

import com.duckers.teart.application.ProdutoApplication;
import com.duckers.teart.entities.Produto;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProdutoFacade {
    private ProdutoApplication produtoApplication;

    public ProdutoFacade(ProdutoApplication produtoApplication) {
        this.produtoApplication = produtoApplication;
    }

    public void cadastrar(Produto produto) {
        produtoApplication.createProduto(produto);
    }

    public void atualizar(int id, Produto produto) {
        produtoApplication.updateProduto(id, produto);
    }

    public List<Produto> produtosList() {
        return produtoApplication.getAllProdutos();
    }

    public Produto buscarProdutoPorId(int id) {
        return produtoApplication.getProdutoById(id);
    }

    public void excluir(int id) {
        produtoApplication.deleteProduto(id);
    }
}