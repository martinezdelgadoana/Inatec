package a.webEjers.ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class ContarCifras {
/*Contar las cifras de un n�mero entero en Java
Programa Java que pide un n�mero entero por teclado y calcula y muestra el n�mero de cifras
que tiene.
Por ejemplo si se introduce el n�mero 54391 el programa mostrar� el mensaje:
El n�mero tiene 5 cifras
Si se introduce el n�mero 101 se mostrar� el mensaje:
El n�mero tiene 3 cifras
El proceso leer un n�mero y contar sus cifras se repetir� hasta que se conteste �N� a la
pregunta Continuar? (S/N)
Si se responde 'S' se volver� a pedir otro n�mero.
Para saber cu�ntas cifras tiene un n�mero entero haremos lo siguiente:
Dividiremos el n�mero sucesivamente entre 10. En cada divisi�n tomaremos la parte entera y
volvemos a dividir. Este proceso se repite hasta que se obtenga un cero como cociente en la
divisi�n.
Por ejemplo, si el n�mero le�do es 1234 haremos las siguientes operaciones:
1234 / 10 = 123
123 / 10 = 12
12 / 10 = 1
1 / 10 = 0
hemos realizado 4 divisiones hasta obtener un cero como cociente, por lo tanto el n�mero
tiene 4 cifras.*/
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n, cifras;
		char car;
		
		do{
			System.out.print("Introduce un n�mero entero: ");
			n = sc.nextInt();
			cifras= 0; 
			while(n!=0){ //mientras a n le queden cifras
				n = n/10; //le quitamos el �ltimo d�gito
				cifras++; //sumamos 1 al contador de cifras
			}
			System.out.println("El n�mero tiene " + cifras+ " cifras");
			System.out.print("Continuar? ");
			car = (char)System.in.read();
		}while(car!='n' && car != 'N');
	
		sc.close();
	}

}
