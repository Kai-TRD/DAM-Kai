package Programacion.Bucles;

import java.util.Scanner;

public class EjemploBucle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime unas edades:");
        int edades = sc.nextInt();

        int minimo = 0;
        int maximo = 0;

        while (edades != -1){
            if(edades > maximo){
                maximo = edades;
            }
            if (edades < minimo){
                minimo = edades;
            }
            System.out.println("edad es: "+edades);
            edades=sc.nextInt();
        }
        System.out.println("maximo: "+maximo);
        System.out.println("minimo; "+minimo);

        if(maximo != -1){
            System.out.println("La edad maxima es: "+maximo+" y la minima es "+minimo);
        } else {
            System.out.println("No has introducido ninguna edad valida");
        }
    sc.close();
    }
}
