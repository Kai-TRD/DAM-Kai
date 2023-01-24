package Clases.ejemplos;

public class unaPersona {
    public static void main(String[] args) {
        
        //llamar al contructor de la clase persomna
        Persona p1 = new Persona();

        p1.nombre = "Pepe";
        p1.apellido = "García";
        p1.edad = 19;
        p1.dni = "123455G";
        p1.estatura = 1.75;


        Persona p2 = new Persona();

        p2.nombre = "Emili";
        p2.apellido = "";
        p2.edad = 23;
        p2.dni = "694209K";
        p2.estatura = 1.70;

        // Muestra la dirección de memoria del objeto
        // System.out.println(p1.toString());




        mostrarPersona(p1);

        p1.saludar();
        p1.cambiarNombre("Jhon");

        p1.mostrarPersona();

        p2.mostrarPersona();

    }


    static void mostrarPersona(Persona persona){
        System.out.println(persona.nombre + " " + persona.apellido);
    }
}
