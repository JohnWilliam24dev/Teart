package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.models.PedidoModel;
import com.duckers.teart.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoApplication {
    private PedidoRepository pedidoRepository;

    public PedidoApplication(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void createPedido(PedidoModel pedido) {
        pedidoRepository.createPedido(pedido);
    }

    public PedidoModel getPedidoById(long id) {
        return pedidoRepository.getPedidoById(id);
    }

    public List<PedidoModel> getAllPedidos() {
        return pedidoRepository.getAllPedidos();
    }

    public void updatePedido(PedidoModel pedido) {
        pedidoRepository.updatePedido(pedido);
    }

    public void deletePedido(long id) {
        pedidoRepository.deletePedido(id);
    }
}