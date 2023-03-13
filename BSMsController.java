package com.bsmsgenerationbrasil.bsmsgenerationbrasil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms-generationbrasil")
public class BSMsController {

	@GetMapping
	public String bsmsgenerationbrasil() {
		return "Mentalidades"
				+ "Responsabilidade pessoal"
				+ " Mentalidade de crescimento"
				+ "Orientação ao Futuro"
				+ "Persistencia"
				+ "Habilidades Comportamentais"
				+ "Comunicação"
				+ "Orientação aos detalhes"
				+ "Trabalho em equipe"
				+ "Proatividade";
	}

}




