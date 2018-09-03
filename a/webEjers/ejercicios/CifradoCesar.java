package a.webEjers.ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class CifradoCesar {
/*
	Cifrado C�sar en Java
	Programa para codificar o decodificar un texto utilizando el m�todo de cifrado de C�sar.
	Supondremos que el texto solo contiene letras may�sculas o min�sculas. La letras ser�n las
	correspondientes al alfabeto ingl�s (26 caracteres, excluimos la � y �).
	En este m�todo de cifrado cada letra del texto se sustituye por otra letra que se encuentra N
	posiciones adelante en el alfabeto. Se considera que el alfabeto es circular, es decir, la letra
	siguiente a la �z� es la �a�.
	Por ejemplo, si N es 3, la �a� se transformar�a en �d�, la �b� en �e�, la �c� en �f�, etc.
	
	Ejemplo de cifrado C�sar: si el texto es �casa� y N = 3 el texto cifrado es �fdvd�
	Para descifrar un texto se realiza la operaci�n contraria. Se calcula la letra que est� N
	posiciones por detr�s en el alfabeto. Como el alfabeto es circular, la letra anterior a la �a� es la
	�z�.
	El programa pedir� por teclado un texto, a continuaci�n el valor de N y si queremos codificar
	o decodificar el texto. Finalmente se mostrar� el texto resultante.
	
	
	/Ejemplos de uso:
		Introduce un texto: Tengo el examen resuelto
		Introduce el c�digo: 4
		(C) cifrar o (D) descifrar?: C
		Texto cifrado: Xirksipibeqirviwyipxs
		Introduce un texto: glgtekekqutguwgnvqu
		Introduce el c�digo: 2
		(C) cifrar o (D) descifrar?: D
		Texto descifrado: ejerciciosresueltos*/

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String texto;
		int codigo;
		char opcion;
		//Introducir un texto
		do {
			System.out.print("Introduce un texto: ");
			texto = sc.nextLine();
		} while (texto.isEmpty());
		//Introducir el valor del desplazamiento
		do {
			System.out.print("Introduce el c�digo: ");
			codigo = sc.nextInt();
		} while (codigo < 1);
		//Introducir la operaci�n a realizar: cifrar o descifrar
		do {
			sc.nextLine();
			System.out.print("(C) cifrar o (D) descifrar?: ");
			opcion = (char) System.in.read();
		} while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) !='D');
		if (Character.toUpperCase(opcion) == 'C') {
			System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
		} else {
			System.out.println("Texto descifrado: " + descifradoCesar(texto, codigo));
		}
		sc.close();
	}
	
	//m�todo para cifrar el texto
	public static String cifradoCesar(String texto, int codigo) {
		StringBuilder cifrado = new StringBuilder();
		codigo = codigo % 26;
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
				if ((texto.charAt(i) + codigo) > 'z') {
					cifrado.append((char) (texto.charAt(i) + codigo - 26));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
				if ((texto.charAt(i) + codigo) > 'Z') {
					cifrado.append((char) (texto.charAt(i) + codigo - 26));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			}
		}
		return cifrado.toString();
	}
	
	//m�todo para descifrar el texto
	public static String descifradoCesar(String texto, int codigo) {
		StringBuilder cifrado = new StringBuilder();
		codigo = codigo % 26;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
				if ((texto.charAt(i) - codigo) < 'a') {
					cifrado.append((char) (texto.charAt(i) - codigo + 26));
				} else {
					cifrado.append((char) (texto.charAt(i) - codigo));
				}
			} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
				if ((texto.charAt(i) - codigo) < 'A') {
					cifrado.append((char) (texto.charAt(i) - codigo + 26));
				} else {
					cifrado.append((char) (texto.charAt(i) - codigo));
				}
			}
		}
		return cifrado.toString();
	}
}