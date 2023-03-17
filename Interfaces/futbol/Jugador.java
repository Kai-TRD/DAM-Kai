package Interfaces.futbol;

public class Jugador implements Jugar_I {

    // Atributos
    private String NombreCompleto;
    private String Apodo;

    private int numLicencia = 1000; // (Número único y auto-generado para todos los jugadores, las licencias empiezan a partir de 1000)

    private int numeroGoles;
    private int numeroFaltas;
    // String toString(); //“NombreCompleto (apodo)- Goles x - Faltas y”
    // equals(obj): Se comparan por número de licencia

    // Constructor
    public Jugador(String NombreCompleto, String Apodo, int numeroGoles, int numeroFaltas){
        this.NombreCompleto = NombreCompleto;
        this.Apodo = Apodo;
        this.numLicencia = generarNumLicencia();
        this.numeroGoles = numeroGoles;
        this.numeroFaltas = numeroFaltas;
    }


    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }


    public int generarNumLicencia(){
        numLicencia = numLicencia+1;
        setNumLicencia(numLicencia);
        return this.numLicencia;
    }



    @Override
    public String toString(){
        String algo = "----------Jugador---------" ;
               algo += "\nNombre:" + this.NombreCompleto;
               algo += "\nApodo:" + this.Apodo;
               algo += "\nNº Licencia:" + this.numLicencia;
               algo += "\nNº Goles:" + this.numeroGoles;
               algo += "\nNº Faltas" + this.numeroFaltas;
        
        return algo;
    }

    @Override
    public void HacerGol() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'HacerGol'");
    }


    @Override
    public void cometerFalta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cometerFalta'");
    }
}
