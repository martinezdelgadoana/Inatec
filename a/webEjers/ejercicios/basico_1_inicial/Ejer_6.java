package a.webEjers.ejercicios.basico_1_inicial;
/*
 * Ejercicio b�sico inicial 6
Escribe un programa java que declare una variable B de tipo entero y as�gnale un valor. A
continuaci�n muestra un mensaje indicando si el valor de B es positivo o negativo.
Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println
para resolverlo.
Si por ejemplo B = 1 la salida ser�
1 es positivo
Si fuese por ejemplo B = -1 la salida ser�:
-1 es negativo
 */
public class Ejer_6 {

	static int b=4;
	public static int c=-3;
	public static int a=0;
	
	public static void main(String[] args) {
								//if ? 	true			:else false
		System.out.println(b + (b>=0 ? " es positivo " : " es negativo "));
		System.out.println(c + (c>=0 ? " es positivo " : " es negativo "));
		System.out.println(a + (a>=0 ? " es positivo " : " es negativo "));

	}

}
