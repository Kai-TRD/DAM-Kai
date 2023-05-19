import java.util.List;

import modelos.Cliente;
import modelos.Producto;
import modelos.Ventas;
import utils.ficheroUtils;

public class pruebas {
    public static void main(String[] args) throws Exception {
        System.out.println("+--- FERRETERIA ---+");

        List<Cliente> listaCliente = ficheroUtils.leerListaClienteFromJSON("src/recursos/clientes.json");

        // for (int i = 0; i < listaCliente.size(); i++) {
        //     System.out.println(listaCliente.get(i));
        // }

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        List<Ventas> listaVentas = ficheroUtils.leerListaVentasFromJSON("src/recursos/ventas.json");
        
        // for (int i = 0; i < listaVentas.size(); i++) {
        //     System.out.println(listaVentas.get(i));
        // }

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        List<Producto> listaProductos = ficheroUtils.LeerFicheroProducto("src/recursos/productos.csv");

        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i));
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        // listaProductos = ficheroUtils.eliminarRepeProductos(listaProductos);

        // for (int i = 0; i < listaProductos.size(); i++) {
        //     System.out.println(listaProductos.get(i));
        // }
        for (int i = 0; i < listaCliente.size(); i++) {
            System.out.println(listaCliente.get(i));
        }

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        listaCliente = ficheroUtils.eliminarRepeClientes(listaCliente);

        for (int i = 0; i < listaCliente.size(); i++) {
            System.out.println(listaCliente.get(i));
        }













    }
}
