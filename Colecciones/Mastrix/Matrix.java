package Colecciones.Mastrix;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.PriorityBlockingQueue;

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
        // Mostrar las 200 personas
        // System.out.println(listadoPGenericas);

        // Añadimos las personas del mundo de matrix
        ArrayList<Personajes> mundo = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            mundo.add(listadoPGenericas.get((int) (Math.random() * (listadoPGenericas.size() - 1))));
        }

        // Creacion de Neo
        Neo neo = new Neo(0000, "Neo", "Nueva York", "2003-10-23 13:36:00:6969", 35, false, (int) (Math.random() * 10));
        System.out.println(neo);

        // Creacion de Smith
        Smith smith = new Smith(0000, "Smith", "MATRIX", "ERROR", 0, (int) (Math.random() * 10));
        System.out.println(smith);

        mundo.add(neo);

        // -------ITERACIONES-------
        
        int iteraciones = 0;
        
        // while(listadoPGenericas.size() != 0 || iteraciones == 300){
            
            // Cada iteracion Se evalúa el porcentaje de morir de un personaje y si es inferior a 30% es 
            // sustituido por otro del listado de personas. En otro caso se disminuye el % en 10%
            for (int i = 0; i < mundo.size(); i++) {
                // Mostrar los 25
                // System.out.println(mundo.get(i));

                if(mundo.get(i) instanceof PersonasGenericas)
                {
                    System.out.println("Es persona generica");
                    PersonasGenericas pg = (PersonasGenericas)mundo.get(i);
                    int probMorir = pg.getProbabilidadMorir();
                    if(probMorir < 30){




                        // pendiente de hacer oooooooooooooooooooooooooooooooooooooooooooooooooo
                        // utiliza el instanceof para imprimir persona generica como O, smith como S y neo como N




                        int indiceAleatorio = random.nextInt(personajesDisponibles.size());

                        mundo.set(i, listadoPGenericas.get(i));
                    }
                }
            }

            // Cada 2 iteraciones

            // Cada 5 iteraciones

            // Cada 10 iteraciones

            // Cada 30 iteraciones

            iteraciones++;
        // }



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
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSSS");
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
