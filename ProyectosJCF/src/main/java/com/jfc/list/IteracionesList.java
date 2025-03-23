package com.jfc.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteracionesList {
    public static void main(String[] args) {
        System.out.println("\nImplementación ArrayList - ITERACIONES\n");
        List<String> coleccionArrayList = new ArrayList<>();
        coleccionArrayList.add("Felipe");
        coleccionArrayList.add("Camila");
        coleccionArrayList.add("Jaime");
        coleccionArrayList.add("Francisca");
        coleccionArrayList.add("Daniel");
        coleccionArrayList.add("Lisi");

        //For Each solo permite recorrer la colección, nada más
        System.out.println("Iterando con FOR EACH");
        for(String aux : coleccionArrayList){
            System.out.println("\t> " + aux);
        }

        //Al usar Iterator se pueden eliminar elementos de la colección y se puede iterar inversamente
        System.out.println("\nIterando con ITERATOR");
        Iterator<String> iterator = coleccionArrayList.iterator();
        while(iterator.hasNext()){
            String aux = iterator.next();
            System.out.println("\t- " + aux);
        }

        //Sintaxis de un For Each mucho más elegante y sencillo, pero igual que el For Each nativo
        System.out.println("\nIterando con FOR EACH - LAMBDA");
        coleccionArrayList.forEach(aux -> System.out.println("\t* " + aux));
    }
}
