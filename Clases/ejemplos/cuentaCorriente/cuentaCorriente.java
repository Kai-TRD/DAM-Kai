package cuentaCorriente;

import java.util.Scanner;

class cuentaCorriente {
    String nombre;
    String dni;
    String nombreTitular;
    double saldo = 0;


    
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
}
