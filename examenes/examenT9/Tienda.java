package examenes.examenT9;

import java.util.HashMap;
import java.util.List;

public class Tienda implements Tienda_I {

    List<Producto> listaProductos;
    static HashMap<String, Integer> descuentoPorCategoria = new HashMap<>();

    @Override
    public boolean insertarProducto(Producto producto) {
        return listaProductos.add(producto);
    }

    @Override
    public String mostrarProductosPorNombre() {
        return listaProductos.toString();
    }

    @Override
    public String mostrarProductosPorId() {
        throw new UnsupportedOperationException("Unimplemented method 'mostrarProductosPorId'");
    }

    @Override
    public Producto buscarProducto(int id) {
        Producto devolver = null;
        for (int i = 0; i < listaProductos.size(); i++) {
            if(listaProductos.get(i).getId() == id){
                devolver = listaProductos.get(i);
        
            }
        }
        return devolver;
    }

    @Override
    public double obtenerCuentaTotal() {
        double cuentaTotal = 0;


        for (int i = 0; i < listaProductos.size(); i++) {
            if(listaProductos.get(i).getCategoria().equals("Electrónica")) {
                cuentaTotal += listaProductos.get(i).getPrecio() - (listaProductos.get(i).getPrecio() * 5 / 100);
            } else 
            
            if(listaProductos.get(i).getCategoria().equals("Hogar")) {
                cuentaTotal += listaProductos.get(i).getPrecio() - (listaProductos.get(i).getPrecio() * 10 / 100);
            } else {
                cuentaTotal += listaProductos.get(i).getPrecio();
            }
        }

        return cuentaTotal;
    }

    public Object getDescuentoPorCategoria() {
        return insertarProducto(null);
    }


    public CarritoCompra getCarritoDeCompra() {
        return null;
    }


}
