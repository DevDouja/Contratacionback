package com.devseguro.contratacionback.catastro.models;

import java.util.Date;

public class Inmueble {
	
	private String numeroCatastro;
	private double superficie;
	private Date fechaConstruccion;
	private Direccion direccion;
	
	public Inmueble() {
		
	}
	
	public Inmueble(String numeroCatastro, double superficie, Date fechaConstruccion, Direccion direccion) {
		this.numeroCatastro = numeroCatastro;
		this.superficie = superficie;
		this.fechaConstruccion = fechaConstruccion;
		this.direccion = direccion;
	}

	public String getNumeroCatastro() {
		return numeroCatastro;
	}

	public void setNumeroCatastro(String numeroCatastro) {
		this.numeroCatastro = numeroCatastro;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public Date getFechaConstruccion() {
		return fechaConstruccion;
	}

	public void setFechaConstruccion(Date fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Inmueble [numeroCatastro=" + numeroCatastro + ", superficie=" + superficie + ", fechaConstruccion="
				+ fechaConstruccion + ", direccion=" + direccion + "]";
	}
	
}


