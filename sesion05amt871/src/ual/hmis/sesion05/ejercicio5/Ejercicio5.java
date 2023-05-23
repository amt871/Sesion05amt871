package ual.hmis.sesion05.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

	List<String> listaOrdenada (List<String> listaA, List<String> listaB){
		ArrayList<String> resultado= new ArrayList<String>();
		if(listaA.isEmpty() && listaB.isEmpty()) return resultado;
		else if(listaA.isEmpty()) return listaB;
		else if(listaB.isEmpty()) return listaA;

		for (String a : listaA) {
			resultado.add(a);
		}

		for (String b :listaB) {
			if(!resultado.contains(b))
				resultado.add(b);
		}

		resultado.sort(null);
		return resultado;

	}
}
