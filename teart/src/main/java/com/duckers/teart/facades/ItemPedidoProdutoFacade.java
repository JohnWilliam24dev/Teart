package com.duckers.teart.facades;

import com.duckers.teart.applications.ItemPedidoProdutoApplication;
import com.duckers.teart.entities.ItemPedidoProduto;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ItemPedidoProdutoFacade {
    private ItemPedidoProdutoApplication itemPedidoProdutoApplication;

    public ItemPedidoProdutoFacade(ItemPedidoProdutoApplication itemPedidoProdutoApplication) {
        this.itemPedidoProdutoApplication = itemPedidoProdutoApplication;
    }

    public void cadastrar(ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoApplication.createItemPedidoProduto(itemPedidoProduto);
    }

    public void atualizar(ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoApplication.updateItemPedidoProduto(itemPedidoProduto);
    }

    public List<ItemPedidoProduto> itemPedidosProdutoList() {
        return itemPedidoProdutoApplication.getAllItemPedidosProduto();
    }

    public ItemPedidoProduto buscarItemPedidoProdutoPorId(long id) {
        return itemPedidoProdutoApplication.getItemPedidoProdutoById(id);
    }

    public void excluir(long id) {
        itemPedidoProdutoApplication.deleteItemPedidoProduto(id);
    }
}