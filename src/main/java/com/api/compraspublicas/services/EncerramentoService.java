package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Encerramento;
import com.api.compraspublicas.repositories.EncerramentoRepository;

@Service
public class EncerramentoService {

	@Autowired
	private EncerramentoRepository repo;
	
	public Encerramento save(Encerramento obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Encerramento> objs) {
		repo.saveAll(objs);
	}
}
