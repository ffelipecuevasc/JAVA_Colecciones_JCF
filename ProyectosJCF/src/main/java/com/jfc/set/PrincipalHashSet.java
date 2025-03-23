package com.jfc.set;

import java.util.HashSet;
import java.util.Set;

public class PrincipalHashSet {
    public static void main(String[] args) {

        /*La principal característica de SET es que no permite elementos repetidos en la colección:
        *
        * - HashSet = clase que implementa SET y sus características son que no guarda los elementos
        * de manera ordenada, la estructura interna está basado en tabla hash, permite nulos, es rápido.
        * - HashSet = respecto al orden de inserción, como su estructura se basa en tabla hash, al
        * ingresar datos se calculan sus valores hash (hashCode()) y se guardan con una posición en base
        * a su valor hash. No respeta el orden de inserción.
        *
        * - TreeSet = clase que implementa SET y sus características son que ordena los elementos de
        * menor a mayor en orden natural, la estructura se basa en árbol rojo-negro, no permite nulos y
        * es más lento que HashSet.
        * - TreeSet = respecto al orden de los valores, se dice que su estructura es de árbol porque el
        * primer elemento es la raíz, el segundo se compara con el primero y si es menor va a la izquierda,
        * si es mayor va a la derecha y así. Se reorganiza el árbol si es necesario para mantener el
        * equilibrio.
        *
        * - LinkedHashSet = clase que implementa SET y se diferencia porque mantiene el orden de inserción,
        * se basa en LinkedHashMap (listas doblemente enlazadas), velocidad de eficiencia intermedia
        * entre las 2 implementaciones anteriores, permite elementos nulos.*/

        System.out.println("\nImplementación HashSet\n");
        Set<String> coleccionHashSet = new HashSet<String>();
        coleccionHashSet.add("Felipe");
        coleccionHashSet.add("Camila");
        coleccionHashSet.add("Jaime");
        coleccionHashSet.add("Francisca");
        coleccionHashSet.add("Daniel");
        coleccionHashSet.add("Lisi");

        boolean permiteHashSet = coleccionHashSet.add("Felipe");
        boolean permiteNulos = coleccionHashSet.add(null);

        System.out.println(coleccionHashSet);
        System.out.println("¿Permite elementos duplicados? - " + permiteHashSet);
        System.out.println("¿Permite elementos nulos? - " + permiteNulos + "\n");

        String[] arregloS = {"Felipe","Jaime","Luis","Franco","Felipe","Javier","Daniel","Luis"};
        Set<String> otraColeccionHashSet = new HashSet<String>();
        for(String aux : arregloS) {
            if(!otraColeccionHashSet.add(aux)) System.out.println("Elemento duplicado: " + aux);
        }
        System.out.println(otraColeccionHashSet.size() + " elementos no duplicados = " + otraColeccionHashSet);
    }
}
