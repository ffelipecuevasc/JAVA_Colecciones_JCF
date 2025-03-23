package com.jfc.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PrincipalHashMap {
    public static void main(String[] args) {

        /*Características de la interfaz MAP
        *
        * La más importante es que a diferencia de SET y LIST, esta interfaz permite almacenar
        * conjuntos de valores en una estructura de MAP <C, V>, donde C es una clave que identifica
        * el segundo elemento que es V como representación del valor que contiene C
        *
        * MAP - Almacena claves y valores, permite duplicados solo en valores, el acceso a los elementos
        * es solamente a través de la clave, el ordenamiento depende de la implementación.
        *
        * LIST - Almacena elementos ordenados (solo 1 elemento), permite duplicados, el acceso a los
        * elementos es a través de sus índices y mantiene el orden de inserción.
        *
        * SET - Almacena elementos únicos (solo 1 elemento), no permite duplicados, el acceso a los
        * elementos es a través de iteraciones y el ordenamiento depende de la implementación.*/

        System.out.println("\nImplementación HashMap\n");
        Map<String, String> coleccionHashMap = new HashMap<String, String>();
        coleccionHashMap.put("nombre", "Felipe");
        coleccionHashMap.put("apellido", "Cuevas");
        coleccionHashMap.put("edad", "35");
        coleccionHashMap.put("pais", "Chile");

        //HashMap permite claves nulas, pero no repetidas (deben ser únicas, si repites sobrescribe)
        //HashMap permite valores nulos y repetidos
        System.out.println(coleccionHashMap);

        boolean eliminarInventado = coleccionHashMap.remove("pais","Brasil");
        System.out.println("\n¿Eliminó el valor inventado de una clave asignada? = " + eliminarInventado);

        boolean eliminarReal = coleccionHashMap.remove("pais","Chile");
        System.out.println("¿Eliminó el valor real de una clave asignada? = " + eliminarReal);

        System.out.println("¿Encuentra la clave 'edad'? = " + coleccionHashMap.containsKey("edad"));
        System.out.println("¿Encuentra el valor '35'? = " + coleccionHashMap.containsValue("35"));
    }
}
