package Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;

public class Ejercicio8Cadena {
    public static void main(String[] args) {
        //Realiza el ejercicio 7 pero utilizando los códigos ASCII de los caracteres.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce algo:");
        char caracter = sc.nextLine().charAt(0);

        int codigoCaracter = (int)caracter;


        boolean digito = codigoCaracter >= 48 &&  codigoCaracter <= 57;

        boolean espacio = codigoCaracter == 32;
        
        boolean mayuscula = codigoCaracter >= 65 && codigoCaracter <= 90;

        System.out.println((digito)? "Es un digito" : "No es un digito");
        System.out.println((espacio)? "Es un espacio" : "No es un espacio");
        System.out.println((mayuscula)? "Es una mayuscula" : "No es un mayuscula");
        sc.close();
    }
}
