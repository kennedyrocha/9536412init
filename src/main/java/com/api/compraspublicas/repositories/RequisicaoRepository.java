package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Requisicao;

@Repository
public interface RequisicaoRepository extends JpaRepository<Requisicao, Integer> {

}
