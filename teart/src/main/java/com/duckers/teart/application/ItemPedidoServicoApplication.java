package com.duckers.teart.application;
import java.util.List;

import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.entities.ItemPedidoServico;
import com.duckers.teart.repositories.ItemPedidoServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoServicoApplication {
    private final ItemPedidoServicoRepository itemPedidoServicoRepository;
    private ItemPedidoServicoRepository itemPedidoServicoRepositorie;

    public ItemPedidoServicoApplication(ItemPedidoServicoRepository itemPedidoServicoRepositorie, ItemPedidoServicoRepository itemPedidoServicoRepository) {
        this.itemPedidoServicoRepositorie = itemPedidoServicoRepositorie;
        this.itemPedidoServicoRepository = itemPedidoServicoRepository;
    }

    public void createItemPedidoServico(ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoRepositorie.createItemPedidoServico(itemPedidoServico);
    }

    public ItemPedidoServico getItemPedidoServicoById(long id) {
        return itemPedidoServicoRepositorie.getItemPedidoServicoById(id);
    }

    public List<ItemPedidoServico> getAllItemPedidosServico() {
        return itemPedidoServicoRepositorie.getAllItemPedidosServico();
    }

    public void updateItemPedidoServico(long id, ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoRepository.updateItemPedidoServico(id, itemPedidoServico);
    }

    public void deleteItemPedidoServico(long id) {
        itemPedidoServicoRepositorie.deleteItemPedidoServico(id);
    }
}