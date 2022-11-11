package Programacion.EjerciciosDeRefuerzo;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Amplía el programa anterior para que diga la nota del boletín (insuficiente,
        //suficiente, bien, notable o sobresaliente).
        Scanner sc = new Scanner(System.in);
        System.out.print("Indicame la nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Indicame la nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.print("Indicame la nota 3: ");
        float nota3 = sc.nextFloat();
        sc.close();

        float media = (nota1+nota2+nota3)/3;
        System.out.print("La media de las tres notas son "+media+" siendo ");
        if (media >= 0 && media <=4){
            System.out.println("insuficiente");
        } else if (media == 5) {
            System.out.println("suficiente");
        } else if (media > 5 && media <=7) {
            System.out.println("un bien");
        } else if (media >= 8 && media <=9) {
            System.out.println("un notable");
        } else if (media == 10) {
            System.out.println("un sobresaliente");
        }




    }
}
