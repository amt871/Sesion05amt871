package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio4.Ejercicio4;

public class TestEjercicio4 {
	
	// Arrange
	Ejercicio4 e4 = new Ejercicio4();
	
	@ParameterizedTest
	@CsvSource({ "-10,Error en la nota", "0,Suspenso", "5,Aprobado", "7,Notable", "9,Sobresaliente", "10,Matricula",
			"11,Error en la nota" })
	void testCalificaciones(Float nota, String expected) {

		// Act
		e4.notas.add(nota);
		e4.calculaCalificaciones(e4.notas);
		// Assert
		assertEquals(expected, e4.calificaciones.get(0));
	}
}