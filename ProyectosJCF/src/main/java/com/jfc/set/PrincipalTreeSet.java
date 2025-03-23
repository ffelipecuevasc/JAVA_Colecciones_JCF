package com.jfc.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrincipalTreeSet {
    public static void main(String[] args) {

        System.out.println("\nImplementación TreeSet\n");
        Set<String> coleccionTreeSet = new TreeSet<String>();
        coleccionTreeSet.add("Felipe");
        coleccionTreeSet.add("Camila");
        coleccionTreeSet.add("Jaime");
        coleccionTreeSet.add("Francisca");
        coleccionTreeSet.add("Daniel");
        coleccionTreeSet.add("Lisi");

        boolean permiteTreeSet = coleccionTreeSet.add("Felipe");
        boolean permiteNulos = coleccionTreeSet.add(null);

        System.out.println(coleccionTreeSet);
        System.out.println("¿Permite elementos duplicados? - " + permiteTreeSet);
        System.out.println("¿Permite elementos nulos? - " + permiteNulos + "\n");

        String[] arregloS = {"Felipe","Jaime","Luis","Franco","Felipe","Javier","Daniel","Luis"};
        //Se ocupa un orden personalizado a través de la clase Comparator
        Set<String> otraColeccionTreeSet = new TreeSet<String>(Comparator.reverseOrder());
        for(String aux : arregloS) {
            if(!otraColeccionTreeSet.add(aux)) System.out.println("Elemento duplicado: " + aux);
        }
        System.out.println(otraColeccionTreeSet.size() + " elementos no duplicados = " + otraColeccionTreeSet);
    }
}
