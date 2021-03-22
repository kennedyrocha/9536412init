package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Inabilitado;

@Repository
public interface InabilitadoRepository extends JpaRepository<Inabilitado, Integer> {

}
