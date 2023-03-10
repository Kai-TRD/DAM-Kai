package examenT6y7.barco;

import examenT6y7.vehiculos.Vehiculo;

import java.util.Arrays;

import examenT6y7.pasajero.Pasajero;

public class Barco {

    // Atributos
    private String nombre;
    private int fechaBotadura;
    private int maxKgs;
    private int vehiculosMax;
    private int personaMax;

    private Vehiculo vehiculo;
    private Vehiculo[] garaje;

    private Pasajero pasajero;
    private Pasajero[] arrayPasajeros;

    // Constructores
    public Barco(String nombre, int fechaBotadura, int maxKgs, int vehiculosMax, int personaMax) {
        this.nombre = nombre;
        this.fechaBotadura = fechaBotadura;
        this.maxKgs = maxKgs;
        this.vehiculosMax = vehiculosMax;
        this.personaMax = personaMax;
    }

    // añadir o eliminar vehiculos
    public void embarcarVehiculo(Vehiculo vehiculo) {
        boolean repetido = false;
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == vehiculo) {
                repetido = true;
            } else {
                repetido = false;
            }
        }

        if (repetido = false) {
            Vehiculo[] copia = Arrays.copyOf(garaje, garaje.length + 1);
            copia[copia.length - 1] = vehiculo;
            this.garaje = copia;
        }
    }

    public void desembarcarVehiculo(Vehiculo vehiculo) {
        Vehiculo[] copia = Arrays.copyOf(garaje, garaje.length - 1);
        this.garaje = copia;
    }

    // añadir o eliminar pasajeros
    public void embarcarPasajero(Pasajero pasajero) {
        boolean repetido = false;
        for (int i = 0; i < arrayPasajeros.length; i++) {
            if (arrayPasajeros[i] == pasajero) {
                repetido = true;
            } else {
                repetido = false;
            }
        }

        if (repetido = false) {
            Pasajero[] copia = Arrays.copyOf(arrayPasajeros, arrayPasajeros.length + 1);
            copia[copia.length - 1] = pasajero;
            this.arrayPasajeros = copia;
        }
    }

    public void desembarcarPasajero(Pasajero pasajero) {
        Pasajero[] copia = Arrays.copyOf(arrayPasajeros, arrayPasajeros.length - 1);
        this.arrayPasajeros = copia;
    }

    public String informacionBarco() {
        String barco = this.nombre + " - Per.Max: " + this.personaMax + " - Veh.Max: " + this.vehiculosMax + " - Kgs Maximo:" + this.maxKgs + " kgs -  Botadura:" + this.fechaBotadura;
        barco += "Pasajeros (" + this.arrayPasajeros.length + ")";
        for (int i = 0; i < arrayPasajeros.length; i++) {
            barco += (pasajero);
        }
        barco += "Vehiculos (" + this.garaje.length + ")";
        for (int i = 0; i < garaje.length; i++) {
            barco += vehiculo.informacion();
        }

        return barco;
    }
}
