package com.ipartek.formacion.pajaros;

public class DatosPersonales {
	public static String nombreAve;
	public String nombreDueño;
	
	
	public DatosPersonales() {
		nombreAve="paquito";
		nombreDueño="PEPE";
	}
	
	public static String getNombreAve() {
		return nombreAve;
	}
	public void setNombreAve(String nombreAver) {
		nombreAve=nombreAver;
	}	
	
}
