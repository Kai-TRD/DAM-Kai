package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Cliente;
import modelos.Producto;
import modelos.Ventas;

public class ficheroUtils {

    /**
     * Lee el fichero clientes.json y lo convierte en un List<Cliente>
     * 
     * @param filePath
     * @return
     */
    public static List<Cliente> leerListaClienteFromJSON(String filePath) {
        File ficheroClientes = new File(filePath);

        ObjectMapper objectMapper = new ObjectMapper();

        List<Cliente> listaClientes = null;
        try {
            listaClientes = objectMapper.readValue(ficheroClientes, new TypeReference<List<Cliente>>() {
            });
        } catch (IOException e) {

            e.printStackTrace();
        }

        return listaClientes;
    }

    /**
     * Leer fichero ventas.json para devolver un List<Ventas>
     * 
     * @param filePath
     * @return
     */
    public static List<Ventas> leerListaVentasFromJSON(String filePath) {
        File ficheroVentas = new File(filePath);

        ObjectMapper objectMapper = new ObjectMapper();

        List<Ventas> listaVentas = null;
        try {
            listaVentas = objectMapper.readValue(ficheroVentas, new TypeReference<List<Ventas>>() {
            });
        } catch (IOException e) {

            e.printStackTrace();
        }

        return listaVentas;
    }

    /**
     * Lee el fichero de productos
     * 
     * @param filePath
     * @return
     * @throws ExcepcionProductoSinStock
     */
    public static List<Producto> LeerFicheroProducto(String filePath) throws exceptions.ExcepcionProductoSinStock {

        FileReader fr = null;

        BufferedReader bufferReader = null;

        ArrayList<Producto> Productos = new ArrayList<>();

        try {
            // direccion del archivo
            fr = new FileReader(filePath);

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {

                // La separacion en este caso es un punto y coma (";")
                String[] separado = lineaFichero.split(";");

                try {

                    int codigo = Integer.parseInt(separado[0]);
                    String nombre = separado[1];
                    String descripcion = separado[2];
                    double precio = Double.parseDouble(separado[3]);
                    int stock = Integer.parseInt(separado[4]);

                    if (codigo == 0) {
                        throw new exceptions.ExcepcionProductoSinStock(nombre);
                    } else {
                        Producto productoTemp = new Producto(codigo, nombre, descripcion, precio, stock);
                        Productos.add(productoTemp);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Formato añadido no valido");
                }
                lineaFichero = bufferReader.readLine();
            }

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        }
        return Productos;
    }

    /**
     * Elimina los productos repetidos
     * 
     * @param listaOriguinal
     * @return
     */
    public static List<Producto> eliminarRepeProductos(List<Producto> listaOriguinal) {

        List<Producto> listaSinRepetidos = new ArrayList<>();

        for (int i = 0; i < listaOriguinal.size(); i++) {
            for (int j = 0; j < listaOriguinal.size(); j++) {
                if (listaOriguinal.get(i).getCodigo() != listaOriguinal.get(j).getCodigo()) {
                    listaSinRepetidos.add(listaOriguinal.get(i));
                } else {
                    System.out.println("ERROR! Producto Repetido, no se añade a lista");
                }
            }
        }

        return listaOriguinal;
    }

    /**
     * Elimina los clientes repetidos
     * 
     * @param listaOriguinal
     * @return
     */
    public static List<Cliente> eliminarRepeClientes(List<Cliente> listaOriguinal) {

        List<Cliente> listaSinRepetidos = new ArrayList<>();

        for (int i = 0; i < listaOriguinal.size(); i++) {
            for (int j = 0; j < listaOriguinal.size(); j++) {
                if (listaOriguinal.get(i).getNombre() != listaOriguinal.get(j).getNombre()) {
                    listaSinRepetidos.add(listaOriguinal.get(i));
                } else {
                    System.out.println("ERROR! Cliente \"" + listaOriguinal.get(i).getNombre()
                            + "\" Repetido, no se añade a lista");
                }
            }
        }

        return listaOriguinal;
    }

    public static void crearArchivo(String filePath, String contenido) {
        try {
            FileWriter fw = new FileWriter(filePath);
            fw.write(contenido);
            fw.close();
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }

}
