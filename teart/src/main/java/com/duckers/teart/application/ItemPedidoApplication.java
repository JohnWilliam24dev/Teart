package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.ItemPedido;
import com.duckers.teart.repositories.ItemPedidoRepositorie;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoApplication {
    private ItemPedidoRepositorie itemPedidoRepositorie;

    public ItemPedidoApplication(ItemPedidoRepositorie itemPedidoRepositorie) {
        this.itemPedidoRepositorie = itemPedidoRepositorie;
    }

    public void createItemPedido(ItemPedido itemPedido) {
        itemPedidoRepositorie.save(itemPedido);
    }

    public ItemPedido getItemPedidoById(long id) {
        return itemPedidoRepositorie.findById(id).get();
    }

    public List<ItemPedido> getAllItemPedidos() {
        return itemPedidoRepositorie.findAll();
    }

    // a entidade ItemPedido nao possui atributos passiveis de update no Banco de Dados

    public void deleteItemPedido(long id) {
        itemPedidoRepositorie.deleteById(id);
    }
}