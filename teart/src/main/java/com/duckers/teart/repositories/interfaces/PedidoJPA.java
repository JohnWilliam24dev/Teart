package com.duckers.teart.repositories.interfaces;


import com.duckers.teart.models.PedidoModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoJPA extends JpaRepository<PedidoModel, Long> {

}