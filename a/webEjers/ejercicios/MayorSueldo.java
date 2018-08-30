package a.webEjers.ejercicios;

import java.util.Scanner;

public class MayorSueldo {

	/*
	Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el nombre y el
	sueldo del empleado que m�s gana.
	Para hacerlo utilizaremos dos arrays:
	Un array de String para los nombres de los empleados
	Un array de tipo double para los sueldos de cada empleado.
	Al mismo tiempo que leemos los datos de los empleados iremos comprobando cu�l es el que
	tiene el mayor sueldo. Para ello tomamos el sueldo del primer empleado que se lee como
	mayor sueldo y despu�s vamos comprobando el resto de sueldos. Cuando encontramos
	alguno mayor que el mayor actual este sueldo se convierte en el nuevo mayor.
	En general para calcular el mayor de una serie de n�meros tomamos el primero como mayor y
	despu�s comparamos el resto de n�meros.
*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Numero de empleados
		int num_empleados=5;
		//creamos los arrays
		String[] empleados = new String[num_empleados];
		double[] sueldos = new double[num_empleados];
		//variables donde guardar el nombre y sueldo del empleado que m�s gana
		String nombreMayor;
		double mayorSueldo;
		int i = 0;
		
		//se lee el primer empleado
		System.out.println("Lectura de nombres y sueldos de empleados: ");
		System.out.print("Empleado " + (i + 1) + ": ");
		
		empleados[i] = sc.nextLine();
		
		System.out.print("Sueldo: ");
		sueldos[i] = sc.nextDouble();
		
		//se toma el primero como mayor
		mayorSueldo = sueldos[i];
		nombreMayor = empleados[i];
		
		//se leen el resto de empleados
		for (i = 1; i < empleados.length; i++) {
			sc.nextLine(); //limpiar el buffer
			System.out.print("Empleado " + (i + 1) + ": ");
			empleados[i] = sc.nextLine();
			System.out.print("Sueldo: ");
			sueldos[i] = sc.nextDouble();
			
			//se compara el sueldo le�do con el mayor
			if (sueldos[i] > mayorSueldo) {
				mayorSueldo = sueldos[i];
				nombreMayor = empleados[i];
			}
		}
		//mostrar resultados
		System.out.println("Empleado con mayor sueldo: " + nombreMayor );
		System.out.println("Sueldo: " + mayorSueldo);
		sc.close();
	}
	
}
