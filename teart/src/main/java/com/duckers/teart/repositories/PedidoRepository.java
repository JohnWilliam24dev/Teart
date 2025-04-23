package com.duckers.teart.repositories;

import java.util.List;

import com.duckers.teart.models.PedidoModel;
import com.duckers.teart.repositories.interfaces.PedidoJPA;

import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepository {
    private PedidoJPA pedidoJPA;

    public PedidoRepository(PedidoJPA pedidoJPA) {
        this.pedidoJPA = pedidoJPA;
    }

    public void createPedido(PedidoModel pedido) {
        pedidoJPA.save(pedido);
    }

    public PedidoModel getPedidoById(long id) {
        return pedidoJPA.findById(id).get();
    }

    public List<PedidoModel> getAllPedidos() {
        return pedidoJPA.findAll();
    }

    public void updatePedido(PedidoModel pedido) {
        this.pedidoJPA.save(pedido);
    }

    public void deletePedido(long id) {
        pedidoJPA.deleteById(id);
    }
}