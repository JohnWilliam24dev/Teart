package com.duckers.teart.facades;

import com.duckers.teart.applications.ItemPedidoServicoApplication;
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

    public void atualizar(ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoApplication.updateItemPedidoServico(itemPedidoServico);
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