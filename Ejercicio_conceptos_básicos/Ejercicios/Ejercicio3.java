package Programacion.Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu fecha de nacimiento, solo el año:");
        int fecha =sc.nextInt();

        System.out.println("Tu edad actual es "+(2022 - fecha));
        sc.close();
}    
}
