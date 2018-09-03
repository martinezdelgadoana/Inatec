package a.webEjers.ejercicios.basico.condicional;

import java.io.IOException;
import java.util.Scanner;

public class Ejer_6_isDigito {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char car;
		System.out.println("Introduzca un car�cter(letra/numero): ");
		car = (char)System.in.read(); //lee un car�cter
		
		if(Character.isDigit(car))
			System.out.println("Es un numero");
		else
			System.out.println("Es una letra");
		
		//Versi�n alternativa comparando con
		// los caracteres '0' ... '9'
		if(car>='0' && car<='9')
			System.out.println("Es un n�mero");
		else
			System.out.println("No es un n�mero");
		
		sc.close();
	}

}
