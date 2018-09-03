package a.webEjers.ejercicios;

import java.util.Scanner;

public class AlturaMedia {
	/*
	* Leer la altura de N personas y calcular la altura media
	* Mostra cu�ntos hay superiores a la media.
	*/


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, N;
		int contMas = 0, contMenos = 0;
		double media = 0;
		//Leer el n�mero de personas
		do{
			System.out.print("N�mero de personas: ");
			N = sc.nextInt();
		}while(N<=0);
		
		//Se crea el array de tama�o N
		double[] alto = new double[N];
		
		//Leer alturas
		System.out.println("Lectura de la altura de las personas: ");
		
		for (i = 0; i < N; i++) {
			System.out.print("persona " + (i+1) + " = ");
			alto[i] = sc.nextDouble();
			media = media + alto[i]; //se suma la estatura le�da para calcular la media
		}
		
		//Calcular la media
		media = media / N;
		//recorremos el array para ver cuantos hay m�s altos
		//que la media y cuantos m�s bajos
		
		for (i = 0; i < alto.length; i++) {
			if (alto[i] > media){ //si la estatura es mayor que la media
				contMas++;
			} else if (alto[i] < media){ //si es menor
				contMenos++;
			}
		}
		//Mostrar resultados
		System.out.println("Estatura media: " + media);
		System.out.println("Personas con estatura superior a la media: " + contMas);
		System.out.println("Personas con estatura inferior a la media: " + contMenos);
		sc.close();
	}
	
}
