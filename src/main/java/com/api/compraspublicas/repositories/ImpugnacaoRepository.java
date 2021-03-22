package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Impugnacao;

@Repository
public interface ImpugnacaoRepository extends JpaRepository<Impugnacao, Integer> {

}
