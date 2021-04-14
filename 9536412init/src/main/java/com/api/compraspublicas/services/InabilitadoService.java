package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Fornecedor;
import com.api.compraspublicas.domain.Inabilitado;
import com.api.compraspublicas.repositories.InabilitadoRepository;

@Service
public class InabilitadoService {

	@Autowired
	private InabilitadoRepository repo;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@Autowired
	private ItemService itemService;
	
	public Inabilitado save(Inabilitado obj) {
		
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
	
	public void saveAll(List<Inabilitado> lances) {
		
		for (Inabilitado pro : lances) {
			this.save(pro);
		}
	}
}
