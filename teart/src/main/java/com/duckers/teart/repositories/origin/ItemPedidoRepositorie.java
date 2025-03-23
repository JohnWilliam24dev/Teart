package com.duckers.teart.repositories.origin;
import com.duckers.teart.entities.ItemPedido;
import java.util.ArrayList;
import java.util.List;

public class ItemPedidoRepositorie {
    List<ItemPedido> itemPedidos = new ArrayList<>();

    public ItemPedido getItemPedidoById(int id) {
        return itemPedidos.stream().filter(itemPedido -> itemPedido.getId() == id).findFirst().orElse(null);
    }

    public void add(ItemPedido itemPedido) {
        itemPedidos.add(itemPedido);
    }

    public void remove(int id) {
        ItemPedido itemPedido = getItemPedidoById(id);
        if (!itemPedido.equals(null))
            itemPedidos.remove(itemPedido);
    }

    // a entidade ItemPedido nao possui atributos passiveis de update no Banco de Dados

    public List<ItemPedido> getItemPedidosList() {
        return itemPedidos;
    }
}
