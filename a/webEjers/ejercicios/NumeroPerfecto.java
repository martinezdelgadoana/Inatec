package a.webEjers.ejercicios;

import java.util.Scanner;

public class NumeroPerfecto {
	/*
	Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos sin incluir
	el 	propio n�mero.
	Por ejemplo, el n�mero 6 es perfecto.
	El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar
	si es perfecto.
	Si sumamos 1 + 2 + 3 = 6
	Los siguientes n�meros perfectos despu�s del 6 son 28, 496, 8128, 33550336, 8589869056.
	El programa pide por teclado un n�mero y muestra si es perfecto o no. mediante un bucle for
	sumaremos los divisores del n�mero. Al final si esta suma es igual al n�mero mostraremos el
	mensaje correspondiente.
	*/
	
	public static void main(String[] args) {
		int i, suma = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		n = sc.nextInt();
		for (i = 1; i < n; i++) { // i son los divisores. Se divide desde 1 hasta n-1
			if (n % i == 0) {
				suma = suma + i; // si es divisor se suma
			}
		}
		if (suma == n) { // si el numero es igual a la suma de sus divisores es perfecto
			System.out.println("Perfecto");
		} else {
			System.out.println("No es perfecto");
		}
		sc.close();
	}
	
}
