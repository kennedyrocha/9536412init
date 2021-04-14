package com.api.compraspublicas.services.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.api.compraspublicas.domain.Licitacao;

@Service
public class FornecedorRest {

	private final RestTemplate restTemplate;
	
	@Value("${default.publicKey}")
	private String publicKey;
	
	@Value("${default.fbclid}")
	private String fbclid;
	
	@Value("${default.url.processosFornecedor}")
	private String urlProcessosFornecedor;
	
	private String resposta;
	
	private ResponseEntity<Licitacao[]> response;
	
	public FornecedorRest(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public List<Licitacao> getLicitacaoPorFornecedor(String idFornecedor, Integer tipoFornecedor, String mensagem) {
		
		String url = this.urlProcessosFornecedor + "/?publicKey=" + this.publicKey + "&idFornecedor=" + idFornecedor + "&tipoFornecedor=" + tipoFornecedor;

		try {
			response = this.restTemplate.getForEntity(url, Licitacao[].class);
			
			if (response.getStatusCode() == HttpStatus.OK) {
				return new ArrayList<Licitacao>(Arrays.asList(response.getBody()));
			}
			else {
				return null;
			}
		}
		catch(HttpClientErrorException e) {			
			mensagem = e.getMessage();
			this.resposta = mensagem + " \n url: " + url;
			return null;
		}
	}
	
	public String getResposta() {
		return this.resposta;
	}
}
