package com.api.compraspublicas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.domain.Impugnacao;
import com.api.compraspublicas.domain.Lote;
import com.api.compraspublicas.domain.MensagemChat;
import com.api.compraspublicas.domain.MensagemPregoeiro;
import com.api.compraspublicas.domain.Suspensao;
import com.api.compraspublicas.repositories.DetalheLicitacaoRepository;

@Service
public class DetalheLicitacaService {

	@Autowired
	private DetalheLicitacaoRepository repo;
	
	@Autowired
	private LoteService loteService;
	
	@Autowired
	private MensagemPregoeiroService mensagemPregoeiroService;
	
	@Autowired
	private MensagemChatService mensagemChatService;
	
	@Autowired
	private ImpugnacaoService impugnacaoService;
	
	@Autowired
	private SuspensaoService suspensaoService;
	
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
			for (MensagemChat cha : obj.getMensagensChat()) {
				cha.setDetalheLicitacao(obj);
			}
			for (Impugnacao imp : obj.getImpugnacoes()) {
				imp.setDetalheLicitacao(obj);
			}
			for (Suspensao susp : obj.getSuspensoes()) {
				susp.setDetalheLicitacao(obj);
			}
			
			repo.save(obj);
			
			loteService.saveAll(obj.getLotes());
			mensagemPregoeiroService.saveAll(obj.getMensagensPregoeiro());
			mensagemChatService.saveAll(obj.getMensagensChat());
			impugnacaoService.saveAll(obj.getImpugnacoes());
			suspensaoService.saveAll(obj.getSuspensoes());
			
			return obj;
		}
	}
}
