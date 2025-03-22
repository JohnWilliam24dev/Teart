package com.duckers.teart.repositories.origin;
import com.duckers.teart.entities.Produto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
@Repository
public class ProdutoRepositorie {
    List<Produto> produtos = new ArrayList<>();

    public Produto getProdutoById(int id) {
        return produtos.stream().filter(produto -> produto.getId() == id).findFirst().orElse(null);
    }

    public void add(Produto produto) {
        produtos.add(produto);
    }

    public void remove(int id) {
        Produto produto = getProdutoById(id);
        if (!produto.equals(null))
            produtos.remove(produto);
    }

    public void update(int id, Produto produtoUpdate){
        Produto produto  = getProdutoById(id);
        produto.setPreco(produtoUpdate.getPreco());
    }

    public List<Produto> getProdutoList() {
        return produtos;
    }
}
