package a.webEjers.ejercicios.basico_2;

import java.util.Scanner;

public class Ejer_7_Hipotenusa {
	/*Ejercicio 7. Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y calcule la
	longitud de la hipotenusa seg�n el teorema de Pit�goras.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cateto1, cateto2;
		
		System.out.print("Introduzca longitud del primer cateto: ");
		cateto1 = sc.nextDouble();
		System.out.print("Introduzca longitud del segundo cateto: ");
		cateto2 = sc.nextDouble();
		System.out.println("Hipotenusa -> " + Math.sqrt(Math.pow(cateto1,2)+ Math.pow
		(cateto2, 2)));
		
		sc.close();
	}
}
