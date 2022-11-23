package Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;

public class Ejercicio1Cadena {
    public static void main(String[] args) {
        //Lee de teclado un texto y devuelve por pantalla la cantidad de caracteres tiene dicho texto.

        Scanner sc = new Scanner(System.in);

        //Pido el texto y lo leo
        System.out.println("Escribeme una linea de texto:");
        String texto = sc.nextLine();


        int cantidadCaracteres = texto.length();
        System.out.println("Hay un total de: " + cantidadCaracteres +" caracteres");

        sc.close();
    }
}
