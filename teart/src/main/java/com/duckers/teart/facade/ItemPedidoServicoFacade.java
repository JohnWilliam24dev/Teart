package com.duckers.teart.facade;
import com.duckers.teart.application.ItemPedidoServicoApplication;
import com.duckers.teart.entities.ItemPedidoServico;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ItemPedidoServicoFacade {
    private ItemPedidoServicoApplication itemPedidoServicoApplication;

    public ItemPedidoServicoFacade(ItemPedidoServicoApplication itemPedidoServicoApplication) {
        this.itemPedidoServicoApplication = itemPedidoServicoApplication;
    }

    public void cadastrar(ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoApplication.createItemPedidoServico(itemPedidoServico);
    }

    public List<ItemPedidoServico> itemPedidosServicoList() {
        return itemPedidoServicoApplication.getAllItemPedidosServico();
    }

    public ItemPedidoServico buscarItemPedidoServicoPorId(long id) {
        return itemPedidoServicoApplication.getItemPedidoServicoById(id);
    }

    public void excluir(long id) {
        itemPedidoServicoApplication.deleteItemPedidoServico(id);
    }
}