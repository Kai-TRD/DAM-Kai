package Interfaces.futbol;

public class Jugador implements Jugar_I {

    // Atributos
    private String nombreCompleto;
    private String apodo;

    private int numLicencia = 1000; // (Número único y auto-generado para todos los jugadores, las licencias empiezan a partir de 1000)
    private static int contador;

    private int numeroGoles;
    private int numeroFaltas;
    // equals(obj): Se comparan por número de licencia

    // Constructor
    public Jugador(String NombreCompleto, String Apodo, int numeroGoles, int numeroFaltas){
        this.nombreCompleto = NombreCompleto;
        this.apodo = Apodo;
        this.numLicencia = generarNumLicencia();
        this.numeroGoles = numeroGoles;
        this.numeroFaltas = numeroFaltas;
    }


    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }


    public int generarNumLicencia(){
        contador++;
        return numLicencia + contador;


    }



    @Override
    public String toString(){
        return "\t- " + this.nombreCompleto + "(" + this.apodo + ")- Goles " + this.numeroGoles + " - Faltas " + this.numeroFaltas;
    }


    

    @Override
    public void HacerGol() {
        System.out.println("-----------------------------------");
        System.out.println("| GOOOOOLLLLL!!! de " + this.nombreCompleto);
        System.out.println("-----------------------------------");

        this.numeroGoles++;
    }

    @Override
    public void cometerFalta() {
        System.out.println("-----------------------------------");
        System.out.println("| Falta de " + this.nombreCompleto);
        System.out.println("-----------------------------------");
        this.numeroFaltas++;
    }
}
