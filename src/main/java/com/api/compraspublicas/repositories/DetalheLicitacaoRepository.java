package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.DetalheLicitacao;

@Repository
public interface DetalheLicitacaoRepository extends JpaRepository<DetalheLicitacao, Integer> {

	DetalheLicitacao findByIdLicitacao(Integer idLicitacao);
}
