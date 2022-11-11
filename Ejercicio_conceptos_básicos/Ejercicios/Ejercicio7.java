package Programacion.Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        final float PI = 3.14f;

        System.out.println("Introduzca el radio:");
        float radio = sc.nextFloat();

        System.out.println("La longitud es: " + 2*PI*radio);
        System.out.println("El area es: " + PI*(radio*radio));

        sc.close();
    }    
}
