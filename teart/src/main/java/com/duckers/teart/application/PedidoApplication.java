package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Pedido;
import com.duckers.teart.repositories.origin.PedidoRepositorie;
import org.springframework.stereotype.Service;

@Service
public class PedidoApplication {
    private PedidoRepositorie pedidoRepositorie;

    public PedidoApplication(PedidoRepositorie pedidoRepositorie) {
        this.pedidoRepositorie = pedidoRepositorie;
    }

    public void createPedido(Pedido pedido) {
        pedidoRepositorie.add(pedido);
    }

    public Pedido getPedidoById(int id) {
        return pedidoRepositorie.getPedidoById(id);
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepositorie.getPedidoList();
    }

    public void updatePedido(int id, Pedido pedido) {
        pedidoRepositorie.update(id, pedido);
    }

    public void deletePedido(int id) {
        pedidoRepositorie.remove(id);
    }
}