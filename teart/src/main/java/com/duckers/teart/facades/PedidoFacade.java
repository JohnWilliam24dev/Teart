package com.duckers.teart.facades;

import com.duckers.teart.applications.PedidoApplication;

import com.duckers.teart.models.PedidoModel;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PedidoFacade {
    private PedidoApplication pedidoApplication;

    public PedidoFacade(PedidoApplication pedidoApplication) {
        this.pedidoApplication = pedidoApplication;
    }

    public void cadastrar(PedidoModel pedido) {
        pedidoApplication.createPedido(pedido);
    }

    public void atualizar(PedidoModel pedido) {
        pedidoApplication.updatePedido(pedido);
    }

    public List<PedidoModel> pedidosList() {
        return pedidoApplication.getAllPedidos();
    }

    public PedidoModel buscarPedidoPorId(long id) {
        return pedidoApplication.getPedidoById(id);
    }

    public void excluir(long id) {
        pedidoApplication.deletePedido(id);
    }
}