package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Fornecedor;
import com.api.compraspublicas.domain.Lance;
import com.api.compraspublicas.repositories.LanceRepository;

@Service
public class LanceService {

	@Autowired
	private LanceRepository repo;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	public Lance save(Lance obj) {
		
		if (fornecedorService.findByIdExterno(obj.getIdFornecedor()) == null
				&& obj.getIdFornecedor() != null) {
			obj.setFornecedor(fornecedorService.save(new Fornecedor(null, obj.getIdFornecedor(), null, obj.getTipo())));
		}
		else {
			obj.setFornecedor(fornecedorService.findByIdExterno(obj.getIdFornecedor()));
		}
		
		return repo.save(obj);
	}
	
	public void saveAll(List<Lance> lances) {
		
		for (Lance pro : lances) {
			this.save(pro);
		}
	}
}
