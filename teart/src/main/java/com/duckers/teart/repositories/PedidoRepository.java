package com.duckers.teart.repositories;

import java.util.List;
import com.duckers.teart.entities.Pedido;
import com.duckers.teart.repositories.interfaces.PedidoJPA;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepository {
    private PedidoJPA pedidoJPA;

    public PedidoRepository(PedidoJPA pedidoJPA) {
        this.pedidoJPA = pedidoJPA;
    }

    public void createPedido(Pedido pedido) {
        pedidoJPA.save(pedido);
    }

    public Pedido getPedidoById(long id) {
        return pedidoJPA.findById(id).get();
    }

    public List<Pedido> getAllPedidos() {
        return pedidoJPA.findAll();
    }

    public void updatePedido(long id, Pedido pedidoAtualizado) {
        Pedido pedidoPersistido = this.pedidoJPA.findById(id).get();
        BeanUtils.copyProperties(pedidoAtualizado, pedidoPersistido, "id");
        this.pedidoJPA.save(pedidoPersistido);
    }

    public void deletePedido(long id) {
        pedidoJPA.deleteById(id);
    }
}