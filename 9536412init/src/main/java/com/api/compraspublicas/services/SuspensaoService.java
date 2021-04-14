package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Suspensao;
import com.api.compraspublicas.repositories.SuspensaoRepository;

@Service
public class SuspensaoService {

	@Autowired
	private SuspensaoRepository repo;
	
	public Suspensao save(Suspensao obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Suspensao> suspensoes) {
		repo.saveAll(suspensoes);
	}
}
