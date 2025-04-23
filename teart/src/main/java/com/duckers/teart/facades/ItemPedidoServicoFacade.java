package com.duckers.teart.facades;

import com.duckers.teart.applications.ItemPedidoServicoApplication;

import com.duckers.teart.models.ItemPedidoServicoModel;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ItemPedidoServicoFacade {
    private ItemPedidoServicoApplication itemPedidoServicoApplication;

    public ItemPedidoServicoFacade(ItemPedidoServicoApplication itemPedidoServicoApplication) {
        this.itemPedidoServicoApplication = itemPedidoServicoApplication;
    }

    public void cadastrar(ItemPedidoServicoModel itemPedidoServico) {
        itemPedidoServicoApplication.createItemPedidoServico(itemPedidoServico);
    }

    public void atualizar(ItemPedidoServicoModel itemPedidoServico) {
        itemPedidoServicoApplication.updateItemPedidoServico(itemPedidoServico);
    }

    public List<ItemPedidoServicoModel> itemPedidosServicoList() {
        return itemPedidoServicoApplication.getAllItemPedidosServico();
    }

    public ItemPedidoServicoModel buscarItemPedidoServicoPorId(long id) {
        return itemPedidoServicoApplication.getItemPedidoServicoById(id);
    }

    public void excluir(long id) {
        itemPedidoServicoApplication.deleteItemPedidoServico(id);
    }
}