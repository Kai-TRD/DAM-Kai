package ClasesT6.Ejemplos;

public class Producto {

    // Atributos
    private String codigo;
    private String nombre;
    private String descripcion;
    private Double precioDeCompra;
    private Double precioDeVenta;
    private int stock;

    // Constructor
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioDeCompra() {
        return precioDeCompra;
    }

    public void setPrecioDeCompra(Double precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }

    public Double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(Double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
   
    public Producto(String codigo,String nombre,String descripcion,Double precioDeCompra,Double precioDeVenta,int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioDeCompra = precioDeCompra;
        this.precioDeVenta = precioDeVenta;
        this.stock = stock;
    }

    @Override
    public String toString()
    {
        String cadena = "\n+-----------------------------------------+";
                cadena += "\n Codigo: " + this.codigo;
                cadena += "\n Nombre: " + this.nombre;
                cadena += "\n Descripcion: " + this.descripcion;
                cadena += "\n Precio de compra: " + this.precioDeCompra;
                cadena += "\n Precio de venta: " + this.precioDeVenta;
                cadena += "\n Stock: " + this.stock;
                cadena += "\n+-----------------------------------------+";
        return cadena;
    }

}
