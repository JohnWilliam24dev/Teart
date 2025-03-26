package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.repositories.ItemPedidoProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoProdutoApplication {
    private ItemPedidoProdutoRepository itemPedidoProdutoRepositorie;

    public ItemPedidoProdutoApplication(ItemPedidoProdutoRepository itemPedidoProdutoRepositorie) {
        this.itemPedidoProdutoRepositorie = itemPedidoProdutoRepositorie;
    }

    public void createItemPedidoProduto(ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoRepositorie.createItemPedidoProduto(itemPedidoProduto);
    }

    public ItemPedidoProduto getItemPedidoProdutoById(long id) {
        return itemPedidoProdutoRepositorie.getItemPedidoProdutoById(id);
    }

    public List<ItemPedidoProduto> getAllItemPedidosProduto() {
        return itemPedidoProdutoRepositorie.getAllItemPedidosProduto();
    }

    public void deleteItemPedidoProduto(long id) {
        itemPedidoProdutoRepositorie.deleteItemPedidoProduto(id);
    }
}