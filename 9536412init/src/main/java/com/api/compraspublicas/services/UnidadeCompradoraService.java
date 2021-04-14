package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.UnidadeCompradora;
import com.api.compraspublicas.repositories.UnidadeCompradoraRepository;

@Service
public class UnidadeCompradoraService {

	@Autowired
	private UnidadeCompradoraRepository repo;
	
	public UnidadeCompradora save(UnidadeCompradora obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<UnidadeCompradora> unidades) {
		repo.saveAll(unidades);
	}
}
