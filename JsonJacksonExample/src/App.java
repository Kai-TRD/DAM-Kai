import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.Grupo;
import modelo.Persona;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        // Leer Json que contiene 1 objeto y convertirlo en objeto
        jsonUtils.LeerEmpleadoFromJsonFile("src/recursos/employee.txt");

        System.out.println("==============================================");

        //Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto>
        List<Employee> listaEmpleados =
        jsonUtils.LeerListEmpleadoFromJsonFile("src/recursos/employeeArray.txt");
        System.out.println("====== ARRAY EMPLEADOS =======================");

        for (Employee employee : listaEmpleados) {
        System.out.println(employee);
        }

        System.out.println("==============================================");

        //Convertir objeto a Json
        jsonUtils.convertToJson();

        Coche coche = jsonUtils.leerJsonCoche("src/recursos/coche.json");

        System.out.println(coche);




















        System.out.println("==== Grupo de 24 ==================================");

        Grupo grupo = jsonUtils.LeerFicheroPersonas();

        System.out.println(grupo);

        Grupo grupoDe24 = new Grupo();

        ArrayList<Persona> personasDe24 = new ArrayList<>();

        for (Persona persona : grupo.getPeople()) {
            if (persona.getAge().equals(24)) {
                personasDe24.add(persona);
            }
        }

        grupoDe24.setPeople(personasDe24);
        jsonUtils.GuardarFicheroGrupos(grupoDe24);

        System.out.println("================================================");

        // Creamos un MAP de tipo <String, Persona>
        Map<String, Persona> mapPersonas = new HashMap<String, Persona>();

        // Introducimos varios valores
        Persona persona1 = new Persona("Emily", "Brawn", "female", 23, "34567764X");
        Persona persona2 = new Persona("Juan", "García", "male", 28, "45678912A");
        Persona persona3 = new Persona("María", "López", "female", 35, "23456789B");
        Persona persona4 = new Persona("Carlos", "Ruiz", "male", 42, "34567890C");
        Persona persona5 = new Persona("Ana", "Fernández", "female", 19, "12345678D");

        mapPersonas.put(persona1.getNumber(), persona1);
        mapPersonas.put(persona2.getNumber(), persona2);
        mapPersonas.put(persona3.getNumber(), persona3);
        mapPersonas.put(persona4.getNumber(), persona4);
        mapPersonas.put(persona5.getNumber(), persona5);

        System.out.println(mapPersonas);

        // Guardamos ese MAP en un json
        jsonUtils.GuardarFicheroGruposConHashMap(mapPersonas);


        Map<String, Persona> diccionarioPersonas2 =
            jsonUtils.leerFicheroDiccionarioPersona("src/recursos/diccionarioPersonas.json");

            Persona yoMismo = new Persona();
            yoMismo.setFirstName("Kai");
            yoMismo.setLastName("Wang");
            yoMismo.setGender("Hombre");
        diccionarioPersonas2.put("11111111K", yoMismo);

        jsonUtils.crearFicheroDiccionario(diccionarioPersonas2);

        // Calcula la media de la edad de las personas en diccionaroiopersona 2

    }
}
