package Programacion.Practicas;
import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
    
        final int MAYORIA_EDAD = 18;

        System.out.println("¿Que edad tienes?");
        
        Scanner sc = new Scanner(System.in);

        int edad =sc.nextInt(); 


        boolean resultado = (edad >= MAYORIA_EDAD);

        System.out.println("¿Eres mayor de edad? " + resultado);
     
        sc.close();
    }
}
