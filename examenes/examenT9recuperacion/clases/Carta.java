package examenes.examenT9recuperacion.clases;

import java.util.List;

import examenes.examenT9recuperacion.clases.Producto.TipoProducto;
import examenes.examenT9recuperacion.metodos.MiLista;

public class Carta {

    MiLista<Carta> listaCartas;
    private MiLista<Producto> productos;

    public Carta(MiLista<Producto> productos) {
        this.productos = productos;
    }

    public boolean addNuevoProducto(Producto producto) {
        boolean puedeAnadir = true;
        String contenido = productos.StringElementos();
        if (contenido.contains(producto.getNombre())) {
            return false;
        }
        return puedeAnadir;
    }

    public Producto getProducto(int posicion) {
        return productos.get(posicion);
    }

    public MiLista<Producto> getProductos() {
        return productos;
    }

    public void deleteProducto(int i) {
        listaCartas.eliminar(i);
    }

    public List<Producto> productosConIngrediente(List<String> ingredientes) {

        return null;

    }

    public MiLista<Producto> productosPorTipo(TipoProducto tipo) {

        MiLista<Producto> lista = new MiLista<Producto>();

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getTipoProducto().equals(tipo)) {
                lista.add(productos.get(i));
            }
        }

        return lista;

    }

}
