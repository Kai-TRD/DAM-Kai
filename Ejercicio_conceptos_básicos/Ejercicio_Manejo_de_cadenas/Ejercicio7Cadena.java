package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;
public class Ejercicio7Cadena {
    public static void main(String[] args) {
        //Lee de teclado un carácter e indica si es un dígito, si es un espacio en blanco y si es un carácter en mayúscula. 
        //Realiza este ejercicio utilizando la clase Character

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce algo:");
        char caracter = sc.nextLine().charAt(0);

        boolean digito = Character.isDigit(caracter);
        boolean espacio = Character.isSpaceChar(caracter);
        boolean mayuscula = Character.isUpperCase(caracter);

        System.out.println((digito)? "Es un digito" : "No es un digito");
        System.out.println((espacio)? "Es un espacio" : "No es un espacio");
        System.out.println((mayuscula)? "Es un mayuscula" : "No es un mayuscula");

        sc.close();
        

    }
}
