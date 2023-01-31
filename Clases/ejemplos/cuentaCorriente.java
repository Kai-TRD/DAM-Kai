package Clases.ejemplos;

import java.rmi.server.RemoteStub;
import java.util.Scanner;

public class cuentaCorriente {
    String nombre;
    String dni;
    String nombreTitular;
    double saldo = 0;

    private Gestor gestor;
    
    // Construcotres
    public cuentaCorriente(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    public cuentaCorriente(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
    }

    public cuentaCorriente(String dni, String nombreTitular, double saldo){
        this(dni, nombreTitular);
        this.saldo = saldo;
    }

    public cuentaCorriente(String dni, String nombreTitular, double saldo, Gestor gestor){
        this(dni, nombre, saldo);
        this.gestor = gestor;
    }
    //******Metodos******

    Scanner sc = new Scanner(System.in);




    //Crear cuenta
    public void crearCuenta(String dniNuevo,String nombreNuevo){
        dni = dniNuevo;
        nombre = nombreNuevo;
    }

    public void sacarDinero(double sacar){
        if(saldo < sacar){
            System.out.println("Lo sentimos, saldo insuficiente");
        } else {
            saldo = saldo - sacar;
            System.out.println("Has sacado: " + sacar);
        }

    }

    public void mostrarInformacion(){
        System.out.println(nombre + "\t" + dni + "\t" + saldo);
    }

    public String obtenerNombreGestor(){
        String nombreGestor = "Sin asignar";

        // Si existe un gestor y ese gestor tiene nombre entoncves cojo su valor
        if(this.gestor != null && this.gestor.getnombre() != null){
            
            nombreGestor = this.gestor.getnombre();
        
        }
        return nombreGestor;

    }

    
}
