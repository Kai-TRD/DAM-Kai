package exception;

public class NoExisteDNIException extends Exception {
    public NoExisteDNIException(String nombre) {
        super("El alumno " + nombre + " no tiene DNI, no se puede procesar su informacion");
    }
}
