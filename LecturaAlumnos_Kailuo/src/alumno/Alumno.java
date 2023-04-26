package alumno;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getPuntuacion1() {
        return puntuacion1;
    }

    public void setPuntuacion1(int puntuacion1) {
        this.puntuacion1 = puntuacion1;
    }

    public int getPuntuacion2() {
        return puntuacion2;
    }

    public void setPuntuacion2(int puntuacion2) {
        this.puntuacion2 = puntuacion2;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
