package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== Responde con true o false ==");


        System.out.println("Tienes dinero?");
        boolean tengoDinero = sc.nextBoolean();

        System.out.println("Tienes reserva?");
        boolean tengoReserva = sc.nextBoolean();

        System.out.println("Tienes pasaporte en regla?");
        boolean tengoPasaporte = sc.nextBoolean();

        boolean voyDeVacaciones = tengoDinero || (tengoReserva && tengoPasaporte);



        System.out.println("Hijo1: Monataña Montaña(true) / Playa(false)");
        boolean hijo1Montaña = sc.nextBoolean();

        System.out.println("Hijo2: Monataña Montaña(true) / Playa(false)");
        boolean hijo2Montaña = sc.nextBoolean();

        System.out.println("Hijo3: Monataña Montaña(true) / Playa(false)");
        boolean hijo3Montaña = sc.nextBoolean();
        

        boolean voyALaMontaña = hijo1Montaña && hijo2Montaña && hijo3Montaña;
        


        System.out.println(voyDeVacaciones ? "Vas de vacaciones " + (voyALaMontaña ? "a la montaña" : "a la playa") : "No vas de vacaciones");

        //System.out.println("voy de vacaciones?: " + voyDeVacaciones);
        //System.out.println("Voy a la montaña? " + voyALaMontaña);
        
        

        sc.close();
    }
}
