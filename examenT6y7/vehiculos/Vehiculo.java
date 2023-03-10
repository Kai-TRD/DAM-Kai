package examenT6y7.vehiculos;

import examenT6y7.pasajero.Pasajero;

public abstract class Vehiculo {
    protected String matricula;
    protected static Pasajero pasajero;
    
    public Vehiculo(String matricula, Pasajero pasajero){
        this.matricula = matricula;
        Vehiculo.pasajero = pasajero;
    }

    public abstract String informacion();

    public void setPropietario(Pasajero pasajero) {
        Vehiculo.pasajero = pasajero;
    }
    
}
