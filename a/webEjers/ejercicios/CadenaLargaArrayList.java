package a.webEjers.ejercicios;
import java.util.ArrayList;
import java.util.Scanner;
public class CadenaLargaArrayList {
/*
 * Calcular la cadena m�s larga en un ArrayList de Strings
Programa Java para calcular el String de mayor longitud de todos los contenidos en un
ArrayList de String. El programa utilizar� los siguientes m�todos adem�s del m�todo main:
M�todo leerArray(): este m�todo recibe como par�metro el arrayList de Strings vac�o. El
m�todo pide por teclado cadenas de caracteres y las a�ade al ArrayList. La lectura de cadenas
termina cuando se introduce la palabra �FIN�.
M�todo cadenaMasLarga():este m�todo recibe como par�metro el ArrayList de Strings con
todas las cadenas le�das anteriormente y devuelve el String de mayor longitud.
 */

	public static void main(String[] args) {
		ArrayList<String> cadenas = new ArrayList();
		leerArray(cadenas);
		System.out.println("Cadena de mayor longitud : " + cadenaMasLarga(cadenas));
	}
	//llenar el ArrayLIst con Strings introducidos por teclado
	public static void leerArray(ArrayList<String> cadenas) {
		Scanner sc = new Scanner(System.in);
		String s;
		boolean masCadenas;
		do {
			masCadenas = true;
			System.out.print("Introduce una cadena de caracteres (Fin para acabar): ");
			s = sc.nextLine();
			if (s.equalsIgnoreCase("FIN")) {
				masCadenas = false;
			} else {
				cadenas.add(s);
			}
		} while (masCadenas);
		
		sc.close();
	}
	//Calcular y devolver la cadena de mayor longitud
	public static String cadenaMasLarga(ArrayList<String> cadenas) {
		String mayor = cadenas.get(0);
		for (int i = 1; i < cadenas.size(); i++) {
			if (cadenas.get(i).length() > mayor.length()) {
				mayor = cadenas.get(i);
			}
		}
		return mayor;
	}
}
