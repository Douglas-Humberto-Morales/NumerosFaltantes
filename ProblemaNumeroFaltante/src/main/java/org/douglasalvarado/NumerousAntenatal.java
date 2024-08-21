package org.douglasalvarado;

import java.util.Objects;

public class NumerousAntenatal {
    public String getNumerousFantasises(Integer[] listaNumerica) {
        //Generación de variables en uso

        //numeroAumento su objetivo es poder ser comparado
        //Para validar si se lleva la secuencia correcat
        Integer numeroAumento = listaNumerica[0];

        //numerous su objetivo es llevar registro de cuales
        //son los número faltantes en la lista
        StringBuilder numerous = new StringBuilder();

        //comparative su objetivo es poder aumentar y
        //reducir su valor para manejar retorno en un ciclo
        int comparative = 0;

        // Itera hasta que numeroAumento alcance el último valor en listaNumerica
        while (!Objects.equals(numeroAumento, listaNumerica[listaNumerica.length-1])) {
            // Verifica si el número actual no está en la posición esperada de la lista
            if(!(listaNumerica[comparative].equals(numeroAumento))) {
                if (numerous.isEmpty()) {
                    // Si es el primer número faltante es encontrado, lo agrega
                    // Directamente sin agregar una coma antes
                    numerous.append(numeroAumento);
                } else {
                    // Si ya hay números faltantes, agrega una coma antes de
                    // añadir el nuevo número
                    numerous.append(",").append(numeroAumento);
                }
                // Retrocede en la lista para verificar si falta algún número previo
                comparative--;
            }
            comparative++;
            numeroAumento++;
        }
        return numerous.toString();
    }
}
