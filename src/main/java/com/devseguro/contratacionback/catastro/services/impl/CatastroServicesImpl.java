package com.devseguro.contratacionback.catastro.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.devseguro.contratacionback.catastro.models.Direccion;
import com.devseguro.contratacionback.catastro.models.Inmueble;
import com.devseguro.contratacionback.catastro.services.CatastroServices;

@Service
public class CatastroServicesImpl implements CatastroServices {

	private static final List<Inmueble> INMUEBLES = new ArrayList<>();
	private static final Map<String,String> PROVENCIAS = new HashMap<String, String>();
	
	static {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fecha1 = null;
		Date fecha2 = null;
		Date fecha3 = null;
		Date fecha4 = null;
		
		try {
			fecha1 = sdf.parse("10/12/1976");
			fecha2 = sdf.parse("23/04/2004");
			fecha3 = sdf.parse("25/06/1991");
			fecha4 = sdf.parse("09/04/1967");
		} catch (ParseException e) {
			
		}
		
		Inmueble inmueble1 = new Inmueble("9872023 VH5797S 001 WX", 120.0, fecha1, null);
		Inmueble inmueble2 = new Inmueble("13 077 A 018 00039 0000 FP", 96.0, fecha2, null);
		Inmueble inmueble3 = new Inmueble("50 462 C 018 00014 0004 FP", 112.0, fecha3, null);
		Inmueble inmueble4 = new Inmueble("8563232 JT8956F 0001 BS", 80.0, fecha4, null);
		
		INMUEBLES.add(inmueble1);
		INMUEBLES.add(inmueble2);
		INMUEBLES.add(inmueble3);
		INMUEBLES.add(inmueble4);
		
		PROVENCIAS.put("08","Barcelona");
		PROVENCIAS.put("28","Madrid");
		PROVENCIAS.put("17","Girona");
		PROVENCIAS.put("18","Granada");
		PROVENCIAS.put("43","Taragona");
	}
	
	@Override
	public Inmueble getInmueble(Direccion direccion) {
		
		char inicialCalle = direccion.getNombre().toUpperCase().charAt(0);
		
		Inmueble inmueble = null;
		
		switch (inicialCalle) {
		
		case 'A' : inmueble = INMUEBLES.get(0);
				   inmueble.setDireccion(direccion);
				   break;
		case 'R' : inmueble = INMUEBLES.get(1);
				   inmueble.setDireccion(direccion);
		   		   break;
		case 'P' : inmueble = INMUEBLES.get(2);
				   inmueble.setDireccion(direccion);
		   		   break;
		case 'L' : inmueble = INMUEBLES.get(3);
				   inmueble.setDireccion(direccion);
		   		   break;
		default  : inmueble = INMUEBLES.get(3);
				   break;
		}
		
		return inmueble;
	}
	
	public String getProvencia(String codigoPostal) {
		
		String provencia = "Barcelona";
		String codigo = codigoPostal.substring(0,2);
		System.out.println(codigo);
		
		for(String key: PROVENCIAS.keySet()) {
			if(key.equals(codigo)) {
				provencia = PROVENCIAS.get(key);
				return provencia;
			}
		}
		return provencia;
	}

}
