package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Cliente;

public class UtilesJson {

    public static List<Cliente> leerFicheroClientes() {
        
        List<Cliente> resultado = new ArrayList<>();

        String path = "src/recursos/clientes.json";

        try {
            File fichero = new File(path);

            ObjectMapper mapper = new ObjectMapper();

            resultado = mapper.readValue(path, new TypeReference<List<Cliente>>(){});
        } catch (Exception e) {
            System.out.println("Ocurrio un error al leer el archivo");
        }




        return resultado;
    }
    
}
