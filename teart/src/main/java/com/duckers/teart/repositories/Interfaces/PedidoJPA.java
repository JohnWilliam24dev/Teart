package com.duckers.teart.repositories.Interfaces;
import com.duckers.teart.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoJPA extends JpaRepository<Pedido, Long> {

}