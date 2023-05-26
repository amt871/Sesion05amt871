package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestEjercicio5 {
	@ParameterizedTest
	@MethodSource("datosDePrueba")
	void ListaTest(List<String> listaA, List<String> listaB, List<String> resultadoEsperado) {
		Ejercicio5 e5 = new Ejercicio5();

		assertEquals(true, e5.listaOrdenada(listaA, listaB).equals(resultadoEsperado));
	}

	static Stream<Arguments> datosDePrueba() {
		List<String> vacia = new ArrayList<>();
		List<String> A = Arrays.asList("1", "2", "3", "4");
		List<String> B = Arrays.asList("5", "6", "7");
		List<String> C = Arrays.asList("1","5", "6", "7");
		List<String> comprobar = Stream.concat(A.stream(), B.stream()).distinct().sorted().collect(Collectors.toList());

		return Stream.of(
				Arguments.of(vacia, vacia, new ArrayList<>()),
				Arguments.of(vacia, B, B),
				Arguments.of(A, vacia, A),
				Arguments.of(A, B, comprobar),
				Arguments.of(A, C, comprobar)
				);
	}


}
