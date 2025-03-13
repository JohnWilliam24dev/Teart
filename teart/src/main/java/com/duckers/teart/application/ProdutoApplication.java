package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Produto;
import com.duckers.teart.repositorie.ProdutoRepositorie;
import org.springframework.stereotype.Service;

@Service
public class ProdutoApplication {
    private ProdutoRepositorie produtoRepositorie;

    public ProdutoApplication(ProdutoRepositorie produtoRepositorie) {
        this.produtoRepositorie = produtoRepositorie;
    }

    public void createProduto(Produto produto) {
        produtoRepositorie.add(produto);
    }

    public Produto getProdutoById(int id) {
        return produtoRepositorie.getProdutoById(id);
    }

    public List<Produto> getAllProdutos() {
        return produtoRepositorie.getProdutoList();
    }

    public void updateProduto(int id, Produto produto) {
        produtoRepositorie.update(id, produto);
    }

    public void deleteProduto(int id) {
        produtoRepositorie.remove(id);
    }
}