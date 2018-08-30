package a.webEjers.ejercicios;
import java.util.Scanner;
/*
5. Programa Java que guarda en un array 10 n�meros enteros que se leen por teclado. A
continuaci�n se recorre el array y calcula cu�ntos n�meros son positivos, cu�ntos negativos y
cu�ntos ceros.
*/
public class PositivNegativyCeros {
	
	public static void main(String[] args) {
		int[] numeros=new int[10];

		int contpos=0;
		int contneg=0;
		int contceros=0;
		
		Scanner sc = new Scanner(System.in);
		
	
		for (int i=0;i<10;i++) {
			System.out.println("Introduce numero(pos/neg/0): ");
			numeros[i]=sc.nextInt();
		}
		
		for (int i=0;i<10;i++) {
			if(numeros[i]>0) {
				contpos++;
			}
			if(numeros[i]<0) {
				contneg++;
			}
			if(numeros[i]==0){
				contceros++;
			}
		}

		System.out.println("ContadorPosotivos "+contpos+" ContadorNegativos "+contneg
				+" Ceros "+contceros);
		
		sc.close();
	}

}
