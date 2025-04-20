package com.duckers.teart.repositories.interfaces;

import com.duckers.teart.entities.Atelier;
import com.duckers.teart.models.AtelierModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AtelierJPA extends JpaRepository<AtelierModel, Long> {
}
