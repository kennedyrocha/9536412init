package com.api.compraspublicas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.compraspublicas.domain.DetalheLicitacao;
import com.api.compraspublicas.repositories.DetalheLicitacaoRepository;
import com.api.compraspublicas.services.rest.DetalheLicitacaoRest;

@SpringBootApplication
public class ApiComprasPublicasApplication implements CommandLineRunner {

	@Autowired
	private DetalheLicitacaoRest rest;
	
	@Autowired
	private DetalheLicitacaoRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiComprasPublicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Fornecedor for1 = new Fornecedor(1, "05333533199", "Kennedy Oliveira");
		
		Requisicao req = new Requisicao(1, 2, 1);
		
		Licitacao lic1 = new Licitacao(1, 79517, "PE 17.05", "Prefeitura Municipal de Teutônia", req);
		Licitacao lic2 = new Licitacao(2, 79518, "1705 - 2", "Prefeitura Municipal de Teutônia", req);
		Licitacao lic3 = new Licitacao(3, 79531, "este sorteio desempate", "Prefeitura Municipal de Teutônia", req);
		
		req.getLicitacoes().addAll(Arrays.asList(lic1,lic2,lic3));
		
		fornecedorRepository.save(for1);
		requisicaoRepository.save(req);
		licitacaoRepository.saveAll(Arrays.asList(lic1, lic2, lic3));*/
		System.out.println("Esse foi");
		DetalheLicitacao detalhe = rest.getDetalheLicitacao(117495);
		repo.save(detalhe);
		
	}
}
