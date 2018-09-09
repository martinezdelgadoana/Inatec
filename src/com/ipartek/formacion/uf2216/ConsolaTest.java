package com.ipartek.formacion.uf2216;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class ConsolaTest {
	Consola consola = new Consola();
	
	
	//Para probar metodos publicos
	@Test
	public void calculoTest() {
		int res = consola.calculo(0, 0);
		assertTrue(res==0);
	}
	
	
	//Para probar metodos privados se les cambia la accesibilidad
	@Test
	public void calculoPriTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = consola.getClass().getDeclaredMethod("calculoPri", int.class, int.class);
		method.setAccessible(true);
		int valor = (int) method.invoke(consola, 0, 3);
		assertTrue(valor==3);
		
	}
}
