package com.duckers.teart.facades;

import com.duckers.teart.applications.PedidoApplication;
import com.duckers.teart.entities.Pedido;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PedidoFacade {
    private PedidoApplication pedidoApplication;

    public PedidoFacade(PedidoApplication pedidoApplication) {
        this.pedidoApplication = pedidoApplication;
    }

    public void cadastrar(Pedido pedido) {
        pedidoApplication.createPedido(pedido);
    }

    public void atualizar(long id, Pedido pedido) {
        pedidoApplication.updatePedido(id, pedido);
    }

    public List<Pedido> pedidosList() {
        return pedidoApplication.getAllPedidos();
    }

    public Pedido buscarPedidoPorId(long id) {
        return pedidoApplication.getPedidoById(id);
    }

    public void excluir(long id) {
        pedidoApplication.deletePedido(id);
    }
}