package com.ipartek.ahorcado.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ahorcado.palabras.CrearPalabra;

public class ComprobarLetra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static StringBuilder strBu = new StringBuilder();
   // public static String huecos="parque";
    public static String HUECO = "-";
//    
//	public ComprobarLetra() {
//        super();
//        colocarEspacios();
//    }
	String palabra=CrearPalabra.rellenarPalabrasArray();	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String letra=request.getParameter("letra");
		char cLetra=letra.charAt(0);
		
		if(palabra.contains(letra)) {			
			//Cambio el hueco '-' de la posicion donde esta la letra por la letra
			strBu.setCharAt(palabra.indexOf( letra ), letra.charAt(0));
		}else {
			System.out.println("FALLO");
		}	

		//Si ya no hay mas huecos
		if (strBu.indexOf(HUECO)==-1) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("aJugar.jsp");
		}
	}
	
	public StringBuilder strBuReturn() {
		return strBu;
	}
	
	public static String colocarEspacios(String palabra) {
		//System.out.println("CrearPalabra.rellenarPalabrasArray()");
		//System.out.println(CrearPalabra.rellenarPalabrasArray());
		System.out.println("colocarEspacios():palabra "+palabra);
		System.out.println("colocarEspacios():palabra.length()"  +palabra.length());
		
		for (int index = 0; index < palabra.length(); index++) {
	    	
		//for (int index = 0; index < CrearPalabra.rellenarPalabrasArray().length(); index++) {
	    	strBu.insert(index, HUECO);
		}
		return strBu.toString();
	}

	public static void main(String[] argumentos) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String letra;
		int validar=1;
		try {
			
			//String palabra=CrearPalabra.arrayPala();
			String palabra=CrearPalabra.rellenarPalabrasArray();
			
			
			System.out.println(colocarEspacios(palabra));
			
			while(validar==1) {
				System.out.print("Introduce una Letra: ");
				letra = br.readLine();
						
				//String palabra=CrearPalabra.rellenarPalabrasArray();	
				strBu.setLength(palabra.length());
				System.out.println();
			
				//Si la letra se repite me dice en que posiciones.. Hay que sustituirlos en el bufer
				/*
					String miCadena="patata";
					System.out.println(palabra);
					int posicion=palabra.indexOf(letra);
					while(posicion!=-1) {
						System.out.println("posicion: "+posicion);
						posicion=palabra.indexOf(letra,posicion+1);
						System.out.println("POS: "+posicion);
						//Cambio el hueco '-' de la posicion donde esta la letra por la letra
						strBu.setCharAt(posicion, letra.charAt(0));
						
					}
				*/
				if(palabra.contains(letra)) {	
					
					//
					
					//
					
					//Cambio el hueco '-' de la posicion donde esta la letra por la letra
					strBu.setCharAt(palabra.indexOf( letra ), letra.charAt(0));
					System.out.println(strBu.toString());
					
				}else {
					System.out.println("FALLO");
					System.out.println(strBu.toString());
				}	
				if (strBu.indexOf(HUECO)!=-1) {
					validar=1;
				}else {
					validar=0;
				}
			}
			System.out.println("MUY BIEN");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
