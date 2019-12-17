package com.devseguro.contratacionback.catastro.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="INMUEBLES")
public class Inmueble {
	
	@Id
	private String numeroCatastro;
	
	private double superficie;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ANYO_CONSTRUCCION")
	private Date anyoConstruccion;
	
	private double continente;
	
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "address_id", referencedColumnName = "codigo")
	private Direccion direccion;
	
	
	public Inmueble() {}

	/* Getters,Setters AND ToString */
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public Date getAnyoConstruccion() {
		return anyoConstruccion;
	}

	public void setAnyoConstruccion(Date anyoConstruccion) {
		this.anyoConstruccion = anyoConstruccion;
	}

	public double getContinente() {
		return continente;
	}

	public void setContinente(double continente) {
		this.continente = continente;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Catastro [codigo=" + codigo + ", superficie=" + superficie + ", anyoConstruccion=" + anyoConstruccion
				+ ", continente=" + continente + ", direccion=" + direccion + "]";
	}
}


