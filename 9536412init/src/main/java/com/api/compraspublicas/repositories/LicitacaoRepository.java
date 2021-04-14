package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Licitacao;

@Repository
public interface LicitacaoRepository extends JpaRepository<Licitacao, Integer> {

}
