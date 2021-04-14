package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Fornecedor;
import com.api.compraspublicas.domain.Vencedor;
import com.api.compraspublicas.repositories.VencedorRepository;

@Service
public class VencedorService {

	@Autowired
	private VencedorRepository repo;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@Autowired
	private ItemService itemService;
	
	public Vencedor save(Vencedor obj) {
		
		if (fornecedorService.findByIdExterno(obj.getIdFornecedor()) == null
				&& obj.getIdFornecedor() != null) {
			obj.setFornecedor(fornecedorService.save(new Fornecedor(null, obj.getIdFornecedor(), obj.getRazaoSocial(), obj.getTipo())));
		}
		else {
			Fornecedor forncec = fornecedorService.findByIdExterno(obj.getIdFornecedor());
			
			if (forncec != null && forncec.getNome() == null) {
				forncec.setNome(obj.getRazaoSocial());
				fornecedorService.update(forncec);
			}
			
			obj.setFornecedor(fornecedorService.findByIdExterno(obj.getIdFornecedor()));
		}
		
		if(obj.getIdItem() != null) {
			obj.setItem(itemService.findByIdItem(obj.getIdItem()));
		}
		
		return repo.save(obj);
	}
	
	public void saveAll(List<Vencedor> vencedores) {
		
		for (Vencedor pro : vencedores) {
			this.save(pro);
		}
	}
}
