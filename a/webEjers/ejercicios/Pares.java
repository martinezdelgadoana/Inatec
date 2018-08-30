package a.webEjers.ejercicios;

public class Pares {
	/*4. Programa que crea un array de 20 elementos llamado Pares y guarde los 20 primeros
	n�meros pares. Mostrar por pantalla el contenido del array creado.
	*/

	public static void main(String[] args) {
		int i, cont = 2;
		int[] pares = new int[20];
		//Llenamos el array con n�meros pares. Utilizamos un contador
		//con valor inicial 2 y le sumamos dos en cada iteraci�n.
		for (i = 0; i < pares.length; i++) {
				pares[i] = cont;
				cont += 2;
		}
		//Mostrar el array
		for (i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
		
	}
}
