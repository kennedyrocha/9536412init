package com.api.compraspublicas.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.compraspublicas.domain.*;

@RestController
@RequestMapping(value="/fornecedores")
public class FornecedorResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Fornecedor> listar() {
		
		Fornecedor for1 = new Fornecedor(1, "30729998000120", "Teste 1");
		Fornecedor for2 = new Fornecedor(2, "30729998000120", "Teste 2");
		
		List<Fornecedor> lista = new ArrayList<>();
		lista.add(for1);
		lista.add(for2);
		
		return lista;
	}
}