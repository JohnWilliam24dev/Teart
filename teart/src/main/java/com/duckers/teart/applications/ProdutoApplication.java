package com.duckers.teart.applications;
import java.util.List;
import com.duckers.teart.entities.Produto;
import com.duckers.teart.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoApplication {
    private ProdutoRepository produtoRepository;

    public ProdutoApplication(com.duckers.teart.repositories.ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void createProduto(Produto produto) {
        produtoRepository.createPedido(produto);
    }

    public Produto getProdutoById(int id) {
        return produtoRepository.getProdutoById(id);
    }

    public List<Produto> getAllProdutos() {
        return produtoRepository.getAllProduto();
    }

    public void updateProduto(int id, Produto produto) {
        produtoRepository.updateProduto(id, produto);
    }

    public void deleteProduto(int id) {
        produtoRepository.deleteProduto(id);
    }
}