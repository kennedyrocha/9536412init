package com.api.compraspublicas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.domain.Licitacao;
import com.api.compraspublicas.services.DetalheLicitacaService;
import com.api.compraspublicas.services.rest.DetalheLicitacaoRest;
import com.api.compraspublicas.services.rest.FornecedorRest;

@RestController
@RequestMapping(value="/fornecedores")
public class FornecedorResource {
	
	@Autowired
	FornecedorRest rest;

	@Autowired
	private DetalheLicitacaService service;
	
	@Autowired
	private DetalheLicitacaoRest restDetalhe;
	
	private String resposta = null;

	@RequestMapping(value="/{idFornecedor}/{tipoForncedor}", method=RequestMethod.GET)
	public String listar(@PathVariable String idFornecedor, @PathVariable Integer tipoForncedor) {
		
		List<Licitacao> licitacoes;
		
		try {
			licitacoes = rest.getLicitacaoPorFornecedor(idFornecedor, tipoForncedor, resposta);
			
			if (licitacoes != null) {
				
				resposta = "Econtrado " + licitacoes.size() + " licitações para o fornecedor " + idFornecedor + "!\n";
				
				for (Licitacao lic : licitacoes) {
					
					resposta =  resposta + " Consultando licitação " + lic.getIdLicitacao() + "!\n";
					
					DetalheLicitacao detalhe;
					
					try {
						detalhe = restDetalhe.getDetalheLicitacao(lic.getIdLicitacao());//117495
						resposta = resposta + service.save(detalhe) + "\n";
					}
					catch (Exception e) {
						resposta = resposta + e.getMessage() + "\n";
					}
				}
				
				return resposta;
			}
			else {
				String msg = rest.getResposta();
				return msg;
			}
		}
		catch (Exception e){
			return e.getMessage();
		}
	}
}