package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Impugnante;
import com.api.compraspublicas.repositories.ImpugnanteRepository;

@Service
public class ImpugnanteService {

	@Autowired
	private ImpugnanteRepository repo;
	
	public Impugnante save(Impugnante obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Impugnante> impugnantes) {
		repo.saveAll(impugnantes);
	}
}
