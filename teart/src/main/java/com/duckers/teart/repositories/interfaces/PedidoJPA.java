package com.duckers.teart.repositories.interfaces;

import com.duckers.teart.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoJPA extends JpaRepository<Pedido, Long> {

}