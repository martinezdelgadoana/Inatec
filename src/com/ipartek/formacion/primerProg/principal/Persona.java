package com.ipartek.formacion.primerProg.principal;

public class Persona {

	private String numeroCuenta;

	public Persona(Object object, Object object2, Object object3, Object object4, Object object5) {
		// TODO Auto-generated constructor stub
	}

	public void saludar() {
		System.out.println( "hola");
		
	}

	public void andar(int i) {
		System.out.println( "Andar "+i+" pasos");
		
	}

	public int darPaga() {
		System.out.println( "paga");
		
		return 20;
	}

	public void setNumeroCuenta(String string) {
		this.numeroCuenta=string;
		
	}

	public String getNumeroCuenta() {
		// TODO Auto-generated method stub
		return numeroCuenta;
	}

}
