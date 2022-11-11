package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;

public class Ejercicio2Cadena {
    public static void main(String[] args) {
        //Leer de teclado un texto y un número y buscar que letra está en dicha posición. 
        //Controlar que la posición no sobrepase la longitud del texto introducido.

        Scanner sc = new Scanner(System.in);

        //Pido una cadena de texto
        System.out.println("Escribe una cadena de texto:");
        String texto = sc.nextLine();

        //Pido en numero de la posición
        System.out.println("Dime el numero de la posición:");
        int posicion = sc.nextInt();

        boolean noSobrepasa = (posicion <= texto.length())? true : false;

        System.out.println((noSobrepasa)? texto.charAt(posicion) : "Posición fuera de rango");

        System.out.println("En la posición " + posicion + " el caracter es " + texto.charAt(posicion) );

        sc.close();

    }
}
