package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Republicacao;
import com.api.compraspublicas.repositories.RepublicacaoRepository;

@Service
public class RepublicacaoService {

	@Autowired
	private RepublicacaoRepository repo;
	
	public Republicacao save(Republicacao obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Republicacao> republicacoes) {
		repo.saveAll(republicacoes);
	}
}
