package com.duckers.teart.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.duckers.teart.models.ProdutoModel;
import com.duckers.teart.repositories.interfaces.ProdutoJPA;

@Repository
public class ProdutoRepository {
private ProdutoJPA produtoRepository;

    public ProdutoRepository(ProdutoJPA produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void createPedido(ProdutoModel pedido) {
        produtoRepository.save(pedido);
    }

    public ProdutoModel getProdutoById(long id) {
        return produtoRepository.findById(id).get();
    }

    public List<ProdutoModel> getAllProduto() {
        return produtoRepository.findAll();
    }

    public void updateProduto(ProdutoModel produto) {
        this.produtoRepository.save(produto);
    }

    public void deleteProduto(long id) {
        produtoRepository.deleteById(id);
    }
}
