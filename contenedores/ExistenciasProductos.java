package contenedores;

import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.Scanner;

import javax.security.sasl.SaslClientFactory;

import Practicas.nombreEdad;

public class ExistenciasProductos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        

        // Estructura dondo voy a guardar el código alfanumérico de la pieza
        // y el número de existencias

        HashMap<String, Integer> pieza = new HashMap<String, Integer>();
        // Muestro el menu
        menu();
        // Segun opcion llemoa al metodo que sea
        int opcion = sc.nextInt();
        int contador = 1;
        switch (opcion) {
            case 1:
                pieza.put("jhon", contador);
                System.out.print("Dime el stock: ");
                int stock = sc.nextInt();
                insertarProducto(pieza, opcion);
                break;
        
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
            mostrarExistencias(pieza);
            break;


        }

        mostrarExistencias(pieza);

    }

    // Metodo imprimir menu
    static void menu(){
        System.out.println("Menu");
        System.out.println("---------------------");
        System.out.println("1) Insertar producto");
        System.out.println("2) Eliminar producto");
        System.out.println("3) Cambiar stock");
        System.out.println("4) Mostrar existencia de cada referencia (producto)");
        System.out.print("Elige una opcion: ");
    }
    // Metodo insertar producto
    static void insertarProducto(HashMap<String, Integer> pieza, int stock){

        
    }
    // Metodo eliminar producto

    // Metodo cambiar stock

    // Metodo imprimir existencia de cada referencia (producto)
    static void mostrarExistencias(HashMap<String, Integer> pieza){
        for (String i : pieza.keySet()) {
            System.out.println("key: " + i + " value: " + pieza.get(i));
        }
        
    }

}



