package examenes.examenT9;

public class Producto {

    // Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;

    private int contadorId;
    // Constructor
    public Producto(String nombre, String descripcion, double precio, String categoria){
        this.id = ponerId();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int ponerId() {
        contadorId++;
        return contadorId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
    // Producto{id=1, nombre='Televisor Samsung', descripcion='Televisor de 50 pulgadas', precio=500.0, categoria='Electrónica'}
    return "Producto{id= " + this.id + ", nombre='" + this.nombre + "', descripcion='" + this.descripcion + ", precio=" + this.precio + ", categoria='" + this.categoria + "'}";
    }


}
