package a.webEjers.ejercicios.basico.condicional;

import java.io.IOException;
import java.util.Scanner;

public class Ejer_5_isMinuscula_KO {
/*5: Programa java que lea dos caracteres por teclado y compruebe si los dos son
letras min�sculas
*/
	
	
	//NO DEJA INTRODUCIR EL SEGUNDO CARACTER
	public static void main(String[] args) throws IOException {

			char car1, car2;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca primer car�cter: ");
			car1 = (char)System.in.read(); //lee un car�cter
			System.in.read(); //saltar el intro que ha quedado
			System.out.println("Introduzca segundo car�cter: ");
			car2 = (char)System.in.read(); //lee el segundo car�cter
			if(Character.isLowerCase(car1)){ 
	
				if(Character.isLowerCase(car2))
					System.out.println("Los dos son letras min�sculas");
				else
					System.out.println("El primero es una letra min�scula pero el segundo no");
			}else{
				if(Character.isLowerCase(car2))
					System.out.println("El segundo es una letra min�scula pero el primero no");
				else
						System.out.println("Ninguno es una letra min�scula");
			}
			
			
			
			if(car1>='a' && car1<='z'){
				if(car2>='a' && car2<='z')
					System.out.println("Los dos son letras min�sculas");
				else
					System.out.println("El primero es una letra min�scula pero el segundo no");
			}else{
				if(car2>='a' && car2<='z')
					System.out.println("El segundo es una letra min�scula pero el primero no");
				else
					System.out.println("Ninguno es una letra min�scula");
			}
			sc.close();
		
	}
/*
		
		String letra;
		String letra2;
		
		try {
			System.out.print("Introduce una letra (Mayuscula/Minuscula: ");
		//	letra = (char)System.in.read();//lee un solo caracter;
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("Introduzca primer car�cter: ");
			letra =  sc.next();
			//System.in.read();//Saltar el enter
			System.out.print("Introduce segundo caracter: ");
			letra2 = sc.next();
			letra.toCharArray();
			
			if(letra[0]=='c');
			//Primera forma
			if(Character.isLowerCase(letra)) {
				if (Character.isLowerCase(letra2))
					System.out.println("Los dos son minusculas");
				else
					System.out.println("El primero es minuscula pero el segundo no");
			}else {
				if (Character.isLowerCase(letra2))
					System.out.println("El primero es mayuscula");
				else
					System.out.println("El primero es mayuscula pero el segundo no");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
*/
}
