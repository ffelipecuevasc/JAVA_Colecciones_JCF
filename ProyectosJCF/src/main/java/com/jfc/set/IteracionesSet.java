package com.jfc.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteracionesSet {
    public static void main(String[] args) {

        System.out.println("\nImplementación LinkedHashSet - ITERACIONES\n");
        Set<String> coleccionLinkedHashSet = new LinkedHashSet<String>();
        coleccionLinkedHashSet.add("Felipe");
        coleccionLinkedHashSet.add("Camila");
        coleccionLinkedHashSet.add("Jaime");
        coleccionLinkedHashSet.add("Francisca");
        coleccionLinkedHashSet.add("Daniel");
        coleccionLinkedHashSet.add("Lisi");

        //For Each solo permite recorrer la colección, nada más
        System.out.println("Iterando con FOR EACH");
        for(String aux : coleccionLinkedHashSet){
            System.out.println("\t> " + aux);
        }

        //Al usar Iterator se pueden eliminar elementos de la colección y se puede iterar inversamente
        System.out.println("\nIterando con ITERATOR");
        Iterator<String> iterator = coleccionLinkedHashSet.iterator();
        while(iterator.hasNext()){
            String aux = iterator.next();
            System.out.println("\t- " + aux);
        }

        //Sintaxis de un For Each mucho más elegante y sencillo, pero igual que el For Each nativo
        System.out.println("\nIterando con FOR EACH - LAMBDA");
        coleccionLinkedHashSet.forEach(aux -> System.out.println("\t* " + aux));
    }
}
