package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Basico_Clase_Math;

import java.util.Scanner;

public class EjercicioMath1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe un numero decimal");

    float numero1 = sc.nextFloat();

    System.out.println("Su valor absoluto es: " + Math.round(numero1));



sc.close();


   } 
}
