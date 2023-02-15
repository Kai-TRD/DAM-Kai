package ClasesT6.Trenes.personal;

public class Maquinista {
    // Valores
    private String nombre;
    private int edad;
    private String dni;
    private int sueldo;
    private String rango;

    // Contructor
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public Maquinista(String nombre, String dni, int sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public Maquinista(String nombre, int edad, String dni, int sueldo, String rango) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

}