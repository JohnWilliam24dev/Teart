package com.duckers.teart.repositories.interfaces;

import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.models.DonoAtelierModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DonoAtelierJPA extends JpaRepository<DonoAtelierModel, Long> {
}
