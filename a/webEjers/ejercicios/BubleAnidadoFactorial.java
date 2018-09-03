/*Primera relaci�n de ejercicios para practicar con los bucles anidados en Java. En este caso
todos los ejercicios propuestos se resuelven anidando dos bucles for aunque tambi�n se
podr�an resolver mediante dos bucles while o do..while anidados o mediante combinaciones
de los tres tipos: for, while, do..while. Te animo a que los resuelvas utilizando bucles distintos
al for utilizado aqu�.
1. Leer por teclado un n�mero entero N no negativo y mostrar el factorial de todos los
n�meros desde 0 hasta N.
El factorial de un n�mero entero se expresa mediante el s�mbolo �!� y se define de la siguiente
forma:
Si n = 0 entonces 0! = 1
Si n > 0 entonces
n! = n * (n � 1) * (n � 2) * �. * 3 * 2 * 1
Por ejemplo, n = 5 entonces
5! = 5 * 4 * 3 * 2 * 1 = 120*/

package a.webEjers.ejercicios;

import java.util.Scanner;

public class BubleAnidadoFactorial {

	public static void main(String[] args) {
		int N;
		double factorial;
		Scanner sc = new Scanner(System.in);
		
		//Leer un n�mero entero >= 0
		do{
			System.out.print("Introduce un n�mero > 0: ");
			N = sc.nextInt();
		}while(N<0);
		
		for(int i = 0; i <= N ; i++){ //para cada n�mero desde 1 hasta N
			//se calcula su factorial
			factorial = 1;
			for(int j = 1; j <= i; j++){
				factorial = factorial * j;
			}
			//se muestra el factorial
			System.out.printf("%2d! = %.0f %n", i, factorial);
		}
		sc.close();
	}
}
	

