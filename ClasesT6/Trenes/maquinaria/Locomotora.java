package ClasesT6.Trenes.maquinaria;

public class Locomotora {

    // Disponen de una matrícula, la potencia de sus motores y antigüedad (año).
    // Además tendrá asignado un mecánico que se encargará de su mantenimiento.

    // Valores
    private String matricula;
    private int potenciaMotor;
    private int antiguedad;

    // Constructor

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Locomotora(String matricula, int potenciaMotor) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
    }

    public Locomotora(String matricula, int potenciaMotor, int antiguedad) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.antiguedad = antiguedad;
    }

    // Asignar mecanico

}