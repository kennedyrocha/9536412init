package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Item;
import com.api.compraspublicas.domain.Lance;
import com.api.compraspublicas.domain.Proposta;
import com.api.compraspublicas.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;
	
	@Autowired
	private PropostaService propostaService;
	
	@Autowired
	private LanceService lanceService;
	
	public Item save(Item obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Item> itens) {

		for (Item it : itens) {
			for (Proposta pro : it.getPropostas()) {
				
				pro.setItem(it);
			}
			for (Lance la : it.getLances()) {
				la.setItem(it);
			}
		}
		repo.saveAll(itens);
		
		for (Item it : itens) {
			propostaService.saveAll(it.getPropostas());
			lanceService.saveAll(it.getLances());
		}
	}
}
