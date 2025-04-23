package com.duckers.teart.facades;

import com.duckers.teart.applications.ProdutoApplication;

import com.duckers.teart.models.ProdutoModel;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProdutoFacade {
    private ProdutoApplication produtoApplication;

    public ProdutoFacade(ProdutoApplication produtoApplication) {
        this.produtoApplication = produtoApplication;
    }

    public void cadastrar(ProdutoModel produto) {
        produtoApplication.createProduto(produto);
    }

    public void atualizar(ProdutoModel produto) {
        produtoApplication.updateProduto(produto);
    }

    public List<ProdutoModel> produtosList() {
        return produtoApplication.getAllProdutos();
    }

    public ProdutoModel buscarProdutoPorId(int id) {
        return produtoApplication.getProdutoById(id);
    }

    public void excluir(int id) {
        produtoApplication.deleteProduto(id);
    }
}