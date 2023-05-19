package modelos;

import java.util.Arrays;

public class Ventas {

    // Atributos
    String codigoCliente;
    String fecha;
    Linea[] lineas;

    // Constructor
    public Ventas() {

    }

    // getters and setters

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Linea[] getLineas() {
        return lineas;
    }

    public void setLineas(Linea[] lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "Ventas [codigoCliente=" + codigoCliente + ", fecha=" + fecha + ", lineas=" + Arrays.toString(lineas)
                + "]";
    }





}
