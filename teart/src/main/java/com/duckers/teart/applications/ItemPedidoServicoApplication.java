package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.entities.ItemPedidoServico;
import com.duckers.teart.repositories.ItemPedidoServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoServicoApplication {
    private final ItemPedidoServicoRepository itemPedidoServicoRepository;

    public ItemPedidoServicoApplication(ItemPedidoServicoRepository itemPedidoServicoRepository) {
        this.itemPedidoServicoRepository = itemPedidoServicoRepository;
    }

    public void createItemPedidoServico(ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoRepository.createItemPedidoServico(itemPedidoServico);
    }

    public ItemPedidoServico getItemPedidoServicoById(long id) {
        return itemPedidoServicoRepository.getItemPedidoServicoById(id);
    }

    public List<ItemPedidoServico> getAllItemPedidosServico() {
        return itemPedidoServicoRepository.getAllItemPedidosServico();
    }

    public void updateItemPedidoServico(ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoRepository.updateItemPedidoServico( itemPedidoServico);
    }

    public void deleteItemPedidoServico(long id) {
        itemPedidoServicoRepository.deleteItemPedidoServico(id);
    }
}