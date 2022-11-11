package Programacion.Seleccion;
import java.util.Scanner;

public class Ejemplo5Seleccion {
    public static void main(String[] args) {
        
        /*
         * Nota de numero a texto
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la nota que has sacado:");
        float nota = sc.nextFloat();
        

        sc.close();

        if (nota >= 0 && nota < 5 )
        {
            System.out.println("SUSPENSO");
        } 
        else if (nota >= 5 && nota <= 7 )
        {
            System.out.println("APROBADO");
        } 
        else if (nota >= 7 && nota <= 9 )
        {
            System.out.println("NOTABLE");
        } 
        else if (nota > 9 && nota <= 10 )
        {
            System.out.println("SOBRESALIENTE");
        } 

    }
}
