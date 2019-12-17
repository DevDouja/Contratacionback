package com.devseguro.contratacionback.catastro.models;

public class Direccion {
	
	private String codigoPostal;
	private String poblacion;
	private String provincia;
	private String tipoVia;
	private String nombre;		// Nuestro servicio dummy se basa en la inicial para entregar un inmueble
	private int numero;
	private int escalera;
	private int piso;
	private int puerta;

	public Direccion() {
		
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEscalera() {
		return escalera;
	}

	public void setEscalera(int escalera) {
		this.escalera = escalera;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getPuerta() {
		return puerta;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}
	
	


}
