package Interfaces.futbol;

public class JugadoresSpain {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("Sean Gill", "La Pulga", 2, 0);
        Jugador jugador2 = new Jugador("Aubrey Camacho", "El Perro", 4, 1);
        Jugador jugador3 = new Jugador("Jayson Vaughan", "La serpiente", 3, 4);
        Jugador jugador4 = new Jugador("Alfredo Arias", "El animal", 6, 0);
        Jugador jugador5 = new Jugador("Willard Powell", "El Gato", 0, 2);
        Jugador jugador6 = new Jugador("Justin Banks", "El Conejo", 5, 0);
        Jugador jugador7 = new Jugador("Aubrey Tanner", "El Conejo", 8, 2);
        Jugador jugador8 = new Jugador("Desmond Sanchez", "El Piojo", 6, 4);
        Jugador jugador9 = new Jugador("Donnie Boyd", "El Puma", 8, 4);
        Jugador jugador10 = new Jugador("Courtney Monroe", "La Gacela", 7, 5);
        Jugador jugador11 = new Jugador("Norberto Beck", "Burrito", 3, 1);



        
        Jugador[] equipo = {jugador1, jugador2, jugador3, jugador4, jugador5, jugador6, jugador7, jugador8, jugador9, jugador10, jugador11 };
       

        System.out.println("--------------Jugadores--------------");
        imprimir(equipo);


        
    }

    /**
     * Imprimir jugadores
     * @param array
     */
    static void imprimir(Jugador[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
