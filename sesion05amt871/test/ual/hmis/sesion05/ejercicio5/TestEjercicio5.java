package ual.hmis.sesion05.ejercicio5;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestEjercicio5 {
	@Test
	void ListaTest() {
		Ejercicio5 e5 = new Ejercicio5();

		ArrayList<String> vacia = new ArrayList<String>();
		ArrayList<String> A = new ArrayList<String>();
		ArrayList<String> B = new ArrayList<String>();
		ArrayList<String> comprobar = new ArrayList<String>();

		A.add("Jose Martinez");
		A.add("Pedro Padial");
		A.add("Jose Puertas");
		A.add("Fran Perez");
		B.add("Paco Romera");
		B.add("Ibai Llanos");

		B.add("Fran Perez");

		comprobar.addAll(A);
		comprobar.add(B.get(0));
		comprobar.add(B.get(1));
		comprobar.sort(null);

		Assert.assertEquals(new ArrayList<String>(), e5.listaOrdenadaEstudiantes(vacia, vacia));
		Assert.assertEquals(B, e5.listaOrdenadaEstudiantes(vacia, B));
		Assert.assertEquals(A, e5.listaOrdenadaEstudiantes(A, vacia));

		Assert.assertEquals(comprobar, e5.listaOrdenadaEstudiantes(A, B));

	}

}
