package a.webEjers.ejercicios;

import java.util.Scanner;

public class Suma1N {
/*
 * Programa recursivo que calcula la suma desde 1 hasta un n�mero entero N le�do por teclado.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.print("Introduce un numero entero >0 ");
			num	 = sc.nextInt();
		}while(num<=0);
		System.out.println("N�mero de cifras: " + suma1N(num));
		sc.close();
	}

	public static double suma1N(int n){
		if(n == 1) //caso base
			return 1;
		else
			return n + suma1N(n-1);
	}
}
