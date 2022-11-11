package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Basico_Clase_Math;

import java.util.Scanner;

public class EjercicioMath2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de potencial");

        System.out.println("Dime el primer valor:");
        int n1 = sc.nextInt();

        System.out.println("Dime el segundo numero:");
        int n2 = sc.nextInt();

        System.out.println("El exponencial es: "+ Math.pow(n1, n2));

        sc.close();
    }
}
