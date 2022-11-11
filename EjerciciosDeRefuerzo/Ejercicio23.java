package Programacion.EjerciciosDeRefuerzo;
import java.util.Scanner;


public class Ejercicio23 {
    public static void main(String[] args) {
        
        /*
         *  Escribe un programa que calcule el precio final de un producto según su
            base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
            reducido o superreducido) y el código promocional. Los tipos de IVA general,
            reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
            promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
            respectivamente que no se aplica promoción, el precio se reduce a la mitad,
            se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
            muestran los valores correctos, aunque los números no estén tabulados.
            Ejemplo:
            Introduzca la base imponible: 25
            Introduzca el tipo de IVA (general, reducido o superreducido): reducido
            Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
            Base imponible 25.00
            IVA (10%) 2.50
            Precio con IVA 27.50
            Cód. promo. (mitad): -13.75
            TOTAL 13.75
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        int baseImponible = sc.nextInt();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        sc.nextLine();
        String tipoIva = sc.nextLine();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = sc.nextLine();

        System.out.println("=========================================");

        int porcentajeIva = 0;
        float importeIva = 0;
        
        int general = 21;
        int reducido = 10;
        int superreducido = 4;

        switch (tipoIva) {
            case "general":
                porcentajeIva = 21;
                importeIva = baseImponible*general/100; 
            break;
            case "reducido":
                porcentajeIva = 10;
                importeIva = baseImponible*reducido/100; 
            break;
            case "superreducido":
                porcentajeIva = 4;
                importeIva = baseImponible*superreducido/100; 
            break;
        }




            System.out.println("Base imponiblre: "+baseImponible);
            System.out.println("IVA ("+porcentajeIva+"): "+importeIva);

 //           System.out.printf("Base Imponible \t%", baseImponible);
 //     System.out.printf("IVA (%) \t%", porcentajeIva, importeIva);


    }
}   