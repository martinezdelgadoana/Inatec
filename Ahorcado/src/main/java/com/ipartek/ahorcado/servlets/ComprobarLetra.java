package com.ipartek.ahorcado.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ahorcado.palabras.CrearPalabra;

public class ComprobarLetra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//public static StringBuilder strBu 
	public static StringBuilder strBu = new StringBuilder();
    
	public ComprobarLetra() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String letra = request.getParameter("letra");
		
		String palabra=CrearPalabra.rellenarPalabrasArray();	
		strBu.setLength(palabra.length());
//		
//		char[] array = new char[palabra.length()];
//		
//		for (int i=0;i<array.length;i++) {
//			array[i]='-';
//		}
//		
//		for (int i=0;i<array.length;i++) {
//			System.out.print("ARRAY   "+array[i]);
//		}
		//HAY QUE PONERLO EN UN METODO QUE SE LLAME CADA VEZ QUE SE LE DE BOTON EN LA PANTALLA 
		//PUESTO QUE AKI SE VUELVE A PONER ESPACIOS
		System.out.println("plabraLeng-"+palabra.length());
		System.out.println("strLeng-"+strBu.length());
		
		//strBu = new StringBuilder(palabra.length());
		
		//Colocar en el strBuilder '-' para mostrar cuantos espacios tiene
		colocarEspacios(palabra);
		
		if(palabra.contains(letra)) {			
			System.out.println("Letra esta en palabra en la pos "+palabra.indexOf( letra ));
			
			//Cambio el hueco '-' de la posicion donde esta la letra por la letra
			//strBu.insert(palabra.indexOf( letra ), letra);
			strBu.setCharAt(palabra.indexOf( letra ), letra.charAt(0));
			
			System.out.println("STRBUILDER... "+strBu.toString());
			response.sendRedirect("aJugar.jsp");
		}else {
			System.out.println("FALLO");
			response.sendRedirect("aJugar.jsp");
		}
		 
	}
	
	public StringBuilder strBuReturn() {
		return strBu;
	}
	/*NO SE USA PORQUE NO FUNCIONA*/
	public void colocarEspacios(String palabra) {
		System.out.println("strBu.length();"+strBu.length());
		System.out.println("Huecos para poner-"+palabra.length());

//		for (int index = 0; index < strBu.length(); index++) {
//		    if (strBu.charAt(index) == '-') {
//		    	strBu.setCharAt(index, '_');
//		    }
//		}
		for (int index = 0; index < strBu.length(); index++) {
		    if (strBu.charAt(index) == '-') {
		    	strBu.setCharAt(index, '_');
		    }
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
