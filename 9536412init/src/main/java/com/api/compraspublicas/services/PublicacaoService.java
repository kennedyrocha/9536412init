package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Publicacao;
import com.api.compraspublicas.repositories.PublicacaoRepository;

@Service
public class PublicacaoService {

	@Autowired
	private PublicacaoRepository repo;
	
	public Publicacao save(Publicacao obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Publicacao> publicacoes) {
		repo.saveAll(publicacoes);
	}
}
