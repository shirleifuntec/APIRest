package Funtec.meuprimeirowebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemvindoController {
	
	@GetMapping
	public String Bemvindo() {
		
		return "Bem vindo ao meu primeiro Spring Boot Web API";
	}
	





}
