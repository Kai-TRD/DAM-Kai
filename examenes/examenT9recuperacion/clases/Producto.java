package examenes.examenT9recuperacion.clases;

import java.util.Set;
import java.util.List;

public class Producto {

    private static int id = 0;
    public enum TipoProducto {BOCATA, SANDWICH, PIZZA, CAMPERO, BEBIDA, POSTRE};
    private TipoProducto tipoProducto;
    private String nombre;
    private List<String> listaIngredientes;
    private double precio;

    public Producto(String nombre, TipoProducto tipoProducto, Set<String> hashSet, double precio) {
        Producto.id = id++;
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
        this.listaIngredientes = listaIngredientes;
        this.precio = precio;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Producto.id = id;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



}