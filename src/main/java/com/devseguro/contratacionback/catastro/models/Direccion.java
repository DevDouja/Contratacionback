package com.devseguro.contratacionback.catastro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity
//@Table(name = "DIRECCIONES")
public class Direccion {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "codigo")
	private Long codigo;
	
	private String poblacion;
	
	private String provincia;
	
	//@Column(name = "tIPO_VIA")
	private String tipoVia;
	
	private String nombre;
	
	private int numero;
	
	private int escalera;
	
	private int piso;
	
	private int puerta;
	private String codigoPostal;
	
	//@OneToOne(mappedBy = "DIRECCIONES")
	private Inmueble catastro;
	public Direccion() {}
	public Direccion(Long codigo, String poblacion, String provincia, String tipoVia, String nombre, int numero,
			int escalera, int piso, int puerta, String codigoPostal, Inmueble catastro) {
		super();
		this.codigo = codigo;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.tipoVia = tipoVia;
		this.nombre = nombre;
		this.numero = numero;
		this.escalera = escalera;
		this.piso = piso;
		this.puerta = puerta;
		this.codigoPostal = codigoPostal;
		this.catastro = catastro;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public Inmueble getCatastro() {
		return catastro;
	}
	public void setCatastro(Inmueble catastro) {
		this.catastro = catastro;
	}
	@Override
	public String toString() {
		return "Direccion [codigo=" + codigo + ", poblacion=" + poblacion + ", provincia=" + provincia + ", tipoVia="
				+ tipoVia + ", nombre=" + nombre + ", numero=" + numero + ", escalera=" + escalera + ", piso=" + piso
				+ ", puerta=" + puerta + ", codigoPostal=" + codigoPostal + ", catastro=" + catastro + "]";
	}
}
