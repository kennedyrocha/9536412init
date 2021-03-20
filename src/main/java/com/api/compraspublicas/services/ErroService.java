package com.api.compraspublicas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Erro;
import com.api.compraspublicas.repositories.ErroRepository;

@Service
public class ErroService {
	
	@Autowired
	private ErroRepository repo;
	
	public Erro save(Erro obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}

}
