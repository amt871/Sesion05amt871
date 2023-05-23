package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;

class TestEjercicio3 {


	@ParameterizedTest(name = "{index} => password = {0} , esperado = {1}")
	@CsvSource({
		"'1', 'password demasiado corto'",
		"'1234567', '********'",
		"'12345678901', 'Longitud no valida'",
		"'123456789012', '************'",
		"'12345678901234567890123456789012345678901234567890', 'password demasiado largo'"
	})
	void testPassword(String entrada, String esperado) {
		Ejercicio3 aux = new Ejercicio3();
		assertEquals(esperado, aux.password(entrada));
	}

}