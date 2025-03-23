package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Pedido;
import com.duckers.teart.repositories.Interfaces.PedidoJPA;

import org.springframework.stereotype.Service;

@Service
public class PedidoApplication {
    private PedidoJPA pedidoRepositorie;

    public PedidoApplication(PedidoJPA pedidoRepositorie) {
        this.pedidoRepositorie = pedidoRepositorie;
    }

    public void createPedido(Pedido pedido) {
        pedidoRepositorie.save(pedido);
    }

    public Pedido getPedidoById(long id) {
        return pedidoRepositorie.findById(id).get();
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepositorie.findAll();
    }

    public void updatePedido(long id, Pedido pedidoAtualizado) {
        Pedido pedidoPersistido = getPedidoById(id);
        pedidoPersistido.setDataEnvio(pedidoAtualizado.getDataEnvio());
        pedidoPersistido.setStatusPedido(pedidoAtualizado.getStatusPedido());
        pedidoRepositorie.save(pedidoPersistido);
    }

    public void deletePedido(long id) {
        pedidoRepositorie.deleteById(id);
    }
}