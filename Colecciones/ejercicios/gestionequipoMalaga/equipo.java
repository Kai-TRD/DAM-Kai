package Colecciones.ejercicios.gestionequipoMalaga;

import java.net.SocketTimeoutException;
import java.security.DomainLoadStoreParameter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import javax.sql.rowset.CachedRowSet;
import javax.swing.JList.DropLocation;
import javax.xml.crypto.Data;

import Colecciones.ejercicios.gestionequipoMalaga.Jugador.Posicion;

public class equipo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Integer, Jugador> plantilla = new HashMap<>();

        boolean salir = false;

        do {

            listaOpciones();

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Dime el dorsal: ");
                    int dorsalAdd = sc.nextInt();
                    altaJugador(plantilla, 1);
                    break;
                case 2:
                    System.out.println("Dime el dorsal: ");
                    int dorsalRemove = sc.nextInt();
                    eliminarJugador(plantilla, dorsalRemove);
                    break;
                case 3:
                    mostrar(plantilla);
                    break;
                case 4:
                    mostrarMismaPosicion(plantilla, "PORTERO");
                    break;
                case 5:
                    System.out.println("Dime que dorsal: ");
                    int dorsal1 = sc.nextInt();
                    editarJugador(plantilla, dorsal1);
                    break;
                case 6:

                    Jugador jugador1 = new Jugador("W1040363", "Manuel Reina", Posicion.PORTERO, 190);
                    Jugador jugador2 = new Jugador("Q1040253", "Orlando Rubén", Posicion.CONTRACAMPISTA, 165);
                    Jugador jugador3 = new Jugador("W1040143", "Juan de Dios", Posicion.PORTERO, 180);
                    Jugador jugador4 = new Jugador("W1040033", "Unai Bustinza", Posicion.DEFENSA, 145);
                    Jugador jugador5 = new Jugador("K1039923", "Jonas Ramalho", Posicion.CONTRACAMPISTA, 200);
                    Jugador jugador6 = new Jugador("X1039813", "Diego Murillo", Posicion.DELANTERO, 197);
                    plantilla.put(1, jugador1);
                    plantilla.put(2, jugador2);
                    plantilla.put(3, jugador3);
                    plantilla.put(4, jugador4);
                    plantilla.put(5, jugador5);
                    plantilla.put(6, jugador6);
                    break;
                case 7:

                    break;

                default:
                    System.out.println("ERROR! opcion no valida");
                    break;
            }

        } while (!salir);

        // System.out.println(plantilla);

    }

    public static void listaOpciones() {
        String opciones = "+----OPCIONES----+";
        opciones += "\n1.Dar de alta a un jugador";
        opciones += "\n2.Quitar un jugador";
        opciones += "\n3.Mostrar Plantilla";
        opciones += "\n4.Mostrar los de una misma posicion";
        opciones += "\n5.Editar jugador";
        opciones += "\n6.Generar 6 jugadores predefinifdos";
        opciones += "\n0.Salir";
        System.out.println(opciones);

    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        System.out.println("-----DAR DE ALTA JUGADOR-----");
        System.out.print("DNI: ");
        sc.nextLine();
        String dni = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Posicion: ");
        System.out.println("  1.Portero");
        System.out.println("  2.Defensa");
        System.out.println("  3.Contracampista");
        System.out.println("  4.Delantero");
        Posicion posicion = null;
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("opcion 1");
                posicion = Posicion.PORTERO;
                break;
            case 2:
                System.out.println("opcion 2");
                posicion = Posicion.DEFENSA;
                break;
            case 3:
                System.out.println("opcion 3");
                posicion = Posicion.CONTRACAMPISTA;
                break;
            case 4:
                System.out.println("opcion 4");
                posicion = Posicion.DELANTERO;

                break;

            default:

                break;

        }

        System.out.print("Altura(cm): ");
        int altura = sc.nextInt();

        Jugador jugador = new Jugador(dni, nombre, posicion, altura);
        plantilla.put(dorsal, jugador);
    }

    static void eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (plantilla.size() == 0) {
            System.out.println("No hay jugadores");
        } else {

            System.out.println("El jugador " + plantilla.get(dorsal) + " ha sido eliminado");
            plantilla.remove(dorsal);
        }

    }

    static void mostrar(Map<Integer, Jugador> plantilla) {

        System.out.println("jugadores");
        if (plantilla.size() == 0) {
            System.out.println("-No hay jugadores-");
        } else {

            for (Entry<Integer, Jugador> entry : plantilla.entrySet()) {
                Integer clave = entry.getKey();
                Jugador valor = entry.getValue();
                System.out.println("Dorsal: " + clave + " " + valor);
            }
        }

    }

    static void mostrarMismaPosicion(Map<Integer, Jugador> plantilla, String posicion) {
        for (Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            Integer clave = entry.getKey();
            Jugador valor = entry.getValue();
            String posicionTemp = valor.getPosicion().toString();
            if (posicionTemp.equals(posicion)) {
                System.out.println("Dorsal: " + clave + " " + valor);
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        for (Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            Integer clave = entry.getKey();
            Jugador valor = entry.getValue();
            if (clave == dorsal) {
                System.out.println("Nuevo nombre: ");
                sc.nextLine();
                String newNombre = sc.nextLine();
                valor.setNombre(newNombre);
                System.out.println("Nueva posicion: ");
                Posicion posicion = null;
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("opcion 1");
                        posicion = Posicion.PORTERO;
                        break;
                    case 2:
                        System.out.println("opcion 2");
                        posicion = Posicion.DEFENSA;
                        break;
                    case 3:
                        System.out.println("opcion 3");
                        posicion = Posicion.CONTRACAMPISTA;
                        break;
                    case 4:
                        System.out.println("opcion 4");
                        posicion = Posicion.DELANTERO;
                        break;
                }
                valor.setPosicion(posicion);
                System.out.print("Nueva altura(cm): ");
                int altura = sc.nextInt();
                valor.setAltura(altura);



            }
        }

        return true;
    }
}
