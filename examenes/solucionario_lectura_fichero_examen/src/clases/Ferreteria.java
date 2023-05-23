package clases;

import java.util.List;

import modelos.Cliente;
import utils.UtilesJson;

public class Ferreteria {
    
    List<Cliente> clientes;



    public Ferreteria() {
        clientes = UtilesJson.leerFicheroClientes();

        System.out.println(clientes);
    }
}
