package Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;

public class Ejercicio9Cadena {
    public static void main(String[] args) {
        /*
            Dado el texto: “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”
            Realiza un programa que pregunte ¿Quién más estaba en casa de Juan? y el texto que indique el
            usuario debe de irse añadiendo antes de “y Mario”, mostrando el resultado final de la frase.

         */

        Scanner sc = new Scanner(System.in);

        String cadena = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";

        System.out.println("¿Quién más estaba en casa de Juan?");

        int posicion1 = cadena.indexOf(" y");
        int posicion2 = cadena.length();
        String fraseIzquierda = cadena.substring(0, posicion1);
        String frasederecha = cadena.substring(posicion1, posicion2);
        
        String nombre = sc.nextLine();

        System.out.println(fraseIzquierda + ", " + nombre + frasederecha);
        sc.close();

        }
}
