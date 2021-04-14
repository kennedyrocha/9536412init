package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.MensagemChat;
import com.api.compraspublicas.repositories.MensagemChatRepository;

@Service
public class MensagemChatService {

	@Autowired
	private MensagemChatRepository repo;
	
	public MensagemChat save(MensagemChat obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void saveAll(List<MensagemChat> mensagensChat) {
		repo.saveAll(mensagensChat);
	}
}
