package a.webEjers.ejercicios;

import java.util.Scanner;

public class DecimalABinario {
/*
	En esta entrada vamos a escribir el programa java para convertir un n�mero de decimal a
	binario.
	Para escribir el programa nos vamos a basar en la forma cl�sica de pasar de decimal a binario,
	o sea, dividir el n�mero entre 2 y quedarnos con el resto de la divisi�n. Esta cifra, que ser� un
	cero o un uno, es el d�gito de menos peso (m�s a la derecha) del n�mero binario. A
	continuaci�n volvemos a dividir el cociente que hemos obtenido entre 2 y nos quedamos con
	el resto de la divisi�n. Esta cifra ser� la segunda por la derecha del n�mero binario. Esta
	operaci�n se repite hasta que obtengamos un cero como cociente.
	De forma gr�fica lo vamos a ver mucho m�s claro:
	Si queremo convertir el n�mero 12 en binario haremos las siguientes operaciones:
	El n�mero 12 en decimal es el 1100 en binario. El n�mero binario se obtiene tomando los
	restos en orden inverso a como se han obtenido.
	Los que ya sab�is algo de Java podeis pensar que para qu� quiero hacer ese programa si
	simplemente escribiendo la instrucci�n:
	System.out.println(Integer.toBinaryString(numero));
	se mostrar� el n�mero en binario.
	El m�todo toBinaryString de la clase Integer ya me hace el trabajo, pero se trata de que
	seamos capaces de desarrollar por nosotros mismos el algoritmo que realiza la conversi�n de
	decimal a binario.
	Este ejercicio se suele plantear cuando se est� comenzando a aprender las estructuras
	repetitivas (while, for, do while) y a�n no se conocen los arrays por lo que la soluci�n que se
	plantea no utiliza arrays y por tanto esta soluci�n aunque es correcta solo es v�lida para
	n�meros enteros relativamente peque�os.*/


	public static void main(String[] args) {
		int numero, exp, digito;
		double binario;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("Introduce un numero entero >= 0: ");
			numero = sc.nextInt();
		}while(numero<0);
		
		exp=0;
		binario=0;
		while(numero!=0){
			digito = numero % 2;
			binario = binario + digito * Math.pow(10, exp);
			exp++;
			numero = numero/2;
		}
		System.out.printf("Binario: %.0f %n", binario);
		sc.close();
	}
}
