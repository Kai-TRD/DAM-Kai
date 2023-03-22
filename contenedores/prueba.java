package contenedores;

import java.util.ArrayList;
import java.util.HashSet;

public class prueba {
    public static void main(String[] args) {
        
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        HashSet<Integer> elementosSinRepetir = new HashSet <Integer>();
        HashSet<Integer> elementosRepetidos = new HashSet <Integer>();
        HashSet<Integer> elementosSoloUnaVez = new HashSet <Integer>();


        for (int i = 0; i < 100; i++) {

            int numero = (int)((Math.random()*10)+1);
            listaNumeros.add(numero);
        }

        System.out.println(listaNumeros);

        System.out.println("La lista tiene: " + listaNumeros.size() + " elementos");


        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) == 5) {
                listaNumeros.remove(i);
            }
        }

        System.out.println("La lista tiene: " + listaNumeros.size() + " elementos");

    }


}
