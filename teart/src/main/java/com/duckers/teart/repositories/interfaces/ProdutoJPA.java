package com.duckers.teart.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duckers.teart.models.ProdutoModel;

public interface ProdutoJPA extends JpaRepository<ProdutoModel, Long> {

}