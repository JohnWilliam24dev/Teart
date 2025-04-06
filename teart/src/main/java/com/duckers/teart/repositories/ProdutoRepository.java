package com.duckers.teart.repositories;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import com.duckers.teart.entities.Produto;
import com.duckers.teart.repositories.interfaces.ProdutoJPA;

@Repository
public class ProdutoRepository {
private ProdutoJPA produtoRepository;

    public ProdutoRepository(ProdutoJPA produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void createPedido(Produto pedido) {
        produtoRepository.save(pedido);
    }

    public Produto getProdutoById(long id) {
        return produtoRepository.findById(id).get();
    }

    public List<Produto> getAllProduto() {
        return produtoRepository.findAll();
    }

    public void updateProduto(Produto produto) {
        this.produtoRepository.save(produto);
    }

    public void deleteProduto(long id) {
        produtoRepository.deleteById(id);
    }
}
