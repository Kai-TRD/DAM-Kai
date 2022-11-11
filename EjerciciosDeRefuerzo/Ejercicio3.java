package Programacion.EjerciciosDeRefuerzo;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
        //diente nombre del día de la semana.

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un dia de la semana en numero(1-7)");
        int dia = sc.nextInt();
        sc.close();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR: numero de dia introducido no comprendido");
                break;
        }
    }
}
