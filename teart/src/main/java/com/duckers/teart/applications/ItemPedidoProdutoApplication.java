package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.models.ItemPedidoProdutoModel;
import com.duckers.teart.repositories.ItemPedidoProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoProdutoApplication {
    private final ItemPedidoProdutoRepository itemPedidoProdutoRepository;

    public ItemPedidoProdutoApplication(ItemPedidoProdutoRepository itemPedidoProdutoRepository) {
        this.itemPedidoProdutoRepository = itemPedidoProdutoRepository;
    }

    public void createItemPedidoProduto(ItemPedidoProdutoModel itemPedidoProduto) {
        itemPedidoProdutoRepository.createItemPedidoProduto(itemPedidoProduto);
    }

    public ItemPedidoProdutoModel getItemPedidoProdutoById(long id) {
        return itemPedidoProdutoRepository.getItemPedidoProdutoById(id);
    }

    public List<ItemPedidoProdutoModel> getAllItemPedidosProduto() {
        return itemPedidoProdutoRepository.getAllItemPedidosProduto();
    }

    public void updateItemPedidoProduto( ItemPedidoProdutoModel itemPedidoProduto) {
        itemPedidoProdutoRepository.updateItemPedidoProduto(itemPedidoProduto);
    }

    public void deleteItemPedidoProduto(long id) {
        itemPedidoProdutoRepository.deleteItemPedidoProduto(id);
    }
}