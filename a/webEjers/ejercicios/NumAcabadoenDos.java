package a.webEjers.ejercicios;

import java.util.Scanner;

public class NumAcabadoenDos {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, contador=0;
	
		System.out.print("Introduce un n�mero entero: ");
		n = sc.nextInt();
		
		//Cuando se mete un numero negatico se termina la ejecucion
		while(n>=0){
			if(n%10==2) //Si el n�mero acaba en dos
				contador++;
			
			System.out.print("Introduce un n�mero entero: ");
			n = sc.nextInt();
		}
		System.out.println("Se han introducido " + contador + " n�meros acabados en 2");
		sc.close();
	}
}
