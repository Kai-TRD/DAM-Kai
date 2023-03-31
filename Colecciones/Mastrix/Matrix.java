package Colecciones.Mastrix;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;

import Colecciones.Mastrix.Personajes.PersonasGenericas;


public class Matrix {

    public static void main(String[] args) {
        int cantidad = 200;
        
        // Creamos las 200 personas
        ArrayList<PersonasGenericas> listadoPGenericas = new ArrayList<>();
        listadoPGenericas.addAll(factoriaPersonas(cantidad));

        // System.out.println(listadoPGenericas);









        
    }
















    public static Collection<PersonasGenericas> factoriaPersonas(int cantidad){

        Collection<PersonasGenericas> listaPersonajes = new ArrayList<>();

        String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
        String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
        
        ArrayList<Integer> listaId = new ArrayList<Integer>();


        for (int i = 0; i < cantidad; i++) {
            int randomCiudad = (int)(Math.random()*6);
            int randomNombre = (int)(Math.random()*10);

            boolean salida = false;

            int randomId = (int)(Math.random()*1000) + 1000;

            while(salida != true){
                
                randomId = (int)(Math.random()*1000) + 1000;
                
                if(!listaId.contains(randomId)){
                    listaId.add(randomId);
                    salida = true;
                }
            
            }
            
            // Fecha
            LocalDateTime fechaActual = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String fechaFormateada = fechaActual.format(formato);

            int edad = (int)((Math.random()*90)+1);

            int probabilidadMorir = (int)((Math.random()*100)+1);

            PersonasGenericas personasGenericas = new PersonasGenericas(randomId, nombres[randomNombre], ciudades[randomCiudad], fechaFormateada, edad, probabilidadMorir);

            listaPersonajes.add(personasGenericas);

        }

        return listaPersonajes;
    }
}
