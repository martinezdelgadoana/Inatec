package com.ipartek.formacion.Aves;

public class DatosPersonales {
	public static String nombreAve;
	public static String nombreDue�o;
	
	
	public DatosPersonales() {
		nombreAve="paquito";
		nombreDue�o="PEPE";
	}
	
	public static String getNombreAve() {
		return nombreAve;
	}
	public static void setNombreAve(String nombreAver) {
		nombreAve=nombreAver;
	}	
	
	
	public static void setNombreDue�o(String nombreDue�o) {
		DatosPersonales.nombreDue�o=nombreDue�o;
	}	
	public static String getNombreDue�o() {
		return nombreDue�o;
	}	
	
}
