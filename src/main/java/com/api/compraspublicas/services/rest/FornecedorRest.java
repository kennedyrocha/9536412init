package com.api.compraspublicas.services.rest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.api.compraspublicas.domain.Erro;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FornecedorRest {

	private final RestTemplate restTemplate;
	
	public FornecedorRest(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public Erro getErroWithResponseHandling() {
		
		String url = "http://apipcp.portaldecompraspublicas.com.br/publico/processosFornecedor/?publicKey=b85e2ec7688890d166d6547258c7d249&idFornecedor=30729998000120&tipoFornecedor=2";

		try {
			ResponseEntity<Erro> response = this.restTemplate.getForEntity(url, Erro.class);
			
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
					return erro;
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
