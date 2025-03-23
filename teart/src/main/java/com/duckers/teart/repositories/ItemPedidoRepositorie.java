package com.duckers.teart.repositories;
import com.duckers.teart.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepositorie extends JpaRepository<ItemPedido, Long> {

}
