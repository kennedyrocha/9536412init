package com.api.compraspublicas.services.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.domain.Erro;
import com.api.compraspublicas.services.ErroService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DetalheLicitacaoRest {
	
	@Autowired
	private ErroService erroService;
	
	private final RestTemplate restTemplate;
	
	public DetalheLicitacaoRest(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public DetalheLicitacao getDetalheLicitacao(Integer idLicitacao) {
		
		String url = "http://apipcp.portaldecompraspublicas.com.br/publico/obterProcesso?publicKey=b85e2ec7688890d166d6547258c7d249&idLicitacao=" + idLicitacao + "&fbclid=IwAR3j-7bVbbmFSAQhijXO9t278gqpwu_YT2ADUHo2PnUHP7u6I3G_2gDVkJk";

		try {
			ResponseEntity<DetalheLicitacao> response = this.restTemplate.getForEntity(url, DetalheLicitacao.class);
			
			if (response.getStatusCode() == HttpStatus.OK) {
				return response.getBody();
			}
			else {
				return null;
			}
		}
		catch(HttpClientErrorException e) {
			
			if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				
				ObjectMapper mapper = new ObjectMapper();
				
				try {
					Erro erro = mapper.readValue(e.getResponseBodyAsString(), Erro.class);
					erroService.save(erro);
					return null;
				}
				catch (Exception ex) {
					return null;
				}
			}
			else {
				return null;
			}
		}
	}
}
