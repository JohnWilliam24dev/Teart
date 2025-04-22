package com.duckers.teart.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.duckers.teart.entities.Servico;
import com.duckers.teart.models.ServicoModel;

public interface ServicoJPA extends JpaRepository<ServicoModel,Long> {

}
