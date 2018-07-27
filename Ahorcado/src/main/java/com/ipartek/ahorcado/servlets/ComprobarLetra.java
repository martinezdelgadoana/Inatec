package com.ipartek.ahorcado.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ahorcado.palabras.CrearPalabra;

public class ComprobarLetra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static StringBuilder strBu ;
    
	public ComprobarLetra() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String letra = request.getParameter("letra");
		
		String palabra=CrearPalabra.rellenarPalabrasArray();		
		strBu = new StringBuilder(palabra.length());
		
		//Colocar en el strBuilder '-' para mostrar cuantos espacios tiene
		colocarEspacios(palabra);
		
		if(palabra.contains(letra)) {			
			System.out.println("Letra esta en palabra en la pos "+palabra.indexOf( letra ));
			
			//Cambio el hueco '-' de la posicion donde esta la letra por la letra
			strBu.insert(palabra.indexOf( letra ), letra);
			//Se vacia todo el tiempo el strBu!!!!!!!!!
			
			System.out.println("STRBUILDER... "+strBu.toString());
			response.sendRedirect("aJugar.jsp");
		}else {
			System.out.println("FALLO");
		}
		 
	}

	public void colocarEspacios(String palabra) {
		for (int i=0; i<palabra.length()-1;i++) {
			strBu.append('-');
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
