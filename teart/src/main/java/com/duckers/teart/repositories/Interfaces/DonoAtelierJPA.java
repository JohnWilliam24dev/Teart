package com.duckers.teart.repositories.Interfaces;

import com.duckers.teart.entities.DonoAtelier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoAtelierJPA extends JpaRepository<DonoAtelier, Long> {
}
