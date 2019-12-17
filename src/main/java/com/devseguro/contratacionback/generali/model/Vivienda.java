package com.devseguro.contratacionback.generali.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vivienda implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long codigo;
	private String relacion;
	private String uso;
	private String tipo;
	private String tipoConstruccion;
	private double superficieConstruida;
	private Date anyoConstruccion;
	private Long ResidentesHabituales;
	private String ubicacion;
	private String codigoPostal;
	private String poblacion;
	private boolean puertaBlindad;
	private boolean rejas;
	private boolean alarma;
	private double contienente;
	private double contenido;
	private List<String> coberturas = new ArrayList<String>();
	
	public Vivienda() {
		System.out.println("Soy vivienda");
	}
	
	public Vivienda(Long código, String relacion, String uso, String tipo, String tipoConstruccion,
			double superficieConstruida, Date anyoConstruccion, Long residentesHabituales, String ubicacion,
			boolean puertaBlindad, boolean rejas, boolean alarma, double contienente, double contenido) {
		super();
		this.codigo = código;
		this.relacion = relacion;
		this.uso = uso;
		this.tipo = tipo;
		this.tipoConstruccion = tipoConstruccion;
		this.superficieConstruida = superficieConstruida;
		this.anyoConstruccion = anyoConstruccion;
		ResidentesHabituales = residentesHabituales;
		this.ubicacion = ubicacion;
		this.puertaBlindad = puertaBlindad;
		this.rejas = rejas;
		this.alarma = alarma;
		this.contienente = contienente;
		this.contenido = contenido;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoConstruccion() {
		return tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public double getSuperficieConstruida() {
		return superficieConstruida;
	}

	public void setSuperficieConstruida(double superficieConstruida) {
		this.superficieConstruida = superficieConstruida;
	}

	public Date getAnyoConstruccion() {
		return anyoConstruccion;
	}

	public void setAnyoConstruccion(Date anyoConstruccion) {
		this.anyoConstruccion = anyoConstruccion;
	}

	public Long getResidentesHabituales() {
		return ResidentesHabituales;
	}

	public void setResidentesHabituales(Long residentesHabituales) {
		ResidentesHabituales = residentesHabituales;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
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

	public boolean isPuertaBlindad() {
		return puertaBlindad;
	}

	public void setPuertaBlindad(boolean puertaBlindad) {
		this.puertaBlindad = puertaBlindad;
	}

	public boolean isRejas() {
		return rejas;
	}

	public void setRejas(boolean rejas) {
		this.rejas = rejas;
	}

	public boolean isAlarma() {
		return alarma;
	}

	public void setAlarma(boolean alarma) {
		this.alarma = alarma;
	}

	public double getContienente() {
		return contienente;
	}

	public void setContienente(double contienente) {
		this.contienente = contienente;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}

	public List<String> getCoberturas() {
		return coberturas;
	}

	public void setCoberturas(List<String> coberturas) {
		this.coberturas = coberturas;
	}

	@Override
	public String toString() {
		return "Vivienda [codigo=" + codigo + ", relacion=" + relacion + ", uso=" + uso + ", tipo=" + tipo
				+ ", tipoConstruccion=" + tipoConstruccion + ", superficieConstruida=" + superficieConstruida
				+ ", anyoConstruccion=" + anyoConstruccion + ", ResidentesHabituales=" + ResidentesHabituales
				+ ", ubicacion=" + ubicacion + ", codigoPostal=" + codigoPostal + ", poblacion=" + poblacion
				+ ", puertaBlindad=" + puertaBlindad + ", rejas=" + rejas + ", alarma=" + alarma + ", contienente="
				+ contienente + ", contenido=" + contenido + ", coberturas=" + coberturas + "]";
	}
	
}
