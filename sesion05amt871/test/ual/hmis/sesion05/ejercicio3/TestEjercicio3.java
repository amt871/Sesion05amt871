package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;

class TestEjercicio3 {

	@ParameterizedTest (name = "{index} => password")
	@CsvSource({"a,password demasiado corto","pokpok,********", 
		"lkmlkmlkmlkmlkm,************",
		"asdf654asdf654asdf6544asdf654asdf654asdf654asdf654as6d5f4as6d5f4a6s5d4f,password demasiado largo"})
	
	void testPassword(String entrada, String expected) {
		//Arrange
		Ejercicio3 e3 = new Ejercicio3();
		//Act
		String result = e3.password(entrada);
		//Assert
		assertEquals(result,expected);
	}
}
