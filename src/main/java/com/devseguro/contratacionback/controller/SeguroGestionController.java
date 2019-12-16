package com.devseguro.contratacionback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devseguro.contratacionback.model.Vivienda;
import com.devseguro.contratacionback.service.GestionSeguroService;

@RestController
@CrossOrigin
public class SeguroGestionController {

	@Autowired
	private GestionSeguroService gestionSeguroService;
	

	@GetMapping("vivienda/{codigo}")
	public Vivienda getVivienda(@PathVariable(value="codigo") Long codigo) {
		
		System.out.println("Codigo vivienda en Controller: "+ codigo);
		//return new Vivienda();
		
		return gestionSeguroService.getVivienda(codigo);
	}
	
	@PostMapping("/presupuesto")
	public double calcularSeguro(@RequestBody Vivienda vivienda) {
		System.out.println(vivienda);
		if(true) {
			gestionSeguroService.setVivienda(vivienda);
		}
		return gestionSeguroService.calcularSeguro(vivienda);
	}
	

}
