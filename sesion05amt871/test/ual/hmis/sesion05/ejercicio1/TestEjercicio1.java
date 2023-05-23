package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TestEjercicio1 {

	@ParameterizedTest (name = "{index} => transformar({0})")
	@CsvSource({"210,7"})
	void test1(int input, int expected) {
		//Arrange
		Ejercicio1 e1 = new Ejercicio1();
		//Act
		int result = e1.transformar(input);
		//Assert
		assertEquals(expected,result);
	}
}