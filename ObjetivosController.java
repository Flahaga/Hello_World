package com.objetivosdeaprendizagem.objetivosdeaprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosde-aprendizagem")
public class ObjetivosController {

	@GetMapping
	public String objetivosdeaprendizagem() {
		return "Objetivos de Aprendizagem"
				+ "Praticar"
				+ " Ver vídeos"
				+ "Ver a documentação";
				
	 }
				 
}			
		        
		     
		
				




				
				
	




