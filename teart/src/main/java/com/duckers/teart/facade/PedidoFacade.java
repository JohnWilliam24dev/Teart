package com.duckers.teart.facade;
import com.duckers.teart.application.PedidoApplication;
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

    public void atualizar(int id, Pedido pedido) {
        pedidoApplication.updatePedido(id, pedido);
    }

    public List<Pedido> pedidosList() {
        return pedidoApplication.getAllPedidos();
    }

    public Pedido buscarPedidoPorId(int id) {
        return pedidoApplication.getPedidoById(id);
    }

    public void excluir(int id) {
        pedidoApplication.deletePedido(id);
    }
}