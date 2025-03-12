package com.duckers.teart.repositorie;
import com.duckers.teart.entities.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoRepositorie {
    List<Pedido> pedidos = new ArrayList<>();

    public Pedido getPedidoById(int id) {
        return pedidos.stream().filter(pedido -> pedido.getId() == id).findFirst().orElse(null);
    }

    public void add(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void remove(int id) {
        Pedido pedido = getPedidoById(id);
        if (!pedido.equals(null))
            pedidos.remove(pedido);
    }

    public void update(int id, Pedido pedidoUpdate){
        Pedido pedido  = getPedidoById(id);
        pedido.setDataEnvio(pedidoUpdate.getDataEnvio());
        pedido.setFormaPagamento(pedidoUpdate.getFormaPagamento());
        pedido.setStatusPedido(pedido.getStatusPedido());
    }

    public List<Pedido> getPedidoList() {
        return pedidos;
    }
}
