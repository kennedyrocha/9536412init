package com.api.compraspublicas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Requisicao;
import com.api.compraspublicas.repositories.RequisicaoRepository;

@Service
public class RequisicaoService {

	@Autowired
	private RequisicaoRepository repo;
	
	public Requisicao insert(Requisicao obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
}
