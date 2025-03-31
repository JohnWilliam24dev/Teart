package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.repositories.ItemPedidoProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoProdutoApplication {
    private final ItemPedidoProdutoRepository itemPedidoProdutoRepository;
    private ItemPedidoProdutoRepository itemPedidoProdutoRepositorie;

    public ItemPedidoProdutoApplication(ItemPedidoProdutoRepository itemPedidoProdutoRepositorie, ItemPedidoProdutoRepository itemPedidoProdutoRepository) {
        this.itemPedidoProdutoRepositorie = itemPedidoProdutoRepositorie;
        this.itemPedidoProdutoRepository = itemPedidoProdutoRepository;
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

    public void updateItemPedidoProduto(long id, ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoRepository.updateItemPedidoProduto(id, itemPedidoProduto);
    }

    public void deleteItemPedidoProduto(long id) {
        itemPedidoProdutoRepositorie.deleteItemPedidoProduto(id);
    }
}