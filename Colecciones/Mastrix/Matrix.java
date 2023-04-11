package Colecciones.Mastrix;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;

import javax.crypto.AEADBadTagException;

import Arrays.arrayBidimensional;
import Colecciones.Mastrix.Personajes.Personajes;
import Colecciones.Mastrix.Personajes.PersonasGenericas;
import Colecciones.Mastrix.Personajes.Smith;
import Colecciones.Mastrix.Personajes.Neo;

public class Matrix {

    public static void main(String[] args) {
        int cantidad = 200;

        // Creamos las 200 personas
        ArrayList<PersonasGenericas> listadoPGenericas = new ArrayList<>();
        listadoPGenericas.addAll(factoriaPersonas(cantidad));
        // System.out.println(listadoPGenericas);


        // Añadimos las personas del mundo de matrix
        ArrayList<Personajes> mundo = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            mundo.add(listadoPGenericas.get((int)(Math.random()*(listadoPGenericas.size()-1))));
        }
        
        Neo neo = new Neo(cantidad, null, null, null, cantidad, cantidad, false, cantidad)

        





    }











    public static Collection<PersonasGenericas> factoriaPersonas(int cantidad) {

        Collection<PersonasGenericas> listaPersonajes = new ArrayList<>();

        String[] ciudades = { "Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris" };
        String[] nombres = { "Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel" };

        ArrayList<Integer> listaId = new ArrayList<Integer>();

        for (int i = 0; i < cantidad; i++) {
            int randomCiudad = (int) (Math.random() * 6);
            int randomNombre = (int) (Math.random() * 10);

            boolean salida = false;

            int randomId = (int) (Math.random() * 1000) + 1000;

            while (salida != true) {

                randomId = (int) (Math.random() * 1000) + 1000;

                if (!listaId.contains(randomId)) {
                    listaId.add(randomId);
                    salida = true;
                }

            }

            // Fecha
            LocalDateTime fechaActual = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String fechaFormateada = fechaActual.format(formato);

            int edad = (int) ((Math.random() * 90) + 1);

            int probabilidadMorir = (int) ((Math.random() * 100) + 1);

            PersonasGenericas personasGenericas = new PersonasGenericas(randomId, nombres[randomNombre],
                    ciudades[randomCiudad], fechaFormateada, edad, probabilidadMorir);

            listaPersonajes.add(personasGenericas);

        }

        return listaPersonajes;
    }
}
