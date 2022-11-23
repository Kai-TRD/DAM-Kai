package EjerciciosDeRefuerzo;

import java.util.Scanner;

public class Ejercicio28 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = sc.nextLine();

//        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
//        String jugador2 = sc.nextLine();


        double random = Math.round(Math.random()*3);
        String jugador2 = "piedra";
        if (random == 1){
            jugador2 = "piedra";
            System.out.println("Jugador 2 saca piedra");
        } else
        if (random == 2){
            jugador2 = "papel";
            System.out.println("Jugador 2 saca papel");
        } else
        if (random == 3){
            jugador2 = "tijera";
            System.out.println("Jugador 2 saca tijera");
        }

        System.out.println(random);
        


        sc.close();

        String gana1 = "Gana jugador 1";
        String gana2 = "Gana jugador 2";

            if(jugador1.equals("piedra") && jugador2.equals("piedra")){
                System.out.println("empate");
            } else
            if(jugador1.equals("papel") && jugador2.equals("papel")){
                System.out.println("empate");
            } else
            if(jugador1.equals("tijera") && jugador2.equals("tijera")){
                System.out.println("empate");
            } else



            if(jugador1.equals("piedra") && jugador2.equals("papel")){
                System.out.println(gana2);
            } else
            if(jugador1.equals("piedra") && jugador2.equals("tijera")){
                System.out.println(gana1);
            } else


            if(jugador1.equals("papel") && jugador2.equals("piedra")){
                System.out.println(gana1);
            } else
            if(jugador1.equals("papel") && jugador2.equals("tijera")){
                System.out.println(gana2);
            } else

            if(jugador1.equals("tijera") && jugador2.equals("piedra")){
                System.out.println(gana2);
            } else
            if(jugador1.equals("tijera") && jugador2.equals("papel")){
                System.out.println(gana1);
            } else
            ;






    }
}
