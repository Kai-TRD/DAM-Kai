package interfaces.futbol;

import java.util.Comparator;

public class Jugador implements Jugar_I {

    // Atributos
    private String nombreCompleto;
    private String apodo;

    private int numLicencia = 1000;
    private static int contador;

    private int numeroGoles;
    private int numeroFaltas;
    // equals(obj): Se comparan por número de licencia

    // Constructor
    public Jugador(String NombreCompleto, String Apodo, int numeroGoles, int numeroFaltas) {
        this.nombreCompleto = NombreCompleto;
        this.apodo = Apodo;
        this.numLicencia = generarNumLicencia();
        this.numeroGoles = numeroGoles;
        this.numeroFaltas = numeroFaltas;
    }

    public Jugador(String NombreCompleto, String Apodo, int numeroGoles, int numeroFaltas, int numLicencia) {
        this.nombreCompleto = NombreCompleto;
        this.apodo = Apodo;
        this.numLicencia = numLicencia;
        this.numeroGoles = numeroGoles;
        this.numeroFaltas = numeroFaltas;
    }

    // Getters & Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getApodo() {
        return apodo;
    }

    public static int getContador() {
        return contador;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public static Comparator<Jugador> getComparadorPorApodo() {
        return comparadorPorApodo;
    }

    public int generarNumLicencia() {
        contador++;
        return numLicencia + contador;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    // Imprimir Jugador
    @Override
    public String toString() {
        return "- " + this.nombreCompleto + "(" + this.apodo + ")- Goles " + this.numeroGoles + " - Faltas "
                + this.numeroFaltas
        // + "-Nº" + this.numLicencia
        ;
    }

    // Metodo equals
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Jugador)) {
            return false;
        }

        Jugador jugador = (Jugador) obj;
        return numLicencia == jugador.numLicencia;
    }

    // Hacer un Gol
    @Override
    public void HacerGol() {
        System.out.println("-----------------------------------");
        System.out.println("| GOOOOOLLLLL!!! de " + this.nombreCompleto);
        System.out.println("-----------------------------------");

        this.numeroGoles++;
    }

    // Cometer una Flata
    @Override
    public void cometerFalta() {
        System.out.println("-----------------------------------");
        System.out.println("| Falta de " + this.nombreCompleto);
        System.out.println("-----------------------------------");
        this.numeroFaltas++;
    }

    // Comparador por Licencia
    public static Comparator<Jugador> comparadorPorLicencia = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            return Integer.compare(j1.getNumLicencia(), j2.getNumLicencia());
        }
    };

    // Comparador por Apodo
    public static Comparator<Jugador> comparadorPorApodo = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            int comparacion = j1.getApodo().compareTo(j2.getApodo());
            if (comparacion == 0) {
                comparacion = j1.getNombreCompleto().compareTo(j2.getNombreCompleto());
            }
            return comparacion;
        }
    };

    // Comparador por Goles
    public static Comparator<Jugador> comparadorPorGoles = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            int comparacion = Integer.compare(j2.getNumeroGoles(), j1.getNumeroGoles());
            if (comparacion == 0) {
                comparacion = j1.getNombreCompleto().compareTo(j2.getNombreCompleto());
            }
            return comparacion;
        }
    };
    // Comparador por Faltas
    public static Comparator<Jugador> comparadorPorFaltas = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            int comparacion = Integer.compare(j2.getNumeroFaltas(), j1.getNumeroFaltas());
            if (comparacion == 0) {
                comparacion = j1.getNombreCompleto().compareTo(j2.getNombreCompleto());
            }
            return comparacion;
        }
    };

}
