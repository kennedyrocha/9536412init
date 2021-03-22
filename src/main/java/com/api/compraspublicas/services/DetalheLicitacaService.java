package com.api.compraspublicas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.compraspublicas.domain.Cancelamento;
import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.domain.Duvida;
import com.api.compraspublicas.domain.Encerramento;
import com.api.compraspublicas.domain.Impugnacao;
import com.api.compraspublicas.domain.Lote;
import com.api.compraspublicas.domain.MensagemChat;
import com.api.compraspublicas.domain.MensagemPregoeiro;
import com.api.compraspublicas.domain.Notificacao;
import com.api.compraspublicas.domain.Publicacao;
import com.api.compraspublicas.domain.Reinicio;
import com.api.compraspublicas.domain.Republicacao;
import com.api.compraspublicas.domain.Revogacao;
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
	
	@Autowired
	private CancelamentoService cancelamentoService;
	
	@Autowired
	private PublicacaoService publicacaoService;
	
	@Autowired
	private RepublicacaoService republicacaoService;
	
	@Autowired
	private ReinicioService reinicioService;
	
	@Autowired
	private RevogacaoService revogacaoService;
	
	@Autowired
	private EncerramentoService encerramentoService;
	
	@Autowired
	private NotificacaoService notificacaoService;
	
	@Autowired
	private DuvidaService duvidaService;
	
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
			for (Cancelamento canc : obj.getCancelamentos()) {
				canc.setDetalheLicitacao(obj);
			}
			for (Publicacao publ : obj.getPublicacoes()) {
				publ.setDetalheLicitacao(obj);
			}
			for (Republicacao publ : obj.getRepublicacoes()) {
				publ.setDetalheLicitacao(obj);
			}
			for (Reinicio publ : obj.getReinicios()) {
				publ.setDetalheLicitacao(obj);
			}
			for (Revogacao publ : obj.getRevogacoes()) {
				publ.setDetalheLicitacao(obj);
			}
			for (Encerramento publ : obj.getEncerramentos()) {
				publ.setDetalheLicitacao(obj);
			}
			for (Notificacao publ : obj.getNotificacoes()) {
				publ.setDetalheLicitacao(obj);
			}
			for (Duvida publ : obj.getDuvidas()) {
				publ.setDetalheLicitacao(obj);
			}
			
			repo.save(obj);
			
			loteService.saveAll(obj.getLotes());
			mensagemPregoeiroService.saveAll(obj.getMensagensPregoeiro());
			mensagemChatService.saveAll(obj.getMensagensChat());
			impugnacaoService.saveAll(obj.getImpugnacoes());
			suspensaoService.saveAll(obj.getSuspensoes());
			cancelamentoService.saveAll(obj.getCancelamentos());
			publicacaoService.saveAll(obj.getPublicacoes());
			republicacaoService.saveAll(obj.getRepublicacoes());
			reinicioService.saveAll(obj.getReinicios());
			revogacaoService.saveAll(obj.getRevogacoes());
			encerramentoService.saveAll(obj.getEncerramentos());
			notificacaoService.saveAll(obj.getNotificacoes());
			duvidaService.saveAll(obj.getDuvidas());
			
			return obj;
		}
	}
}
