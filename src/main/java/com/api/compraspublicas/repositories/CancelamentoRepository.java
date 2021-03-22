package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Cancelamento;

@Repository
public interface CancelamentoRepository extends JpaRepository<Cancelamento, Integer> {

}
