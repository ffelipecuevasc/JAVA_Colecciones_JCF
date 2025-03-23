package com.jfc.list;

import java.util.ArrayList;

import java.util.List;

public class PrincipalArrayList {
    public static void main(String[] args) {

        /*La interfaz LIST se diferencia a la SET en que si permite duplicados, mantiene el orden de
        * inserción, se puede acceder a los elementos por índice y se basa en una colección dinámica.
        *
        * - ArrayList = la implementación más conocida de List, su estructura se basa en una colección
        * dinámica, el acceso por índice es rápido.
        *
        * - LinkedList = esta implementación de List tiene una estructura de lista doblemente enlazada,
        * el acceso por índice es lento.
        *
        * - Vector = otra implementación de List, la estructura que tiene es la misma que ArrayList pero
        * sincronizada (para entornos de múltiples hilos) y su acceso por índice es rápido.*/

        System.out.println("\nImplementación ArrayList\n");
        List<String> coleccionArrayList = new ArrayList<String>();
        coleccionArrayList.add("Felipe");
        coleccionArrayList.add("Camila");
        coleccionArrayList.add("Jaime");
        coleccionArrayList.add("Francisca");
        coleccionArrayList.add("Daniel");
        coleccionArrayList.add("Lisi");

        boolean permiteArrayList = coleccionArrayList.add("Felipe");
        boolean permiteNulos = coleccionArrayList.add(null);

        System.out.println(coleccionArrayList);
        System.out.println("¿Permite elementos duplicados? - " + permiteArrayList);
        System.out.println("¿Permite elementos nulos? - " + permiteNulos);
        System.out.println("Tamaño de la colección ArrayList - " + coleccionArrayList.size() + "\n");

        coleccionArrayList.set(7,"Francisco Felipe");
        System.out.println("Reemplazo del último elemento");
        System.out.println(coleccionArrayList);

        coleccionArrayList.remove(7);
        System.out.println("\nEliminación del último elemento");
        System.out.println(coleccionArrayList);

        boolean contenido = coleccionArrayList.contains("Lisi");
        System.out.println("\n¿Encontró el elemento 'Lisi'? - " + contenido);
    }
}
