package a.webEjers.ejercicios;

import java.util.Scanner;

public class NumerosAcabadosenDos {
/*
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero negativo. El
programa indicar� cu�ntos n�meros acabados en 2 se han le�do.
Para saber si un n�mero acaba en dos o en general para saber en qu� d�gito termina un
n�mero entero se divide el n�mero entre 10 y se obtiene el resto de esta divisi�n.
En Java el operador que obtiene el resto de una divisi�n es el operador %
En este caso para saber si el n�mero acaba en 2 escribiremos la instrucci�n:
if(n%10==2)
 */
	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		int cont=0;
		
		do {
			System.out.println("Introduzca numero: ");
			num=sc.nextInt();
			if(num%10==2)
				cont++;
		}while (num>=0);
		
		System.out.println("Contador de numeros acabados en dos:"+cont);
		sc.close();
	}
}
