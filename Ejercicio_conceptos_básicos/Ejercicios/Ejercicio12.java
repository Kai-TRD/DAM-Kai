package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Responde con true o false");
        System.out.println("==========================");
        
        System.out.println("Esta lloviendo fuera?");
        boolean estaLloviendo = sc.nextBoolean();

        System.out.println("Has terminado la tarea?");
        boolean tareaTerminada = sc.nextBoolean();

        System.out.println("Necesitas ir a la biblioteca?");
        boolean irBiblioteca = sc.nextBoolean();

        System.out.println("==============================");
        
        boolean puedoSalir = estaLloviendo==false && tareaTerminada==true;
        boolean puedoIrBiblioteca = irBiblioteca==true && tareaTerminada==true;
        System.out.println("Puedes salir? "+puedoSalir);
        
        System.out.println("Vas a la biblioteca? "+puedoIrBiblioteca);

        sc.close();
    }
}
