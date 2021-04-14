package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Fornecedor;
import com.api.compraspublicas.domain.Proposta;
import com.api.compraspublicas.repositories.PropostaRepository;

@Service
public class PropostaService {

	@Autowired
	private PropostaRepository repo;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	public Proposta save(Proposta obj) {
		
		if (fornecedorService.findByIdExterno(obj.getIdFornecedor()) == null
				&& obj.getIdFornecedor() != null) {
			obj.setFornecedor(fornecedorService.save(new Fornecedor(null, obj.getIdFornecedor(), null, obj.getTipo())));
		}
		else {
			obj.setFornecedor(fornecedorService.findByIdExterno(obj.getIdFornecedor()));
		}
		
		return repo.save(obj);
	}
	
	public void saveAll(List<Proposta> propostas) {
		
		for (Proposta pro : propostas) {
			this.save(pro);
		}
	}
}
