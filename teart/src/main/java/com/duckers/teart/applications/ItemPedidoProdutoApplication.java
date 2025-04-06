package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.repositories.ItemPedidoProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoProdutoApplication {
    private final ItemPedidoProdutoRepository itemPedidoProdutoRepository;

    public ItemPedidoProdutoApplication(ItemPedidoProdutoRepository itemPedidoProdutoRepository) {
        this.itemPedidoProdutoRepository = itemPedidoProdutoRepository;
    }

    public void createItemPedidoProduto(ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoRepository.createItemPedidoProduto(itemPedidoProduto);
    }

    public ItemPedidoProduto getItemPedidoProdutoById(long id) {
        return itemPedidoProdutoRepository.getItemPedidoProdutoById(id);
    }

    public List<ItemPedidoProduto> getAllItemPedidosProduto() {
        return itemPedidoProdutoRepository.getAllItemPedidosProduto();
    }

    public void updateItemPedidoProduto( ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoRepository.updateItemPedidoProduto(itemPedidoProduto);
    }

    public void deleteItemPedidoProduto(long id) {
        itemPedidoProdutoRepository.deleteItemPedidoProduto(id);
    }
}