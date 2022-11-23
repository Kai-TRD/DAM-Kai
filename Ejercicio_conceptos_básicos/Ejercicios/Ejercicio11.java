package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int examen1 = 40;
        final int examen2 = 60;

        System.out.println("Nota del primer examen:");
        float nota1 = sc.nextFloat();

        System.out.println("Que nota quieres sacar en el trimestre?");
        float notaFinal = sc.nextFloat();

        float nota2 = (notaFinal - (nota1 * examen1)) / examen2;
        
        System.out.println("Debes sacar "+nota2+"para conseguir un "+notaFinal);

        sc.close();
    }
}
