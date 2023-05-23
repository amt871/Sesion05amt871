package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TestEjercicio1 {

	@ParameterizedTest (name = "{index} => transformar({0})")
	 @CsvSource({
	        "2, 1",
	        "3, 1",
	        "5, 1",
	        "7, 7"
	    })
	void test1(int input, int expected) {
		//Arrange
		Ejercicio1 aux = new Ejercicio1();
		
		assertEquals(expected, aux.transformar(input));
	}
}