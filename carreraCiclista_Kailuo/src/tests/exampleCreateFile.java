package tests;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exampleCreateFile {

    public static void main(String[] args) {
        String contenido = "Este es el contenido del archivo.";

        try {
            // Crear un objeto File con la ruta y el nombre del archivo
            File archivo = new File("src/recursos/tour.txt");

            // Crear el archivo si no existe
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Escribir el contenido en el archivo
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenido);
            escritor.close();

            System.out.println("Se ha escrito el contenido en el archivo.");

        } catch (IOException e) {
            System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
        }
    }
}

