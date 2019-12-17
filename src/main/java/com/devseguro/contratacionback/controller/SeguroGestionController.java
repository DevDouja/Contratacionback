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
	
	@GetMapping("/vivienda/{codigo}")
	public Vivienda getVivienda(@PathVariable(value="codigo") Long codigo) throws Exception {
		
		System.out.println("Codigo vivienda en Controller: "+ codigo);
		Vivienda vivienda;
		try {
			 vivienda = gestionSeguroService.read(codigo);
		} catch (Exception e) {
			System.out.println("*******hello");
			throw new Exception("La que vivienda no existe");
		}
		
		System.out.println(vivienda);
		return gestionSeguroService.read(codigo);
	}

	@PostMapping("/vivienda")
	public Vivienda setVivienda(@RequestBody Vivienda vivienda) throws Exception {
		
		System.out.println(vivienda);
		gestionSeguroService.create(vivienda);
		
		return this.getVivienda(vivienda.getCodigo());	
	}
	
	@PostMapping("/presupuesto")
	public double calcularSeguro(@RequestBody Vivienda vivienda) {
		
		System.out.println(vivienda);
		
		return gestionSeguroService.calcularSeguro(vivienda);
	}
}
