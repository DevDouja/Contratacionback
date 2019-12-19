package com.devseguro.contratacionback.generali.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.devseguro.contratacionback.generali.model.Vivienda;
import com.devseguro.contratacionback.generali.service.GestionSeguroService;

@Service
public class GestionSeguroServiceImpl  implements GestionSeguroService{
	
	private static final double BASE = 100;
	private static final Map<String, Double> RELACION = new HashMap<String, Double>();
	private static final Map<String, Double> USO = new HashMap<String, Double>();
	private static final Map<String, Double> TIPOVIVIENDA = new HashMap<String, Double>();
	private static final Map<String, Double> TIPOCONSTRUCCION = new HashMap<String, Double>();
	private static final Map<String, Double> UBICACION = new HashMap<String, Double>();
	private static final Map<String, Double> COBERTURAS = new HashMap<String, Double>();
	
	static {
		
		/* relación de la vivienda con el tomador*/
		RELACION.put("propietario", 0.4);
		RELACION.put("inquilino", 0.3);
		RELACION.put("otros", 0.2);
		
		/* usa de la vivienda */
		USO.put("habitual", 0.4);
		USO.put("secundaria", 0.3);
		USO.put("alquiler", 0.2);
		USO.put("vacacional", 0.3);
		USO.put("desocupada", 0.3);
		USO.put("otros", 0.2);
		
		/* tipo de vivienda */
		TIPOVIVIENDA.put("pisoAlto", 0.3);
		TIPOVIVIENDA.put("pisoBajo", 0.4);
		TIPOVIVIENDA.put("unifamiliarAdosado", 0.2);
		TIPOVIVIENDA.put("unifamiliarIndependiente", 0.4);
		TIPOVIVIENDA.put("otros", 0.2);
		
		/* tipoConstruccion */ 
		TIPOCONSTRUCCION.put("vigasMadera", 0.4);
		TIPOCONSTRUCCION.put("vigasMetal", 0.3);
		TIPOCONSTRUCCION.put("otros", 0.2);
		
		/* UBICACION */
		UBICACION.put("urbano", 0.3);
		UBICACION.put("urbanizaciones", 0.3);
		UBICACION.put("despoblado", 0.2); 
		UBICACION.put("otros", 0.2); 
		
		/*Coberturas*/
		
		COBERTURAS.put("Robo", 5.0);
		COBERTURAS.put("danyoAgua", 5.0);
		COBERTURAS.put("riesgoAccidental", 15.0);
		COBERTURAS.put("asistencia", 20.0);
		COBERTURAS.put("hurto", 5.0);
		COBERTURAS.put("defensa", 20.0);
		COBERTURAS.put("meteorologicos", 20.0);
		COBERTURAS.put("responsabilidadCivil ", 10.0);
		COBERTURAS.put("Incendio", 20.0);
		COBERTURAS.put("DanyosConsecuenciales ", 10.0);
		COBERTURAS.put("otros ", 30.0);
	
	}
	
	@Override
	public double calcularSeguro(Vivienda vivienda) {
		
		List<String> coberturasModules = vivienda.getCoberturas();
		
		LocalDate diaActual = LocalDate.now();
		LocalDate fechaConstruccion = vivienda.getAnyoConstruccion().toInstant().
				atZone(ZoneId.systemDefault()).toLocalDate(); 
		/*SuperficieConstruida */
		double superficieImporte = vivienda.getSuperficieConstruida()*0.1;
		
		/*anyoConstruccion*/
		long antiguedad = ChronoUnit.YEARS.between(fechaConstruccion, diaActual);
		System.out.println(antiguedad);
		
		double anyoConstruccionImporte;
		
		if(antiguedad < 10) {
			
			anyoConstruccionImporte = 0.1;
			
		}else if(antiguedad <20){
			
			anyoConstruccionImporte = 0.2;
			
		}else{
			
			anyoConstruccionImporte = 0.3;
		}
		
		/*residentesHabituales*/
		double residentesHabitualesImporte = vivienda.getResidentesHabituales()*8;
		
		/*protección*/
		
		double proteccionImporte = 0.0;
		if(vivienda.isPuertaBlindad()) {
			proteccionImporte = -0.05;
		}
		
		if(vivienda.isRejas()) {
			proteccionImporte += -0.05;
		}
		
		if(vivienda.isAlarma()) {
			proteccionImporte = -0.05;
		}
		
		double contienenteImporte = vivienda.getContenido()*0.005;
		double contenidoImporte = vivienda.getContenido()*0.005;
		
		double coberturasImporte = 0.0;
		for(String key: coberturasModules) {
			
			if(!COBERTURAS.containsKey(key)) {
				coberturasImporte +=COBERTURAS.get("otros");
			}else {
				coberturasImporte += COBERTURAS.get(key);
			}
			
		}
		System.out.println("coberturasImporte: "+coberturasImporte);
		
	
		/*double presupuesto = RELACION.get(vivienda.getRelacion())*BASE+
							 USO.get(vivienda.getUso())*BASE+
							 TIPOVIVIENDA.get(vivienda.getTipo())*BASE;
							/* TIPOCONSTRUCCION.get(vivienda.getTipoConstruccion())*BASE;
							 /* superficieImporte+
							 anyoConstruccionImporte*BASE;
							residentesHabitualesImporte;
							 UBICACION.get(vivienda.getUbicacion())*BASE+
							 contienenteImporte+
							 contenidoImporte+
							 proteccionImporte*BASE+
							 coberturasImporte;
		System.out.println("*****************Presupuesto: "+presupuesto);*/
		return Math.floor(Math.random()*390);
	}	

}
