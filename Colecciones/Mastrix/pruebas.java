package Colecciones.Mastrix;

import java.util.ArrayList;

public class pruebas {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>(); // ArrayList de tipo String

// Agregar elementos a la lista
lista.add("Elemento 1");
lista.add("Elemento 2");
lista.add("Elemento 3");

System.out.println("Lista original: " + lista); // Imprimir lista original

int index = 1; // Índice del elemento que deseamos reemplazar
String nuevoElemento = "Elemento Nuevo"; // Nuevo elemento que deseamos insertar

lista.set(index, nuevoElemento); // Reemplazar el elemento en el índice indicado

System.out.println("Lista después del reemplazo: " + lista); // Imprimir lista después del reemplazo

    }

}
