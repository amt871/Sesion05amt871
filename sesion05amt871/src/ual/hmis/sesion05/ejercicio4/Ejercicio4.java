package ual.hmis.sesion05.ejercicio4;


public class Ejercicio4 {

	public int[][] obtenerDiagonales(int[][] matriz) {
		int length = matriz.length;
		int[][] diagonales = new int[2][length];

		for (int i = 0; i < length; i++) {
			diagonales[0][i] = matriz[i][i];             // Diagonal principal
			diagonales[1][i] = matriz[i][length - 1 - i]; // Diagonal secundaria
		}

		return diagonales;
	}

	public double[] sumarColumnas(double[][] matriz) {
		int length = matriz.length;
		double[] sumas = new double[length];

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				sumas[i] += matriz[j][i]; // Suma la columna
			}
		}

		return sumas;
	}
}