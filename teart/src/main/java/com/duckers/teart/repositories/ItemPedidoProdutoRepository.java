package com.duckers.teart.repositories;

import java.util.List;
import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.models.ItemPedidoProdutoModel;
import com.duckers.teart.repositories.interfaces.ItemPedidoProdutoJPA;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class ItemPedidoProdutoRepository {
    private ItemPedidoProdutoJPA itemPedidoProdutoJPA;

    public ItemPedidoProdutoRepository(ItemPedidoProdutoJPA itemPedidoProdutoJPA) {
        this.itemPedidoProdutoJPA = itemPedidoProdutoJPA;
    }

    public void createItemPedidoProduto(ItemPedidoProdutoModel itemPedidoProduto) {
        itemPedidoProdutoJPA.save(itemPedidoProduto);
    }

    public ItemPedidoProdutoModel getItemPedidoProdutoById(long id) {
        return itemPedidoProdutoJPA.findById(id).get();
    }

    public List<ItemPedidoProdutoModel> getAllItemPedidosProduto() {
        return itemPedidoProdutoJPA.findAll();
    }

    public void updateItemPedidoProduto(ItemPedidoProdutoModel itemPedidoProduto) {
        this.itemPedidoProdutoJPA.save(itemPedidoProduto);
    }

    public void deleteItemPedidoProduto(long id) {
        itemPedidoProdutoJPA.deleteById(id);
    }
}