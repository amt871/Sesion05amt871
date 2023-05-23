package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TestEjercicio2 {

	@ParameterizedTest (name = "{index} => Vacio()")
	@CsvSource({"'','',false","a,'',false", "'',a',false"})
	void testVacio(String user, String password, boolean expected) {
		//Arrange
		Ejercicio2 e2 = new Ejercicio2();
		//Act
		boolean result = e2.login(user, password);
		//Assert
		assertEquals(result,expected);
	}
	
	@ParameterizedTest (name = "{index} => Grande()")
	@CsvSource({"a,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false",
		"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,a,false", 
		"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false"})
	void testGrande(String user, String password, boolean expected) {
		//Arrange
		Ejercicio2 e2 = new Ejercicio2();
		//Act
		boolean result = e2.login(user, password);
		//Assert
		assertEquals(result,expected);
	}
	
	@ParameterizedTest (name = "{index} => Adecuado()")
	@CsvSource({"a,a,false","user,a,false","a,pass,false","user,pass,true"})
	void testAdecuado(String user, String password, boolean expected) {
		//Arrange
		Ejercicio2 e2 = new Ejercicio2();
		//Act
		boolean result = e2.login(user, password);
		//Assert
		assertEquals(result,expected);
	}
}