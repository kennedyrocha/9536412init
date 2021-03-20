package com.api.compraspublicas.services.rest;

import org.springframework.stereotype.Service;

@Service
public class JsonValidation {

	public String removeInvalidWords(String obj) {
		
		obj = obj.replace("NUMERO", "numero");
		
		return obj;
	}
}
