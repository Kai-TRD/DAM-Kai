package EjerciciosDeRefuerzo;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
//Escribe un programa que pida por teclado un día de la semana y que diga qué
//asignatura toca a primera hora ese día.

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia de la semana(1-5):");
        int dia = sc.nextInt();
        sc.close();

        switch (dia) {
            case 1:
                System.out.println("Lenguaje de marcas");
                break;
            case 2:
                System.out.println("Entorno de desarrollo");
                break;
            case 3:
                System.out.println("Lenguaje de marcas");
                break;
            case 4:
                System.out.println("Base de datos");
                break;
            case 5:
                System.out.println("Programacion");
                break;
            default:
                System.out.println("ERROR: dia no comprendido");
                break;

        }


    }
}
