package com.ipartek.formacion.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {
		//Creo un punto
		Punto p=new Punto(3,4);
		
		//Lo copio en otro punto
		Punto pt2=(Punto) p.clone();
		
		//Modifico el primer punto
		p.setX(100);
		
		System.out.println(p.equals(pt2));
		
		System.out.println(p);//Automaticamente llama al metodo toString de Punto.java
		System.out.println(pt2);
		
		Object o =p;
		
		
		Punto pt1=(Punto) o;
		
		System.out.println(pt1);
		
		int i=5;
		
		Object o2=i;//new Integer(i);
		System.out.println(o2);
		
		
		
	}

}
