package com.duckers.teart.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duckers.teart.models.CompradorModel;

public interface CompradorJPA extends JpaRepository<CompradorModel,Long> {

}