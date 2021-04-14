package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Cancelamento;
import com.api.compraspublicas.repositories.CancelamentoRepository;

@Service
public class CancelamentoService {

	@Autowired
	private CancelamentoRepository repo;
	
	public Cancelamento save(Cancelamento obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Cancelamento> cancelamentos) {
		repo.saveAll(cancelamentos);
	}
}
