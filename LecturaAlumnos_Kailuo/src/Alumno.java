public class Alumno {
    String sexo;
    String edad;
    double estatura;
    int puntuacion1;
    int puntuacion2;
    String calificacion;

    public Alumno(String sexo, String edad, double estatura, int puntuacion1, int puntuacion2, String calificacion) {
        this.sexo = sexo;
        this.edad = edad;
        this.estatura = estatura;
        this.puntuacion1 = puntuacion1;
        this.puntuacion2 = puntuacion2;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {

        String cosa = "sexo: " + this.sexo;
                cosa += "\nedad: " + this.edad;
                cosa += "\nestatura: " + this.estatura;
                cosa += "\npuntuacion1: " + this.puntuacion1;
                cosa += "\npuntuacion2: " + this.puntuacion2;
                cosa += "\ncalificacion: " + this.calificacion; 

        return cosa;
    }
}
