package examenes.examenT6y7.vehiculos;

import examenes.examenT6y7.pasajero.Pasajero;

public class Coche extends Vehiculo{

    private int numPlazas;
    private boolean particular;

    public Coche(String matricula, Pasajero pasajero) {
        super(matricula, pasajero);
    }

    public Coche(String matricula, int numPlazas, boolean particular) {
        super(matricula, pasajero);
        this.numPlazas = numPlazas;
        this.particular = particular;
    }

    public String informacion() {
        return "Coche: matricula="+ this.matricula +" - propietario=" + pasajero.getNombre() + " - " + pasajero.getApellido() + " - " + pasajero.getNacionalidad() + " - Camarote: " + pasajero.isDerechoCamarote() + " (Codigo=" + pasajero.getCodUnico() + " ) - Num Puestas: " + this.numPlazas + " -Es particular: " + this.particular;
    }

}
