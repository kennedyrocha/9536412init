package com.api.compraspublicas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.domain.Lote;
import com.api.compraspublicas.domain.MensagemPregoeiro;
import com.api.compraspublicas.repositories.DetalheLicitacaoRepository;

@Service
public class DetalheLicitacaService {

	@Autowired
	private DetalheLicitacaoRepository repo;
	
	@Autowired
	private LoteService loteService;
	
	@Autowired
	private MensagemPregoeiroService mensagemPregoeiroService;
	
	public DetalheLicitacao save(DetalheLicitacao obj) {
		
		DetalheLicitacao detalhe = repo.findByIdLicitacao(obj.getIdLicitacao());
		
		if (detalhe != null) {
			return detalhe;
		}
		else {
			for (Lote lote : obj.getLotes()) {
				lote.setDetalheLicitacao(obj);
			}
			for (MensagemPregoeiro men : obj.getMensagensPregoeiro()) {
				men.setDetalheLicitacao(obj);
			}
			repo.save(obj);
			loteService.saveAll(obj.getLotes());
			mensagemPregoeiroService.saveAll(obj.getMensagensPregoeiro());
			return obj;
		}
	}
}
