package com.api.compraspublicas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.services.DetalheLicitacaService;
import com.api.compraspublicas.services.rest.DetalheLicitacaoRest;

@RestController
@RequestMapping(value="/detalhelicitacao")
public class DetalheLicitacaoResource {

	@Autowired
	private DetalheLicitacaService service;
	
	@Autowired
	private DetalheLicitacaoRest rest;

	@RequestMapping(value="/{idLicitacao}", method=RequestMethod.GET)
	public String consultar(@PathVariable Integer idLicitacao) {

		DetalheLicitacao detalhe;
		
		try {
			detalhe = rest.getDetalheLicitacao(idLicitacao);//117495
		}
		catch (Exception e) {
			return e.getMessage();
		}
		
		return service.save(detalhe);
	}
}
