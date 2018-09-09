package com.ipartek.formacion.fichero;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FicheroTest {

	

	@Test
	public void aProbarTest() {
		Fichero fich=new Fichero();
		fich.aProbar(1,4);
		try {
			fich.main(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
