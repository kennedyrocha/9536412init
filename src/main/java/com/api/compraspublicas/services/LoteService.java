package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Item;
import com.api.compraspublicas.domain.Lote;
import com.api.compraspublicas.repositories.LoteRepository;

@Service
public class LoteService {

	@Autowired
	private LoteRepository repo;
	
	@Autowired
	private ItemService itemService;
	
	public Lote save(Lote obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Lote> lotes) {
		
		for (Lote l : lotes) {
			for (Item item : l.getItens()) {
				item.setLote(l);
			}
		}
		repo.saveAll(lotes);

		for (Lote l : lotes) {
			itemService.saveAll(l.getItens());
		}
	}
}
