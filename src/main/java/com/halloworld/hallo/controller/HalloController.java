package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/raiz")
public class HalloController {
	
	@GetMapping("/rota1")
	public String atividade1() {
		return "Persistencia, orientação ao futuro";
	}
	
	@GetMapping("/rota2")
	public String atividade2() {
		return " Crescer mentalmente ";
	}
	

}
