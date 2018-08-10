package com.ipartek.ahorcado.palabras;

public class CrearPalabra {
	public static char[] letras;
	
	public static String rellenarPalabrasArray() {
		
        char[] array = new char[6];
      
        array[0]='p';
        array[1]='a';
        array[2]='r';
        array[3]='q';
        array[4]='u';
        array[5]='e';
        
        String result = new String(array);
		
        return result;        
    }
	
	
	
	public static String arrayPala() {
		String[] palabras= {"parque","mesa","hierba","tejado"};//Probelamas con las palabras que tienen letras repetidas
		//int numPalabra=(int)Math.round(Math.random());
		int numPalabra=(int)Math.floor(Math.random()*(10-1+1)+(1));

		//Convierto una palabra del string[] de palabras a char[]
		String palabra=palabras[numPalabra];
		System.out.println(palabra);
		char[] cpalabra=palabra.toCharArray();
		System.out.println(cpalabra.length);
		System.out.println("Hasta AkiBien2");
		
		for (int i=0;i<cpalabra.length;i++) {
			System.out.println(cpalabra[i]);
		}
		System.out.println("Hasta AkiBien3");
		
		 String result = new String(cpalabra);
		 System.out.println("EnArrayPala");
		 System.out.println(result);
		 return(result);
		
	}
	
	
}
