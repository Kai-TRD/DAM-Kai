package modelos;

import java.util.List;

import utils.ficheroUtils;

public class Ferreteria {

    // Atributos
    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
    private List<Ventas> listaVentas;

    // Constructor
    public Ferreteria() throws exceptions.ExcepcionProductoSinStock {

        this.listaClientes = ficheroUtils.leerListaClienteFromJSON("src/recursos/clientes.json");
        this.listaProductos = ficheroUtils.LeerFicheroProducto("src/recursos/producto.csv");
        this.listaVentas = ficheroUtils.leerListaVentasFromJSON("src/recursos/ventas.json");
    }

    // getters and setters
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Ventas> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Ventas> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public void crearFacturaCliente() {
        String factura = "===== Factura Ferreteria =====";
        for (int i = 0; i < listaClientes.size(); i++) {

            int pagado = 0;

            for (int j = 0; j < listaVentas.size(); j++) {
                if (Integer.parseInt(listaVentas.get(i).getCodigoCliente()) == listaClientes.get(i).getCodigo()) {
                    for (int j2 = 0; j2 < listaVentas.get(i).getLineas().length; j2++) {
                        pagado += (listaVentas.get(j).getLineas()[j2].cantidad) * (listaProductos.get(j).getPrecio());
                    }

                }
            }

            factura += listaClientes.get(i).getCodigo() + " - " + listaClientes.get(i).getNombre()
                    + "Total compra: " + pagado;
        }
        ficheroUtils.crearArchivo("src/recursos/FacturazionClientes.txt", factura);
    }

}
