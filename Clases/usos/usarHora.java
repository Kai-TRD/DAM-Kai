package Clases.usos;

import java.util.Scanner;

import Clases.ejemplos.Horas;

public class usarHora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indicame una hora:");
        int hora = sc.nextInt();

        System.out.println("Indicame un numero de segundos;");
        int segundos = sc.nextInt();

        Horas horas = new Horas(hora);

        for (int i = 0; i < segundos; i++) {
            System.out.println(horas.impresion());
            horas.addsegundos();
        }

        System.out.println("-FIN-");


    }
}
