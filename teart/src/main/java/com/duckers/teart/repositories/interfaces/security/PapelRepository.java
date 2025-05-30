package com.duckers.teart.repositories.interfaces.security;

import com.duckers.teart.models.security.PapelModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelRepository extends JpaRepository<PapelModel, Long> {
}
