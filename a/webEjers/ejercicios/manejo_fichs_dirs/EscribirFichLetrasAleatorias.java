package a.webEjers.ejercicios.manejo_fichs_dirs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class EscribirFichLetrasAleatorias {
	/*
	 * Programa Java para crear un fichero de texto que contenga caracteres
	 * obtenidos de forma aleatoria. Los caracteres a incluir en el fichero ser�n
	 * las letras de la A a la Z (may�sculas y min�sculas incluida la �) y espacios
	 * en blanco. El n�mero total de caracteres a escribir se pide por teclado.
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int cont = 0, n, cantidad;
		do {
			System.out.println("Introduce n�mero de caracteres: ");
			cantidad = sc.nextInt();
		} while (cantidad < 1);
		try (PrintWriter salida = new PrintWriter("a/webEjers/ejercicios/manejo_fichs_dirs/aleatorios.txt")) {
			while (cont < cantidad) {
				n = rnd.nextInt(255); // se obtiene un n�mero
				// si el n�mero corresponde a una letra o a un espacio se escribe en el fichero
				if ((Character.toUpperCase((char) n) >= 'A' && Character.toUpperCase((char) n) <= 'Z')
						|| ((char) n == ' ') || ((char) n == '�') || ((char) n == '�')) {
					salida.print((char) n);
					cont++;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
