package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio4 {

	@ParameterizedTest(name = "{index}")
	@CsvSource({
		"'1,2,3,4,5;0,1,0,5,0;1,0,1,0,0;0,5,3,1,0;2,0,6,4,1', '1,1,1,1,1;5,5,1,5,2'",
	})
	void pruebaObtenerDiagonales(String matrizStr, String esperadoStr) {
		int[][] matriz = cadenaAMatriz(matrizStr);
		int[][] esperado = cadenaAMatriz(esperadoStr);
		
		Ejercicio4 aux = new Ejercicio4();

		assertArrayEquals(esperado, aux.obtenerDiagonales(matriz));
	}

	@ParameterizedTest(name = "{index}")
	@CsvSource({
		"'1,2,3,4,5;0,1,0,5,0;1,0,1,0,0;0,5,3,1,0;2,0,6,4,1', '4,8,13,14,6'",
	})
	void pruebaSumarColumnas(String matrizStr, String esperadoStr) {
		int[][] matriz = cadenaAMatriz(matrizStr);
		double[] esperado = cadenaAArray(esperadoStr);
		
		Ejercicio4 aux = new Ejercicio4();
		
		assertArrayEquals(esperado, aux.sumarColumnas(convertirIntADouble(matriz)));
	}


	public double[][] convertirIntADouble(int[][] entrada) {
		double[][] resultado = new double[entrada.length][];
		for (int i = 0; i < entrada.length; i++) {
			resultado[i] = new double[entrada[i].length];
			for (int j = 0; j < entrada[i].length; j++) {
				resultado[i][j] = (double) entrada[i][j];
			}
		}
		return resultado;
	}

	private int[][] cadenaAMatriz(String str) {
		String[] filas = str.split(";");
		int[][] matriz = new int[filas.length][];

		for (int i = 0; i < filas.length; i++) {
			String[] elementos = filas[i].split(",");
			matriz[i] = new int[elementos.length];
			for (int j = 0; j < elementos.length; j++) {
				matriz[i][j] = Integer.parseInt(elementos[j]);
			}
		}

		return matriz;
	}

	private double[] cadenaAArray(String str) {
		String[] elementos = str.split(",");
		double[] array = new double[elementos.length];

		for (int i = 0; i < elementos.length; i++) {
			array[i] = Double.parseDouble(elementos[i]);
		}

		return array;
	}


}
