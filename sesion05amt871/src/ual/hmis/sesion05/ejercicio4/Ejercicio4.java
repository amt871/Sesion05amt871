package ual.hmis.sesion05.ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
	ArrayList<Float> notas = new ArrayList<Float>();
	ArrayList<String> calificaciones = new ArrayList<String>();
	
	public void calculaCalificaciones(ArrayList<Float> notas) {
		for(Float nota : notas) {
			this.calificaciones.add(calificacion(nota));
		}
	}
	
	public String calificacion (double nota){
		String calificacion = "";
		if (nota >= 0 && nota <= 4.9) 
			calificacion = "Suspenso";
		else if (nota >= 0 && nota <= 6.9)
			calificacion = "Aprobado";
		else if (nota >= 0 && nota <= 8.9)
			calificacion = "Notable";
		else if (nota >= 0 && nota <= 9.9)
			calificacion = "Sobresaliente";
		else if (nota >= 0 && nota == 10)
			calificacion = "Matricula";
		else
			calificacion = "Error en la nota";
		return calificacion;
		}
}
