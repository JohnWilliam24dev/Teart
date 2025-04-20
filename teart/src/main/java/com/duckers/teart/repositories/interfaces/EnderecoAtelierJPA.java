package com.duckers.teart.repositories.interfaces;

import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.models.EnderecoAtelierModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoAtelierJPA extends JpaRepository<EnderecoAtelierModel, Long> {
}
