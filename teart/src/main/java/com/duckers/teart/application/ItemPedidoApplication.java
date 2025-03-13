package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.ItemPedido;
import com.duckers.teart.repositorie.ItemPedidoRepositorie;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoApplication {
    private ItemPedidoRepositorie itemPedidoRepositorie;

    public ItemPedidoApplication(ItemPedidoRepositorie itemPedidoRepositorie) {
        this.itemPedidoRepositorie = itemPedidoRepositorie;
    }

    public void createItemPedido(ItemPedido itemPedido) {
        itemPedidoRepositorie.add(itemPedido);
    }

    public ItemPedido getItemPedidoById(int id) {
        return itemPedidoRepositorie.getItemPedidoById(id);
    }

    public List<ItemPedido> getAllItemPedidos() {
        return itemPedidoRepositorie.getItemPedidosList();
    }

    // a entidade ItemPedido nao possui atributos passiveis de update no Banco de Dados

    public void deleteItemPedido(int id) {
        itemPedidoRepositorie.remove(id);
    }
}