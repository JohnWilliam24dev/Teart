package com.duckers.teart.repositories;

import com.duckers.teart.entities.DonoAtelier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoAtelierRepositorie extends JpaRepository<DonoAtelier, Long> {
}
