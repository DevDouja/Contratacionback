package com.devseguro.contratacionback.generali.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devseguro.contratacionback.generali.model.Vivienda;
import com.devseguro.contratacionback.generali.service.GestionSeguroService;

@RestController
@CrossOrigin
public class SeguroGestionController {

	@Autowired
	private GestionSeguroService gestionSeguroService;
	
	@PostMapping("/presupuesto")
	public double calcularSeguro(@RequestBody Vivienda vivienda) {
		
		System.out.println(vivienda);
		
		return gestionSeguroService.calcularSeguro(vivienda);
	}
}
