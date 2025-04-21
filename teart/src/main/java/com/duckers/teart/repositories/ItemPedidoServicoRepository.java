package com.duckers.teart.repositories;

import java.util.List;
import com.duckers.teart.entities.ItemPedidoServico;
import com.duckers.teart.models.ItemPedidoServicoModel;
import com.duckers.teart.repositories.interfaces.ItemPedidoServicoJPA;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class ItemPedidoServicoRepository {
    private ItemPedidoServicoJPA itemPedidoServicoJPA;

    public ItemPedidoServicoRepository(ItemPedidoServicoJPA itemPedidoServicoJPA) {
        this.itemPedidoServicoJPA = itemPedidoServicoJPA;
    }

    public void createItemPedidoServico(ItemPedidoServicoModel itemPedidoServico) {
        itemPedidoServicoJPA.save(itemPedidoServico);
    }

    public ItemPedidoServicoModel getItemPedidoServicoById(long id) {
        return itemPedidoServicoJPA.findById(id).get();
    }

    public List<ItemPedidoServicoModel> getAllItemPedidosServico() {
        return itemPedidoServicoJPA.findAll();
    }

    public void updateItemPedidoServico(ItemPedidoServicoModel itemPedidoServico) {
        this.itemPedidoServicoJPA.save(itemPedidoServico);
    }

    public void deleteItemPedidoServico(long id) {
        itemPedidoServicoJPA.deleteById(id);
    }
}