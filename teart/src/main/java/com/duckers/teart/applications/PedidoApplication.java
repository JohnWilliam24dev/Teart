package com.duckers.teart.applications;
import java.util.List;
import com.duckers.teart.entities.Pedido;
import com.duckers.teart.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoApplication {
    private PedidoRepository pedidoRepository;

    public PedidoApplication(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void createPedido(Pedido pedido) {
        pedidoRepository.createPedido(pedido);
    }

    public Pedido getPedidoById(long id) {
        return pedidoRepository.getPedidoById(id);
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.getAllPedidos();
    }

    public void updatePedido(Pedido pedido) {
        pedidoRepository.updatePedido(pedido);
    }

    public void deletePedido(long id) {
        pedidoRepository.deletePedido(id);
    }
}