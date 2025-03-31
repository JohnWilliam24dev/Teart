package com.duckers.teart.repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.duckers.teart.entities.Produto;

public interface ProdutoJPA extends JpaRepository<Produto, Long> {

}