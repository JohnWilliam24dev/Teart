package com.duckers.teart.repositories;
import com.duckers.teart.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorie extends JpaRepository<Pedido, Long> {

}