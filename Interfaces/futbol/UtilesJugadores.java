package Interfaces.futbol;

public class UtilesJugadores {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
        String[] apellidos = {"García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez", "Hernández", "Jiménez"};


        String[] apodo1 = {"Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero", "Muñeco", "Burro", "Pantera"};
        String[] apodo2 = {"de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " " + apellidos[i] + " " + apodo1[(int)(Math.random()*apodo1.length)] + " " + apodo2[(int)(Math.random()*apodo2.length)]);
        }
    
    
    }


}
