import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class utils {

    /**
     * Ordena cosas
     * 
     * @param lista
     * @return
     */
    public static List<Persona2> ordenar(List<Persona2> lista) {
        List<Persona2> sortedList = new ArrayList<>(lista);
        Collections.sort(sortedList, new Comparator<Persona2>() {
            @Override
            public int compare(Persona2 Persona1, Persona2 Persona2) {
                return Integer.compare(Persona1.getTiempo(), Persona2.getTiempo());
            }
        });
        return sortedList;
    }

    /**
     * crea UN objeto de un JSON
     * 
     * @param relativePathFile
     * @return
     */
    public static Persona LeerEmpleadoFromJsonFile(String relativePathFile) {

        // File ficheroEmpleado = new File("src/recursos/Persona.txt");
        File ficheroEmpleado = new File(relativePathFile);
        // byte[] jsonData = Files.readAllBytes(Paths.get("Persona.txt"));

        // create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // convert json string to object
        Persona emp = null;
        try {
            emp = objectMapper.readValue(ficheroEmpleado, Persona.class);
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("Persona Object\n" + emp);
        return emp;

    }

    /**
     * crea una List<Persona> de un JSON
     * 
     * @param relativePathFile
     * @return
     */
    public static List<Persona> LeerListEmpleadoFromJsonFile(String relativePathFile) {
        File ficheroEmpleado = new File(relativePathFile);

        ObjectMapper objectMapper = new ObjectMapper();

        List<Persona> listaEmpleados = null;
        try {
            listaEmpleados = objectMapper.readValue(ficheroEmpleado, new TypeReference<List<Persona>>() {
            });
        } catch (IOException e) {

            e.printStackTrace();
        }

        return listaEmpleados;
    }

    /**
     * Convierte un objeto en un Json
     */
    public static void convertiraJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            // convert Object to json string
            Persona emp1 = new Persona();
            // configure Object mapper for pretty print
            objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

            // Puedo imprimirlo por consola
            // writing to console, can write to any output stream such as file
            // StringWriter stringEmp = new StringWriter();
            // Sacar por consola el Json
            // objectMapper.writeValue(stringEmp, emp1);
            // System.out.println("Persona JSON is\n"+stringEmp);

            // Puedo guardarlo en un fichero

            File fileEmp1 = new File("src/recursos/empleado1.txt");

            objectMapper.writeValue(fileEmp1, emp1);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Creamos un fichero diccionario
     * 
     * @param diccionarioPersona
     */
    public static void crearFicheroDiccionario(Map<String, Persona> diccionarioPersona) {
        try {
            File fichero = new File("src/recursos/diccionarioPersonas,json");

            ObjectMapper mapper = new ObjectMapper();

            mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

            mapper.writeValue(fichero, diccionarioPersona);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Leemos un fichero para volverlo un Map
     * 
     * @param path
     * @return
     */
    public static Map<String, Persona> leerFicheroDiccionarioPersona(String path) {

        Map<String, Persona> diccionario = null;

        try {
            File fichero = new File(path);

            ObjectMapper mapper = new ObjectMapper();
            diccionario = mapper.readValue(fichero, new TypeReference<Map<String, Persona>>() {
            });

        } catch (Exception e) {
            System.out.println(e);
        }

        return diccionario;

    }

    /**
     * Lee un fichero para volverlo un ArrayList<Persona2>
     * 
     * @param ano
     * @return
     */
    public ArrayList<Persona2> LeerFicheroPersona2(Integer ano) {

        FileReader fr = null;

        BufferedReader bufferReader = null;

        ArrayList<Persona2> Persona2s = new ArrayList<>();

        try {
            // direccion del archivo
            fr = new FileReader("src/fichero/PoblacionPersona2sMalaga.txt");

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {

                // La separacion en este caso es una tabulacion ("\\t")
                String[] separado = lineaFichero.split("\\t");

                // Dividir la cadena utilizando espacios como delimitador (incluyendo espacios múltiples)
                // String[] separado = lineaFichero.split("\\s+");

                try {
                    // Separa el array que acabo de crear para asignar cada trozo a
                    // sus correspondiente atributos de Persona2
                    String nombre = separado[0];
                    int edad = Integer.parseInt(separado[1]);
                    String mascota = separado[2];
                    int tiempo = Integer.parseInt(separado[3].replace(".", ""));

                    Persona2 Persona2A = new Persona2(nombre, edad, mascota, tiempo);
                    Persona2s.add(Persona2A);

                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    // Si da error se devuelve esto
                    System.out.println("ERROR! Se ha saltdado una linea");
                }
                lineaFichero = bufferReader.readLine();
            }
            
        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        }
        return Persona2s;
    }

}
