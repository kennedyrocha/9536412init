package com.api.compraspublicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Impugnacao;
import com.api.compraspublicas.repositories.ImpugnacaoRepository;

@Service
public class ImpugnacaoService {

	@Autowired
	private ImpugnacaoRepository repo;
	
	public Impugnacao save(Impugnacao obj) {

		obj.getImpugnante().setImpugnacao(obj);
		return repo.save(obj);
	}
	
	public void saveAll(List<Impugnacao> impugnacoes) {
		for (Impugnacao imp : impugnacoes) {
			this.save(imp);
		}
	}
}
