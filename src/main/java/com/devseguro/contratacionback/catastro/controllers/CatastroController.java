package com.devseguro.contratacionback.catastro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devseguro.contratacionback.catastro.services.CatastroServices;

@RestController
@CrossOrigin
@RequestMapping("/catastro")
public class CatastroController {

	@Autowired
	private CatastroServices catastroServices;
	
	// TODO end-points aquí...
}
