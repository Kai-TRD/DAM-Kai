package interfaces.futbol;

import java.util.ArrayList;
import java.util.List;

public class UtilesJugadores {

    public static List<Jugador> generarJugadoresAleatorios(int cantidad) {

        String[] nombres = { "Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel" };
        String[] apellidos = { "García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez", "Hernández", "Jiménez" };
    
        String[] apodo1 = { "Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero", "Muñeco", "Burro", "Pantera" };
        String[] apodo2 = { "de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro" };

        List<Jugador> jugadoresGenerados = new ArrayList<>();

        while (jugadoresGenerados.size() < cantidad) {
            String nombre = nombres[(int) (Math.random() * nombres.length)] + " " + apellidos[(int) (Math.random() * apellidos.length)];
        
            String apodo = apodo1[(int) (Math.random() * apodo1.length)] + " " + apodo2[(int) (Math.random() * apodo2.length)];
        
            int goles = (int) (Math.random() * 11);
        
            int faltas = (int) (Math.random() * 11);
        
            Jugador jugador = new Jugador(nombre, apodo, goles, faltas);
        
            if (!jugadoresGenerados.contains(jugador)) {
                jugadoresGenerados.add(jugador);
            }
        }

        return jugadoresGenerados;
    }
    
    public static void main(String[] args) {
        List<Jugador> jugadoresGenerados = generarJugadoresAleatorios(5);

        for (Jugador jugador : jugadoresGenerados) {
            System.out.println(jugador);
        }
    }   
}

