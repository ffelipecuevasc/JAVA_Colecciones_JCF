package com.jfc.list;

import java.util.LinkedList;
import java.util.List;

public class PrincipalLinkedList {
    public static void main(String[] args) {

        System.out.println("\nImplementación LinkedList\n");
        List<String> coleccionLinkedList = new LinkedList<String>();
        coleccionLinkedList.add("Felipe");
        coleccionLinkedList.add("Camila");
        coleccionLinkedList.add("Jaime");
        coleccionLinkedList.add("Francisca");
        coleccionLinkedList.add("Daniel");
        coleccionLinkedList.add("Lisi");

        boolean permiteLinkedList = coleccionLinkedList.add("Felipe");
        boolean permiteNulos = coleccionLinkedList.add(null);

        System.out.println(coleccionLinkedList);
        System.out.println("¿Permite elementos duplicados? - " + permiteLinkedList);
        System.out.println("¿Permite elementos nulos? - " + permiteNulos + "\n");

        coleccionLinkedList.remove(7);

        /*En Java, la clase LinkedList<E> implementa tanto la interfaz List<E> como Deque<E>,
        lo que significa que puede funcionar como Pila (Stack) y como Cola (Queue) dependiendo
        de cómo se use.

        PILAS = LIFO (Last In, First Out) → El último en entrar es el primero en salir.

        Se maneja como una estructura de último en entrar, primero en salir (LIFO). Los métodos
        principales para manipular una pila con LinkedList son:

        - push(E e): Inserta un elemento al inicio de la lista (actúa como push en una pila).
        - pop(): Elimina y devuelve el primer elemento (actúa como pop en una pila).
        - peek(): Obtiene el primer elemento sin eliminarlo.

        COLAS = FIFO (First In, First Out) → El primero en entrar es el primero en salir.

        Se maneja como una cola de espera, donde el primer elemento en ingresar es el primero en salir.
        Los métodos principales son:

        - offer(E e): Inserta un elemento al final de la lista.
        - poll(): Elimina y devuelve el primer elemento.
        - peek(): Obtiene el primer elemento sin eliminarlo.
        */

        //Se puede clonar un objeto dándole una nueva referencia de memoria para no afectar el original
        LinkedList<String> coleccionLL = new LinkedList<>(coleccionLinkedList);
        LinkedList<String> pila = new LinkedList<>(coleccionLinkedList);
        LinkedList<String> cola = new LinkedList<>(coleccionLinkedList);

        coleccionLL.addFirst("R2D2");
        coleccionLL.addLast("C3P0");
        System.out.println(coleccionLL);
        System.out.println("Primer elemento: " + coleccionLL.getFirst());
        System.out.println("Último elemento: " + coleccionLL.getLast());
        System.out.println("Segundo elemento: " + coleccionLL.get(2));

        System.out.println("\nPILA");
        System.out.println("Agregando al principio de la pila el elemento 'Luke Skywalker'");
        pila.push("Luke Skywalker");
        System.out.println(pila);
        System.out.println("Primer elemento eliminado: " + pila.pop());
        System.out.println(pila);
        System.out.println("Mostrando el nuevo primer elemento: " + pila.peek());
        System.out.println(pila);

        System.out.println("\nCOLA");
        System.out.println("Agregando al final de la cola el elemento 'Darth Vader'");
        cola.offer("Darth Vader");
        System.out.println(cola);
        System.out.println("Primer elemento eliminado: " + cola.poll());
        System.out.println(cola);
        System.out.println("Mostrando el nuevo primer elemento: " + cola.peek());
        System.out.println(cola);
    }
}
