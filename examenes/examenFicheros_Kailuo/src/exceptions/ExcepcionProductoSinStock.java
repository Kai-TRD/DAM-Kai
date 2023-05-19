package exceptions;

public class ExcepcionProductoSinStock extends Exception {
    public ExcepcionProductoSinStock(String nombre) {
        super("El producto " + nombre + " no tiene stock, no se añadira a la lista");
    }
}
