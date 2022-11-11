package Programacion.EjerciciosDeRefuerzo;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Realiza un programa que calcule la media de tres notas.

        Scanner sc = new Scanner(System.in);
        System.out.print("Indicame la nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Indicame la nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.print("Indicame la nota 3: ");
        float nota3 = sc.nextFloat();
        sc.close();

        float media = (nota1+nota2+nota3)/3;
        System.out.println("La media de las tres notas son "+media);
        











    }
}
