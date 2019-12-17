package com.devseguro.contratacionback.service;

import com.devseguro.contratacionback.model.Vivienda;

public interface GestionSeguroService {
	
	public Vivienda read(Long codigo);
	public void create(Vivienda vivienda);
	
	public double calcularSeguro(Vivienda vivienda);

}
