package main;

import java.util.*;

public class App {
    public static void main(String[] args) {
        LogicaClasificacion logica = new LogicaClasificacion();

        
        Queue<String> colaNombres = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));
        Queue<String> invertida = logica.invertirColaNombres(colaNombres);
        System.out.println("Cola invertida: " + invertida);  
       
        Queue<Integer> cola1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        Queue<Integer> cola2 = new LinkedList<>(Arrays.asList(2, 4, 6, 8));
        Queue<Integer> intercalada = logica.intercalarColas(cola1, cola2);
        System.out.println("Cola intercalada: " + intercalada);  
    }
}
