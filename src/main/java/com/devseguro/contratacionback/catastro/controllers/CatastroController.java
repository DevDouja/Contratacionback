package com.devseguro.contratacionback.catastro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devseguro.contratacionback.catastro.models.Direccion;
import com.devseguro.contratacionback.catastro.models.Inmueble;
import com.devseguro.contratacionback.catastro.services.CatastroServices;

@RestController
@CrossOrigin
@RequestMapping("/catastro")
public class CatastroController {

	@Autowired
	private CatastroServices catastroServices;
	
	@GetMapping(value="/inmuebles", 
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
	public Inmueble getInmueble(@RequestBody Direccion direccion) {
	
		return catastroServices.getInmueble(direccion);
	}
	
	@GetMapping(value="/provencias/{codigoPostal}")
	public String getProvencia(@PathVariable(value="codigoPostal")String codigoPostal) {
		return catastroServices.getProvencia(codigoPostal);
	}
	
}
