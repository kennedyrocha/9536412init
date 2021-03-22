package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Reabilitacao;

@Repository
public interface ReabilitacaoRepository extends JpaRepository<Reabilitacao, Integer> {

}
