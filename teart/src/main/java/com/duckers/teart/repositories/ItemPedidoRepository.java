package com.duckers.teart.repositories;
import java.util.List;
import com.duckers.teart.entities.ItemPedido;
import com.duckers.teart.repositories.Interfaces.ItemPedidoJPA;
import org.springframework.stereotype.Repository;

@Repository
public class ItemPedidoRepository {
    private ItemPedidoJPA itemPedidoJPA;

    public ItemPedidoRepository(ItemPedidoJPA itemPedidoJPA) {
        this.itemPedidoJPA = itemPedidoJPA;
    }

    public void createItemPedido(ItemPedido itemPedido) {
        itemPedidoJPA.save(itemPedido);
    }

    public ItemPedido getItemPedidoById(long id) {
        return itemPedidoJPA.findById(id).get();
    }

    public List<ItemPedido> getAllItemPedidos() {
        return itemPedidoJPA.findAll();
    }

    // a entidade ItemPedido nao possui atributos passiveis de update no Banco de Dados

    public void deleteItemPedido(long id) {
        itemPedidoJPA.deleteById(id);
    }
}