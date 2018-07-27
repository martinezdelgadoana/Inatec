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
		
		
		for (int i=0; i<palabra.length()-1;i++) {
			strBu.append('-');
		}
		
		if(palabra.contains(letra)) {			
			System.out.println("Letra esta en palabra en la pos "+palabra.indexOf( letra ));
			
			 //String builder para hacer _ _ _ _ _ y luego cambiarlo por _ _ r _ _ _
			strBu.insert(palabra.indexOf( letra ), letra);
			
			System.out.println("STRBUILDER... "+strBu.toString());
			
		}else {
			System.out.println("FALLO");
		}
		response.sendRedirect("aJugar.jsp"); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
