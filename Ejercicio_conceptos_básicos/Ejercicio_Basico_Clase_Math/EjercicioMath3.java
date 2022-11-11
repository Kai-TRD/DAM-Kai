package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Basico_Clase_Math;

import java.util.Scanner;

public class EjercicioMath3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Double numero = Math.random();
        
        System.out.println(Math.round(numero));
        System.out.println((Math.round(numero)>0) ? "Esta mas cerca de 1" : "Esta mas cerca de 0");
        
        sc.close();
    }
}
