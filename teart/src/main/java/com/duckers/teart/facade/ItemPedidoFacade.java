package com.duckers.teart.facade;
import com.duckers.teart.application.ItemPedidoApplication;
import com.duckers.teart.entities.ItemPedido;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ItemPedidoFacade {
    private ItemPedidoApplication itemPedidoApplication;

    public ItemPedidoFacade(ItemPedidoApplication itemPedidoApplication) {
        this.itemPedidoApplication = itemPedidoApplication;
    }

    public void cadastrar(ItemPedido itemPedido) {
        itemPedidoApplication.createItemPedido(itemPedido);
    }

    // a entidade ItemPedido nao possui atributos passiveis de update no Banco de Dados

    public List<ItemPedido> itemPedidosList() {
        return itemPedidoApplication.getAllItemPedidos();
    }

    public ItemPedido buscarItemPedidoPorId(long id) {
        return itemPedidoApplication.getItemPedidoById(id);
    }

    public void excluir(long id) {
        itemPedidoApplication.deleteItemPedido(id);
    }
}