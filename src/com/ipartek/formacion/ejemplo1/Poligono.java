package com.ipartek.formacion.ejemplo1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Poligono {

	private Punto origen;
	//private LinkedHashSet<Punto> puntos=new LinkedHashSet<>();
	private LinkedHashMap<Integer,Punto> puntos=new LinkedHashMap<>();

	public Poligono(Punto origen) {
		this.origen =origen;
	}
	
	public void add(Punto punto) {
		if(punto==null) {
			throw new RuntimeException("No se admiten puntos nulos");
		}
		puntos.put(puntos.size(),punto);
	}
	
	public Punto get(int indice) {
		return puntos.get(indice);
		
	}
	
	
	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Poligono [origen=" + origen + ", puntos=" + puntos + "]";
	}

}
