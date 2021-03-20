package com.api.compraspublicas.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.repositories.DetalheLicitacaoRepository;

public class DetalheLicitacaService {

	@Autowired
	private DetalheLicitacaoRepository repo;
	
	public DetalheLicitacao save(DetalheLicitacao obj) {
		
		DetalheLicitacao detalhe = repo.findByIdLicitacao(obj.getIdLicitacao());
		
		if (detalhe != null) {
			return detalhe;
		}
		else {
			return repo.save(obj);
		}
	}
}
