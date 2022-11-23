package Ejercicio_conceptos_básicos.Ejercicio_Basico_Clase_Math;

public class EjercicioMath7 {
    public static void main(String[] args) {
        
        double jugador1 = Math.round(Math.random()*6);
        double jugador2 = Math.round(Math.random()*6);
        double jugador3 = Math.round(Math.random()*6);

    System.out.println("El nº del jugador1 es:" + jugador1);
    System.out.println("El nº del jugador2 es:" + jugador2);
    System.out.println("El nº del jugador3 es:" + jugador3);

        double numeroMax1 = Math.max(jugador1, jugador2);
        double numeroMin1 = Math.min(jugador1, jugador2);

        double numeroMax2 = Math.max(numeroMax1, jugador3);
        double numeroMin2 = Math.min(numeroMin1, jugador3);

    System.out.println("El nº mayor es: " + numeroMax2 );
    System.out.println("El nº menor es: " + numeroMin2 );

    }
}
