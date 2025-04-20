package com.duckers.teart.facades;

import com.duckers.teart.applications.ItemPedidoProdutoApplication;
import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.models.ItemPedidoProdutoModel;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ItemPedidoProdutoFacade {
    private ItemPedidoProdutoApplication itemPedidoProdutoApplication;

    public ItemPedidoProdutoFacade(ItemPedidoProdutoApplication itemPedidoProdutoApplication) {
        this.itemPedidoProdutoApplication = itemPedidoProdutoApplication;
    }

    public void cadastrar(ItemPedidoProdutoModel itemPedidoProduto) {
        itemPedidoProdutoApplication.createItemPedidoProduto(itemPedidoProduto);
    }

    public void atualizar(ItemPedidoProdutoModel itemPedidoProduto) {
        itemPedidoProdutoApplication.updateItemPedidoProduto(itemPedidoProduto);
    }

    public List<ItemPedidoProdutoModel> itemPedidosProdutoList() {
        return itemPedidoProdutoApplication.getAllItemPedidosProduto();
    }

    public ItemPedidoProdutoModel buscarItemPedidoProdutoPorId(long id) {
        return itemPedidoProdutoApplication.getItemPedidoProdutoById(id);
    }

    public void excluir(long id) {
        itemPedidoProdutoApplication.deleteItemPedidoProduto(id);
    }
}