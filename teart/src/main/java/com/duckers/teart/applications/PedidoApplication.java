package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.entities.Pedido;
import com.duckers.teart.entities.mapper.DataMapper;
import com.duckers.teart.models.PedidoModel;
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
        //Pedido entity= DataMapper.toEntity(pedido);
        //entity.validation();
        //regras de negocio instanciadas aqui
        //PedidoModel model=DataMapper.toModel(entity);
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