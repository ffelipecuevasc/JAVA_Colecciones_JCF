package com.jfc.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteracionesMap {
    public static void main(String[] args) {
        System.out.println("\nImplementación HashMap\n");
        Map<String, String> coleccionHashMap = new HashMap<String, String>();
        coleccionHashMap.put("nombre", "Felipe");
        coleccionHashMap.put("apellido", "Cuevas");
        coleccionHashMap.put("edad", "35");
        coleccionHashMap.put("pais", "Chile");

        System.out.println("Iterando las claves");
        Set<String> claves = coleccionHashMap.keySet();
        for(String aux : claves){
            System.out.println("\tClave = " + aux);
        }

        System.out.println("\nIterando los valores");
        Collection<String> valores = coleccionHashMap.values();
        for(String aux : valores){
            System.out.println("\tValor = " + aux);
        }

        System.out.println("\nIterando las claves y sus valores");
        for(Map.Entry<String, String> aux : coleccionHashMap.entrySet()){
            System.out.println("\tClave >> " + aux.getKey() + " | Valor >> " + aux.getValue());
        }
    }
}
