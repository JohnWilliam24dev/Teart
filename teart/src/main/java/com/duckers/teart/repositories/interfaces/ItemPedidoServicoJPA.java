package com.duckers.teart.repositories.interfaces;

import com.duckers.teart.entities.ItemPedidoServico;
import com.duckers.teart.models.ItemPedidoServicoModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoServicoJPA extends JpaRepository<ItemPedidoServicoModel, Long> {

}
