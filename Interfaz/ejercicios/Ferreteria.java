package Interfaz.ejercicios;

import java.util.Arrays;
import java.time.LocalDateTime;

public class Ferreteria extends Negocio implements Tienda_I {

    private int tipoIVA;
    private Cliente[] cola;
    private double dineroEnCaja;


    public Ferreteria(String nombre){
        super(nombre, nombre);
        this.nombre = nombre;
        cola = new Cliente[0];
        dineroEnCaja = 100;
        tipoIVA = 21;
    }

    public double pagarImpuestos(){
        return dineroEnCaja * tipoIVA/100.0;
    }

    @Override
    public void abrir() {
        System.out.println("La ferreteria: " + this.nombre + " abre ya " + LocalDateTime.now());
    }

    @Override
    public double cobrar() {
        double total = 0;
        if(cola.length > 0){
            Cliente clienteQueLeToca = cola[0];

            total = clienteQueLeToca.getDinero();
            this.dineroEnCaja += total;

            System.out.println("Atiendo al cliente: " + clienteQueLeToca.getNombre());

            // Rehago la cola sin el primer cliente

            Cliente[] nuevaCola = new Cliente[cola.length-1];
            
            for (int i = 0; i < nuevaCola.length; i++) {
                nuevaCola[i] = cola[i+1];
            }

            cola = nuevaCola;

        }

        return total;
    }

    @Override
    public void ponerEnCola(Cliente cliente) {
        
        Cliente[] nuevaCola = Arrays.copyOf(cola, cola.length + 1);
        nuevaCola[nuevaCola.length - 1] = cliente;

    }


}
