package com.api.compraspublicas;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.compraspublicas.domain.Fornecedor;
import com.api.compraspublicas.domain.Licitacao;
import com.api.compraspublicas.domain.Requisicao;
import com.api.compraspublicas.repositories.FornecedorRepository;
import com.api.compraspublicas.repositories.LicitacaoRepository;
import com.api.compraspublicas.repositories.RequisicaoRepository;
import com.api.compraspublicas.services.FornecedorService;

@SpringBootApplication
public class ApiComprasPublicasApplication implements CommandLineRunner {

	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Autowired
	private LicitacaoRepository licitacaoRepository;

	@Autowired
	private RequisicaoRepository requisicaoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiComprasPublicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Fornecedor for1 = new Fornecedor(1, "05333533199", "Kennedy Oliveira");
		
		Requisicao req = new Requisicao(1, 2, 1);
		
		Licitacao lic1 = new Licitacao(1, 79517, "PE 17.05", "Prefeitura Municipal de Teutônia", req);
		Licitacao lic2 = new Licitacao(2, 79518, "1705 - 2", "Prefeitura Municipal de Teutônia", req);
		Licitacao lic3 = new Licitacao(3, 79531, "este sorteio desempate", "Prefeitura Municipal de Teutônia", req);
		
		req.getLicitacoes().addAll(Arrays.asList(lic1,lic2,lic3));
		
		fornecedorRepository.save(for1);
		requisicaoRepository.save(req);
		licitacaoRepository.saveAll(Arrays.asList(lic1, lic2, lic3));
		
	}
}
