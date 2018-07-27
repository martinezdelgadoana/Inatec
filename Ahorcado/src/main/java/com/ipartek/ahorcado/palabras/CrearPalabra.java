package com.ipartek.ahorcado.palabras;

public class CrearPalabra {
	public static char[] letras;
	
	public static String rellenarPalabrasArray() {

        // Create a char array of 26 characters.
        // ... Add all letters to it.
        char[] array = new char[3];
      
        array[0]='p';
        array[1]='a';
        array[2]='n';
        String result = new String(array);
    
        return result;
    }
	
}
