package contenedores;

import java.util.HashMap;

public class Interfaz {
    public static void main(String[] args) {
        
        // Creamos un Hash map que se llame persona
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // asignamos valores
        people.put("Jhon", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
