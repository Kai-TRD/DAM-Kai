package Clases.ejemplos;

class Persona {
    //Definir atrivuto de personas

    String dni;
    String nombre;
    String apellido;
    int edad;
    double estatura;


    //IMPLEMENTAR LOS MÉTODOS DE CLASE (COMPORTAMIENTO)
    void saludar(){
        System.out.println(nombre + " dice hola");
    }

    void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    void cumplirAño(){
        edad = edad++;
    }

    void mostrarPersona(){
        System.out.println("nombre: "+nombre+" "+apellido);
        System.out.println("Edad: "+edad);
    }

}
