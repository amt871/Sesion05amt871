package ual.hmis.sesion05.ejercicio5;

import java.util.ArrayList;

public class Ejercicio5 {
	
    ArrayList<String> listaOrdenadaEstudiantes (ArrayList<String> A, ArrayList<String> B){
        ArrayList<String> resultado= new ArrayList<String>();
        if(A.isEmpty() && B.isEmpty()) return resultado;
        else if(A.isEmpty()) return B;
        else if(B.isEmpty()) return A;

        for (String a : A) {
            resultado.add(a);
        }

        for (String b :B) {
            if(!resultado.contains(b))
                resultado.add(b);
        }

        resultado.sort(null);
        return resultado;

    }
}
