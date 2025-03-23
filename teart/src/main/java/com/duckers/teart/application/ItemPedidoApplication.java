package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.ItemPedido;
import com.duckers.teart.repositories.ItemPedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoApplication {
    private ItemPedidoRepository itemPedidoRepositorie ;

    public ItemPedidoApplication(ItemPedidoRepository itemPedidoRepositorie) {
        this.itemPedidoRepositorie = itemPedidoRepositorie;
    }

    public void createItemPedido(ItemPedido itemPedido) {
        itemPedidoRepositorie.createItemPedido(itemPedido);
    }

    public ItemPedido getItemPedidoById(long id) {
        return itemPedidoRepositorie.getItemPedidoById(id);
    }

    public List<ItemPedido> getAllItemPedidos() {
        return itemPedidoRepositorie.getAllItemPedidos();
    }

    public void deleteItemPedido(long id) {
        itemPedidoRepositorie.deleteItemPedido(id);
    }
}