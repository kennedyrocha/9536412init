package com.api.compraspublicas.services.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${default.publicKey}")
	private String publicKey;
	
	@Value("${default.fbclid}")
	private String fbclid;
	
	@Value("${default.url.obterProcesso}")
	private String urlObterProcesso;
	
	private final RestTemplate restTemplate;
	
	public DetalheLicitacaoRest(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public DetalheLicitacao getDetalheLicitacao(Integer idLicitacao) {
		
		String url = this.urlObterProcesso + "?publicKey=" + this.publicKey + "&idLicitacao=" + idLicitacao + "&fbclid=" + this.fbclid;

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
