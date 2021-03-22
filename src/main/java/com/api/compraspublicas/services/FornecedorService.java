package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Fornecedor;
import com.api.compraspublicas.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository repo;
	
	public List<Fornecedor> findAll(){
		
		return repo.findAll();
	}
	
	public Fornecedor save(Fornecedor obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Fornecedor findByIdExterno(String idExterno) {
		return repo.findByIdExterno(idExterno);
	}
	
	public Fornecedor update(Fornecedor obj) {
		return repo.save(obj);
	}
}
