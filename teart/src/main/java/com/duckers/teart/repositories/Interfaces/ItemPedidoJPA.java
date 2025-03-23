package com.duckers.teart.repositories.Interfaces;
import com.duckers.teart.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoJPA extends JpaRepository<ItemPedido, Long> {

}
