package Colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Collection;

public class ejercicio2 {
    public static void main(String[] args) {

        // Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
        // ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
        // números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
        // y 20 elementos ambos inclusive.

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        int longitudLista = (int) ((Math.random() * 11) + 10);

        for (int i = 0; i < longitudLista; i++) {
            listaNumeros.add((int) (Math.random() * 101));
        }

        System.out.println("tamaño: " + listaNumeros.size());

        System.out.println(listaNumeros);

        System.out.println("La suma es: " + suma(listaNumeros));
        
    }


    public static int suma(ArrayList<Integer> lista){
        int total = 0;

        for (Integer numer : lista) {
            total += numer;
        }
        
        return total;
    }


}
