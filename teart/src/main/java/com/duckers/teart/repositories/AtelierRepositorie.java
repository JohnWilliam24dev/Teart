package com.duckers.teart.repositories;

import com.duckers.teart.entities.Atelier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtelierRepositorie extends JpaRepository<Atelier, Long> {
}
