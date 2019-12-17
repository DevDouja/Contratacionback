package com.devseguro.contratacionback.catastro.services;

import com.devseguro.contratacionback.catastro.models.Direccion;
import com.devseguro.contratacionback.catastro.models.Inmueble;

public interface CatastroServices {

	public Inmueble getInmueble(Direccion direccion);
	public String getProvencia(String codigoPostal);
	
}
