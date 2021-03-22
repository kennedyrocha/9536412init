package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Reversao;
import com.api.compraspublicas.repositories.ReversaoRepository;

@Service
public class ReversaoService {

	@Autowired
	private ReversaoRepository repo;

	@Autowired
	private ItemService itemService;
	
	public Reversao save(Reversao obj) {
		
		if(obj.getIdItem() != null) {
			obj.setItem(itemService.findByIdItem(obj.getIdItem()));
		}
		
		return repo.save(obj);
	}
	
	public void saveAll(List<Reversao> reversoes) {
		
		for (Reversao rev : reversoes) {
			this.save(rev);
		}
	}
}
