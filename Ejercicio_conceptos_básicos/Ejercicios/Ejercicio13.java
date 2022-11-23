package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Responde con un true o false");
        System.out.println("==================================");

        System.out.println("Eres socio?");
        boolean socio = sc.nextBoolean();

        System.out.println("Tienes cuotas al día?");
        boolean pagarCuota = sc.nextBoolean();

        System.out.println("Has sido recomendado por un VIP?");
        boolean recomendacion = sc.nextBoolean();

        System.out.println("Estas en periodo de pruebas?");
        boolean periodoPruebas = sc.nextBoolean();
        
        System.out.println("=================================");
        
        boolean vip = (socio && pagarCuota)||(recomendacion && periodoPruebas);

        String mensaje = vip ? "ERES VIP, ENTRA!" : "FUERA DE AQUI, NO ERES VIP!";

        System.out.println(mensaje);

        sc.close();
    }
}
