package Programacion.Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int patasHormiga = 6;
        final int patasArana = 8;
        final int patasCochinilla = 14;

        System.out.println("Cuantas Hormigas has capturado?");
        int hormigas = sc.nextInt();

        System.out.println("Cuantas Aranas has capturado?");
        int aranas = sc.nextInt();

        System.out.println("Cuantas Cochinillas has capturado?");
        int cochinillas = sc.nextInt();

        int patas = hormigas*patasHormiga + aranas*patasArana + cochinillas*patasCochinilla; 
        System.out.println("Tienes un total de "+patas+" patas");
        
        sc.close();
    }
}
