package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TestEjercicio2 {

	Ejercicio2 ejercicio2 = new Ejercicio2();

	@ParameterizedTest(name = "{index} => username = {0}, password = {1}, resultado esperado = {2}")
	@CsvSource({
		"'user', 'pass', true",
		"'', 'pass', false",
		"'user', '', false",
		"'user', 'contrasennaExcesivamenteLargaLoQueNoImplicaSegura', false",
		"'usuarioExtremadamenteLargoAlQueDariaMuchaPerezaLoggear', 'pass', false",
		"'badusser', 'pass', false",
		"'user', 'badpass', false"
	})
	void testLogin(String user, String pass, boolean esperado) {
		assertEquals(esperado, ejercicio2.login(user, pass));
	}
}