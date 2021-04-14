package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Notificacao;
import com.api.compraspublicas.repositories.NotificacaoRepository;

@Service
public class NotificacaoService {

	@Autowired
	private NotificacaoRepository repo;
	
	public Notificacao save(Notificacao obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<Notificacao> objs) {
		repo.saveAll(objs);
	}
}
