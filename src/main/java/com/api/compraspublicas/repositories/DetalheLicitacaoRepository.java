package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api.compraspublicas.domain.DetalheLicitacao;

@Repository
public interface DetalheLicitacaoRepository extends JpaRepository<DetalheLicitacao, Integer> {

	@Transactional
	DetalheLicitacao findByIdLicitacao(Integer idLicitacao);
}
