import java.util.ArrayList;
import java.util.HashMap;

import clases.LeerInformacion;

import clases.Municipio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("+---Lectura fichero municipios---+");
    

    // Busqueda por año
        LeerInformacion leer = new LeerInformacion();
    
        ArrayList<Municipio> listaMunicipio = leer.LeerFicheroMunicipio(2020);
        for (int i = 0; i < listaMunicipio.size(); i++) {
            System.out.println(listaMunicipio.get(i));
        }
    // Busqueda nombre año
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Buscar");
        ArrayList<Municipio> listaMunicipioBuscar = leer.BuscarMunicipio(listaMunicipio, "Málaga", 2017);
        for (int i = 0; i < listaMunicipioBuscar.size(); i++) {
            System.out.println(listaMunicipioBuscar.get(i));
        }


        HashMap<String, Integer> lista = leer.IncrementoPoblacion(listaMunicipio, 0, 0);



    }
}
