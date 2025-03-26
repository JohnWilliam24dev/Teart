package com.duckers.teart.repositories;
import java.util.List;
import com.duckers.teart.entities.ItemPedidoServico;
import com.duckers.teart.repositories.Interfaces.ItemPedidoServicoJPA;
import org.springframework.stereotype.Repository;

@Repository
public class ItemPedidoServicoRepository {
    private ItemPedidoServicoJPA itemPedidoServicoJPA;

    public ItemPedidoServicoRepository(ItemPedidoServicoJPA itemPedidoServicoJPA) {
        this.itemPedidoServicoJPA = itemPedidoServicoJPA;
    }

    public void createItemPedidoServico(ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoJPA.save(itemPedidoServico);
    }

    public ItemPedidoServico getItemPedidoServicoById(long id) {
        return itemPedidoServicoJPA.findById(id).get();
    }

    public List<ItemPedidoServico> getAllItemPedidosServico() {
        return itemPedidoServicoJPA.findAll();
    }

    public void deleteItemPedidoServico(long id) {
        itemPedidoServicoJPA.deleteById(id);
    }
}