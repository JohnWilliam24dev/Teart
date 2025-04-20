package com.duckers.teart.applications;
import java.util.List;
import com.duckers.teart.entities.Produto;
import com.duckers.teart.models.ProdutoModel;
import com.duckers.teart.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoApplication {
    private ProdutoRepository produtoRepository;

    public ProdutoApplication(com.duckers.teart.repositories.ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void createProduto(ProdutoModel produto) {
        produtoRepository.createPedido(produto);
    }

    public ProdutoModel getProdutoById(int id) {
        return produtoRepository.getProdutoById(id);
    }

    public List<ProdutoModel> getAllProdutos() {
        return produtoRepository.getAllProduto();
    }

    public void updateProduto( ProdutoModel produto) {
        produtoRepository.updateProduto(produto);
    }

    public void deleteProduto(int id) {
        produtoRepository.deleteProduto(id);
    }
}