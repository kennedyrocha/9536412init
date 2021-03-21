package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Lote;
import com.api.compraspublicas.repositories.LoteRepository;

@Service
public class LoteService {

	@Autowired
	private LoteRepository repo;
	
	public Lote save(Lote obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Lote> lotes) {
		
		repo.saveAll(lotes);
	}
}
