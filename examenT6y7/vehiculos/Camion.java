package examenT6y7.vehiculos;

import examenT6y7.pasajero.Pasajero;

public class Camion extends Vehiculo {
    
    private int pesoMax;
    private boolean mercanciaPeligrosa;

    public Camion(String matricula, Pasajero pasajero) {
        super(matricula, pasajero);
    }
    
    public Camion(String matricula, int pesoMax) {
        super(matricula, pasajero);
        this.pesoMax = pesoMax;
    }

    public Camion(String matricula, int pesoMax, boolean mercanciaPeligrosa) {
        super(matricula, pasajero);
        this.pesoMax = pesoMax;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }


    

    public String informacion() {
        return "Coche: matricula="+ this.matricula +" - propietario=" + pasajero.getNombre() + " - " + pasajero.getApellido() + " - " + pasajero.getNacionalidad() + " - Camarote: " + pasajero.isDerechoCamarote() + " (Codigo=" + pasajero.getCodUnico() + " ) - Max carga: " + this.pesoMax;
    }
    
    
}
