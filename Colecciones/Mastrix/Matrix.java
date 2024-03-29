package Colecciones.Mastrix;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import Colecciones.Mastrix.Personajes.Personajes;
import Colecciones.Mastrix.Personajes.PersonasGenericas;
import Colecciones.Mastrix.Personajes.Smith;
import Colecciones.Mastrix.Personajes.Neo;

public class Matrix {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cantidad = 200;
        // porcentaje de muerte que resta si no <= 30%
        final int RESTAPORCENTAJEMUERTE = 10;

        final int MUNDOSIZE = 25;

        final int CAPACIDADMAXINFECTAR = 5;

        String enter = null;

        // Creamos las 200 personas
        ArrayList<PersonasGenericas> listadoPGenericas = new ArrayList<>();
        listadoPGenericas.addAll(factoriaPersonas(cantidad));
        // Mostrar las 200 personas
        // System.out.println(listadoPGenericas);

        // Deposito virus para Smith
        ArrayList<Smith> depositoVirus = new ArrayList<>();

        // Añadimos las personas del mundo de matrix
        ArrayList<Personajes> mundo = new ArrayList<>();

        for (int i = 0; i < MUNDOSIZE - 2; i++) {
            int randomGenerica = (int) (Math.random() * (listadoPGenericas.size() - 1));
            mundo.add(listadoPGenericas.get(randomGenerica));
            listadoPGenericas.remove(randomGenerica);
        }

        // Creacion de Neo
        Neo neo = new Neo(0000, "Neo", "Nueva York", "2003-10-23 13:36:00:6969", 35, false, (int) (Math.random() * 10));

        // Creacion de Smith
        Smith smith = new Smith(0000, "Smith", "MATRIX", "ERROR", 0, (int) (Math.random() * 10));

        // Pongo a neo y smith en una posicion random del mundo
        mundo.add((int) (Math.random() * (mundo.size() + 1)), neo);

        mundo.add((int) (Math.random() * (mundo.size() + 1)), smith);

        // -------ITERACIONES-------

        int iteraciones = 1;

        do{

            // Cada iteracion
            for (int i = 0; i < mundo.size(); i++) {
                // Mostrar los 25
                // System.out.println(mundo.get(i));

                if (mundo.get(i) instanceof PersonasGenericas) {
                    PersonasGenericas pg = (PersonasGenericas) mundo.get(i);
                    int probMorir = pg.getProbabilidadMorir();
                    if (probMorir < 30) {
                        mundo.set(i, listadoPGenericas.get(i));
                        listadoPGenericas.remove(i);
                        System.out.println("Ha muerto:");
                        System.out.println(mundo.get(i));
                    } else {
                        pg.setProbabilidadMorir(pg.getProbabilidadMorir() - RESTAPORCENTAJEMUERTE);
                    }
                }

            }

            // Cada 2 iteraciones
            if (iteraciones % 2 == 0) {

                int randomPoderInfeccion = (int) (Math.random() * CAPACIDADMAXINFECTAR) + 1;

                for (int i = 0; i < mundo.size(); i++) {

                    int posicionSmith = 0;

                    if (mundo.get(i) instanceof Smith) {
                        posicionSmith = i;

                        // Infectar arriba de smith
                        for (int j = 0; j < posicionSmith; j++) {
                            System.out.println("ARIBA----dddddddddddddddddddddddddddddddddddddddd");

                            if (posicionSmith + 1 < mundo.size()) {
                                System.out.println("valido");

                                // Obtener el objeto Personas en la posición j del ArrayList "mundo"
                                Personajes temp = mundo.get(j);

                                // Crear un nuevo objeto Smith con los mismos valores de propiedades
                                Smith smithTemp = new Smith(temp.getId(), temp.getNombre(), temp.getNombreCiudad(),
                                        temp.getFechaCreacion(), temp.getEdad(), randomPoderInfeccion);

                                // Reemplazar el objeto Personas en la posición j del ArrayList "mundo" con el
                                // nuevo objeto Smith
                                mundo.set(j, smithTemp);

                            } else {
                                System.out.println("ERROR: Supera longitud maxima del mundo");
                            }
                        }

                        // Infectar abajo de Smith

                    }
                }

            }

            // Cada 5 iteraciones
            if (iteraciones % 5 == 0) {
                boolean esElEleguido = false;
                if ((int) (Math.random() * 2) == 1) {
                    esElEleguido = true;
                }

                if (esElEleguido) {
                    // todos los smith radio de (capacidad de destruccion) todos los smith mueren y
                    // dejan su hueco(NULL)

                    // guardar smith en un deposito de virus
                }

            }

            // Cada 10 iteraciones
            if (iteraciones % 10 == 0) {
                if (listadoPGenericas.size() != 0) {
                    for (int i = 0; i < mundo.size(); i++) {
                        if (mundo.get(i).equals(null)) {
                            mundo.add(listadoPGenericas.get(0));
                            listadoPGenericas.remove(0);
                        }

                    }
                }

            }

            // Cada 30 iteraciones
            if (iteraciones % 30 == 0) {

                listadoPGenericas.addAll(factoriaPersonas(1));

            }

            // imprimir el resumen del mundo

            resumenMundo(mundo);
            System.out.println("Turno Nº " + iteraciones + " quedan " + listadoPGenericas.size() + " habitantes");
            enter = sc.nextLine();

            iteraciones++;
        }while(listadoPGenericas.size() != 0 || iteraciones >= 300);

        System.out.println(enter);

    }

    public static void resumenMundo(ArrayList<Personajes> mundo) {
        System.out.println("Resumen del mundo:");
        System.out.print("[ ");
        for (int i = 0; i < mundo.size(); i++) {
            if (mundo.get(i) instanceof PersonasGenericas) {
                System.out.print("P ");
            }

            if (mundo.get(i) instanceof Smith) {
                System.out.print("S ");
            }

            if (mundo.get(i) instanceof Neo) {
                System.out.print("N ");
            }

            if (mundo.get(i).equals(null)) {
                System.out.print("[] ");
            }
        }
        System.out.println("] Hay " + mundo.size() + " habitantes");
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
