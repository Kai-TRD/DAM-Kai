package examenes.examenT9;

import java.util.List;

public class CarritoCompra {
    List<Producto> carrito;

    public void insertar(Producto producto) {
        carrito.add(producto);
    }

    public void eliminar(int id) {
        carrito.remove(id);
    }

    public String mostrarPorNombre() {
        String carrtioSalida = "";
        for (int index = 0; index < carrito.size(); index++) {
            carrtioSalida += carrito.get(index);
        }
        return carrtioSalida;
    }


    

    
}
