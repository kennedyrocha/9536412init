package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Revogacao;
import com.api.compraspublicas.repositories.RevogacaoRepository;

@Service
public class RevogacaoService {

	@Autowired
	private RevogacaoRepository repo;
	
	public Revogacao save(Revogacao obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Revogacao> revogacoes) {
		repo.saveAll(revogacoes);
	}
}
