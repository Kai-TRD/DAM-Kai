package Practicas;
import java.util.Scanner;

public class calculos {
    public static void main(String[] args) {
        /*
         *Pedir 2 operandos y hacer las operaciones básicas 
         * +,-, / y el Modulo(%)
         * 
         */
        
        Scanner puertaLectura =new Scanner(System.in);
        
        System.out.println("Introduzca un valor:");
        int operador1 = puertaLectura.nextInt();

        System.out.println("Introduzca otro valor:");
        int operador2 = puertaLectura.nextInt();

        int suma = operador1 + operador2;
        System.out.println("La suma es: " + suma);

        int resta = operador1 - operador2;
        System.out.println("La resta es: " + resta);

        int multiplicacion = operador1 * operador2;
        System.out.println("La multiplicación es: " + multiplicacion);

        int division = operador1 / operador2;
        System.out.println("La división es: " + division);
        

        int restoDiv = operador1 % operador2;    
        System.out.println("El Módulo es: " + restoDiv);
    
        puertaLectura.close();
    }
}
