package Programacion.Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;
/*
 * Flutero ---Calcular beneficio
 *                    |
 *                    |`--Peras = 2.35€/kg
 *                     `--Manzana =1.95€/kg
 * 
 * Pedir -> kg vendidos de peras y manzanas
 *   |
 *   |          
 *   `--Gastos---luz = ¿?
 *             |
 *              `gasolina = 0.60€/kg
 * 
 * Resultado -> beneficio Mensual
 */ 
public class Ejercicio6_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final float PPERA = 2.35f;
        final float PMANZANA = 1.95f;
        final float GASOLINA = 0.60f;

        System.out.println("==========");
        System.out.println("||VENTAS||");
        System.out.println("==========");

        System.out.println("Kg de Peras vendidas al mes:");
        int peras =sc.nextInt();


        System.out.println("KG de Manzanas vendidas al mes:");
        int manzanas =sc.nextInt();
        
        System.out.println("==========");
        System.out.println("||GASTOS||");
        System.out.println("==========");

        System.out.println("Dime el precio de la luz al mes:");
        int luz =sc.nextInt();
        System.out.println("El precio de la gasolina es "+GASOLINA+"/kg");
        
        System.out.println("Ingresos: " +((peras*PPERA+manzanas*PMANZANA)+((peras+manzanas)*GASOLINA)-luz)+"€");
        System.out.println("Gastos: "+(((peras+manzanas)*GASOLINA)+luz) +"€");
        System.out.println("Beneficio: "+(((peras*PPERA+manzanas*PMANZANA)+((peras+manzanas)*GASOLINA)-luz)-(((peras+manzanas)*GASOLINA)+luz)));

        sc.close();
        
    }
}
