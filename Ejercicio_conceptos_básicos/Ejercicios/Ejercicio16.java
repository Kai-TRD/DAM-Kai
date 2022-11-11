package Programacion.Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        final float PRECIONINOS = 15.50f;
        final float PRECIOADULTO = 20.00f;
        final float DESCUENTO = 0.05f;

        System.out.println("Cobro de entradas");
        System.out.println("=================");

        System.out.println("Cuantos niños son?");
        int ninos = sc.nextInt();

        System.out.println("Cuantos adultos?");
        int adultos = sc.nextInt();
        
        float precioTotal = (ninos*PRECIONINOS+adultos*PRECIOADULTO);

        precioTotal = (precioTotal>100) ? precioTotal-(precioTotal*DESCUENTO) : precioTotal;

        System.out.println("Tiene que pagar "+precioTotal+"€");

        sc.close();
    }
}
