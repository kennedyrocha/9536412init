package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.MensagemPregoeiro;
import com.api.compraspublicas.repositories.MensagemPregoeiroRepository;

@Service
public class MensagemPregoeiroService {

	@Autowired
	private MensagemPregoeiroRepository repo;
	
	public MensagemPregoeiro save(MensagemPregoeiro obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<MensagemPregoeiro> mensagensPregoeiro) {
		repo.saveAll(mensagensPregoeiro);
	}
}
