package Seleccion;
import java.util.Scanner;

public class Ejemplo4Seleccion {
    public static void main(String[] args) {
        
        /*
         * Segun el bnumero que introduzcan
         * indica el dia de la semana
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero del 1-7");
        int diaDeLaSemana = sc.nextInt();

        sc.close();

        if (diaDeLaSemana ==1)
        {
            System.out.println("LUNES");
        }
        else if (diaDeLaSemana ==2)
        {
            System.out.println("MARTES");
        }
        else if (diaDeLaSemana ==3)
        {
            System.out.println("MIERCOLES");
        }
        else if (diaDeLaSemana ==4)
        {
            System.out.println("JUEVES");
        }
        else if (diaDeLaSemana ==5)
        {
            System.out.println("VIERNES");
        }
        else if (diaDeLaSemana ==6)
        {
            System.out.println("SABADO");
        }
        else if (diaDeLaSemana ==7)
        {
            System.out.println("DOMINGO");
        }
        else
        {
            System.out.println("Valor introducido no valido");
        }
        
        



    }
}
