package Seleccion;

import java.util.Scanner;

public class Ejemplo8Seleccion {

    /*
     * Dime los dias de los meses con un switch
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el numero del mes(1-12)");
        int mes = sc.nextInt();
        System.out.println(mes);
        sc.close();
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            default:
                System.out.println("No es un mes del calendario");
                break;
        }
    }
}