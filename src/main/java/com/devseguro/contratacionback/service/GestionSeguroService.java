package com.devseguro.contratacionback.service;


import com.devseguro.contratacionback.model.Vivienda;



public interface GestionSeguroService {
	
	public double calcularSeguro(Vivienda vivienda);
	public Vivienda getVivienda(Long codigo);
	public void setVivienda(Vivienda vivienda);
}
