package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Pedido;
import com.duckers.teart.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoApplication {
    private PedidoRepository pedidoRepositorie;

    public PedidoApplication(PedidoRepository pedidoRepositorie) {
        this.pedidoRepositorie = pedidoRepositorie;
    }

    public void createPedido(Pedido pedido) {
        pedidoRepositorie.createPedido(pedido);
    }

    public Pedido getPedidoById(long id) {
        return pedidoRepositorie.getPedidoById(id);
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepositorie.getAllPedidos();
    }

    public void updatePedido(long id, Pedido pedido) {
        pedidoRepositorie.updatePedido(id, pedido);
    }

    public void deletePedido(long id) {
        pedidoRepositorie.deletePedido(id);
    }
}