package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Reinicio;
import com.api.compraspublicas.repositories.ReinicioRepository;

@Service
public class ReinicioService {

	@Autowired
	private ReinicioRepository repo;
	
	public Reinicio save(Reinicio obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Reinicio> reinicios) {
		repo.saveAll(reinicios);
	}
}
