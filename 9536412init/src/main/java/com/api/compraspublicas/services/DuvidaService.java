package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Duvida;
import com.api.compraspublicas.repositories.DuvidaRepository;

@Service
public class DuvidaService {

	@Autowired
	private DuvidaRepository repo;
	
	public Duvida save(Duvida obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Duvida> objs) {
		repo.saveAll(objs);
	}
}
