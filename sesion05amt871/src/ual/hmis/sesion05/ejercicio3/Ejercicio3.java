package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String password (String entrada) {
		String salida = "";
		
		if (entrada.length() < 5)
			salida = "password demasiado corto";
		else if (entrada.length() <= 8)
			salida = "********";
		else if (entrada.length() >= 12 && entrada.length() <= 40)
			salida = "************";
		else 
			salida = "password demasiado largo";
		return salida;
	}
}
