package com.jfc.list;

import java.util.List;
import java.util.Vector;

public class PrincipalVector {
    public static void main(String[] args) {
        System.out.println("\nImplementación Vector\n");
        List<String> coleccionVector = new Vector<String>();
        coleccionVector.add("Felipe");
        coleccionVector.add("Camila");
        coleccionVector.add("Jaime");
        coleccionVector.add("Francisca");
        coleccionVector.add("Daniel");
        coleccionVector.add("Lisi");

        boolean permiteVector = coleccionVector.add("Felipe");
        boolean permiteNulos = coleccionVector.add(null);

        System.out.println(coleccionVector);
        System.out.println("¿Permite elementos duplicados? - " + permiteVector);
        System.out.println("¿Permite elementos nulos? - " + permiteNulos + "\n");
    }
}
