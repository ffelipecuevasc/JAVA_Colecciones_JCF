package com.jfc.set;

import java.util.Set;
import java.util.LinkedHashSet;

public class PrincipalLinkedHashSet {
    public static void main(String[] args) {


        System.out.println("\nImplementación LinkedHashSet\n");
        Set<String> coleccionLinkedHashSet = new LinkedHashSet<String>();
        coleccionLinkedHashSet.add("Felipe");
        coleccionLinkedHashSet.add("Camila");
        coleccionLinkedHashSet.add("Jaime");
        coleccionLinkedHashSet.add("Francisca");
        coleccionLinkedHashSet.add("Daniel");
        coleccionLinkedHashSet.add("Lisi");

        boolean permiteLinkedHashSet = coleccionLinkedHashSet.add("Felipe");
        boolean permiteNulos = coleccionLinkedHashSet.add(null);

        System.out.println(coleccionLinkedHashSet);
        System.out.println("¿Permite elementos duplicados? - " + permiteLinkedHashSet);
        System.out.println("¿Permite elementos nulos? - " + permiteNulos + "\n");

        String[] arregloS = {"Felipe","Jaime","Luis","Franco","Felipe","Javier","Daniel","Luis"};
        Set<String> otraColeccionLinkedHashSet = new LinkedHashSet<String>();
        for(String aux : arregloS) {
            if(!otraColeccionLinkedHashSet.add(aux)) System.out.println("Elemento duplicado: " + aux);
        }
        System.out.println(otraColeccionLinkedHashSet.size() + " elementos no duplicados = " + otraColeccionLinkedHashSet);
    }
}
