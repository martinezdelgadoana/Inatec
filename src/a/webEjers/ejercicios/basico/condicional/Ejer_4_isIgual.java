package a.webEjers.ejercicios.basico.condicional;

import java.util.Scanner;

public class Ejer_4_isIgual {
/*
 * Ejercicio 4: Programa que lea dos caracteres y compruebe si son iguales.
 */
	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
					
		String car1;
		String car2;
		
		System.out.print("Introduzca primer car�cter: ");
		car1 =  sc.next();
		
		System.out.print("Introduzca segundo car�cter: ");
		car2 = sc.next();
	
		if(car1.equals(car2)) //comparamos dos objetos Character mediante el m�todo equals
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		sc.close();

	}
}
