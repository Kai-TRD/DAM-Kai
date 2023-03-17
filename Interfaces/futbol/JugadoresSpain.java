package Interfaces.futbol;

public class JugadoresSpain {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("Emilia Brown", "EStrella del campo", 6, 1);
        // Jugador jugador2 = new Jugador("Jhonathan Joestar", "El nomble", 5, 0);
        // Jugador jugador3 = new Jugador("Robert Furigan", "El loco", 2, 2);
        // Jugador jugador4 = new Jugador("Artorias Pendragon", "El caballero", 2, 4);
        // Jugador jugador5 = new Jugador("Dio Brando", "El vampiro", 12, 15);
        





        System.out.println("--------------Jugadores--------------");
        System.out.println(jugador1);
        jugador1.cometerFalta();
        System.out.println(jugador1);
        jugador1.HacerGol();
        System.out.println(jugador1);

    }
}
