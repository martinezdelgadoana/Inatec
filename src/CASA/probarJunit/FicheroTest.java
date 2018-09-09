package CASA.probarJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FicheroTest {

	@Test
	void testaProbar() {
		Fichero fich=new Fichero();
		
		fich.aProbar(2, 3);
	}

}
