package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.ItemPedidoServico;
import com.duckers.teart.repositories.ItemPedidoServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoServicoApplication {
    private ItemPedidoServicoRepository itemPedidoServicoRepositorie;

    public ItemPedidoServicoApplication(ItemPedidoServicoRepository itemPedidoServicoRepositorie) {
        this.itemPedidoServicoRepositorie = itemPedidoServicoRepositorie;
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

    public void deleteItemPedidoServico(long id) {
        itemPedidoServicoRepositorie.deleteItemPedidoServico(id);
    }
}