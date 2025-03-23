package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Produto;
import com.duckers.teart.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoApplication {
    private ProdutoRepository produtoRepositorie;

    public ProdutoApplication(com.duckers.teart.repositories.ProdutoRepository produtoRepositorie) {
        this.produtoRepositorie = produtoRepositorie;
    }

    public void createProduto(Produto produto) {
        produtoRepositorie.createPedido(produto);
    }

    public Produto getProdutoById(int id) {
        return produtoRepositorie.getProdutoById(id);
    }

    public List<Produto> getAllProdutos() {
        return produtoRepositorie.getAllProduto();
    }

    public void updateProduto(int id, Produto produto) {
        produtoRepositorie.updateProduto(id, produto);
    }

    public void deleteProduto(int id) {
        produtoRepositorie.deleteProduto(id);
    }
}