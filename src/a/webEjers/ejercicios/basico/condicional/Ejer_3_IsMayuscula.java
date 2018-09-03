package a.webEjers.ejercicios.basico.condicional;

import java.io.IOException;

public class Ejer_3_IsMayuscula {
/*
 * 3. Programa que lea un car�cter por teclado y compruebe si es una letra may�scula
*/
	public static void main(String[] args) {
	 
		System.out.print("Introduce una letra (Mayuscula/Minuscula: ");
		
		char letra;
		
		try {
			letra = (char)System.in.read();//lee un solo caracter;
			//Primera forma
			if(Character.isUpperCase(letra)) {
				System.out.println("Mayuscual");
			}else {
				System.out.println("Minuscula");
			}
			//Segunda forma
			if(letra>='A' && letra <='Z')
				System.out.println("Es una letra may�scula");
				else
				System.out.println("No es una letra may�scula");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
