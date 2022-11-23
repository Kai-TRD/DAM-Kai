package Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;

public class Ejercicio4Cadena {
    public static void main(String[] args) {
        //Dado un texto, reemplazar el carácter indicado por el usuario por otro caracter también indicado por el usuario.
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola gente de mijas");
        String cadena = "Hola gente de mijas";
        
        System.out.println("Dime el caracter a sustituir");
        String caracter1 = sc.nextLine();

        System.out.println("Dime el caracter nuevo");
        String caracter2 = sc.nextLine();

        System.out.println((cadena.replace(caracter1, caracter2)));
sc.close();

    }
}
