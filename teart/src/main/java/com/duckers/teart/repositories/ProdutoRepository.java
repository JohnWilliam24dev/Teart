package com.duckers.teart.repositories;

import java.util.List;
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

    public void updateProduto(long id, Produto produtoAtualizado) {
        Produto produtoPersistido = getProdutoById(id);
        produtoPersistido.setModa(produtoAtualizado.getModa());
        produtoPersistido.setTamanho(produtoAtualizado.getTamanho());
        produtoPersistido.setNome(produtoAtualizado.getNome());
        produtoPersistido.setPreco(produtoAtualizado.getPreco());
        produtoRepository.save(produtoPersistido);
    }

    public void deleteProduto(long id) {
        produtoRepository.deleteById(id);
    }
}
