package com.duckers.teart.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duckers.teart.entities.Usuario;

@Repository
public interface UsuarioRepositorie extends JpaRepository<Usuario,Long> {

}
