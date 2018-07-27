package com.iparte.ahorcado.modelos;

public class Letras {
	private String letra;


	public Letras(String letra) {
		super();
		this.letra = letra;
	
	}


	public Letras() {
		this("");
	}
	@Override
	public String toString() {
		return "Letras [letra=" + letra + "]";
	}

	public String getLetra() {
		return letra;
	}
	
	public void setLetra(String letra) {
		this.letra = letra;	
	}
}
