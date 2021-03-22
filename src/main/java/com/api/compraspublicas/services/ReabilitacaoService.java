package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Fornecedor;
import com.api.compraspublicas.domain.Reabilitacao;
import com.api.compraspublicas.repositories.ReabilitacaoRepository;

@Service
public class ReabilitacaoService {

	@Autowired
	private ReabilitacaoRepository repo;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@Autowired
	private ItemService itemService;
	
	public Reabilitacao save(Reabilitacao obj) {
		
		if (fornecedorService.findByIdExterno(obj.getIdFornecedor()) == null
				&& obj.getIdFornecedor() != null) {
			obj.setFornecedor(fornecedorService.save(new Fornecedor(null, obj.getIdFornecedor(), null, obj.getTipo())));
		}
		else {
			obj.setFornecedor(fornecedorService.findByIdExterno(obj.getIdFornecedor()));
		}
		
		if(obj.getIdItem() != null) {
			obj.setItem(itemService.findByIdItem(obj.getIdItem()));
		}
		
		return repo.save(obj);
	}
	
	public void saveAll(List<Reabilitacao> reabilitacoes) {
		
		for (Reabilitacao rea : reabilitacoes) {
			this.save(rea);
		}
	}
}
