package persona;

class Persona {
    //Definir atrivuto de personas

    String dni;
    String nombre;
    String apellido;
    int edad;
    double estatura;



    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(String dni, String nombre, int edad, double estatura){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona(String dni, String nombre, String apellido, int edad, double estatura){
        // this.dni = dni;
        // this.nombre = nombre;
        // this.apellido = apellido;
        // this.edad = edad;
        // this.estatura = estatura;

        this(dni, nombre, edad, estatura);
        this.apellido = apellido;
    }



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
