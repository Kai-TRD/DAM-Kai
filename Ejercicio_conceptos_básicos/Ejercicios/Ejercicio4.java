package Programacion.Ejercicio_conceptos_básicos.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu fecha de nacimiento, solo el año:");
        int fecha1 =sc.nextInt();

        System.out.println("Dime la fecha que quieras, solo el año:");
        int fecha2 =sc.nextInt();

        System.out.println("Tu edad en ese entonces es "+(fecha2 - fecha1));
        sc.close();
}    
}
