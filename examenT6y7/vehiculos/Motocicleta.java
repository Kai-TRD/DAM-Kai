package examenT6y7.vehiculos;

import examenT6y7.pasajero.Pasajero;

public class Motocicleta extends Vehiculo{

    int cilindrada;
    boolean necesitaCarnet;

    public Motocicleta(String matricula, Pasajero pasajero) {
        super(matricula, pasajero);
    }

    public Motocicleta(String matricula, int cilindrada, boolean necesitaCarnet) {
        super(matricula, pasajero);
        this.cilindrada = cilindrada;
        this.necesitaCarnet = necesitaCarnet;
    }


    public String informacion() {
        return "Motocicleta: matricula="+ this.matricula +" - propietario=" + pasajero.getNombre() + " - " + pasajero.getApellido() + " - " + pasajero.getNacionalidad() + " - Camarote: " + pasajero.isDerechoCamarote() + " (Codigo=" + pasajero.getCodUnico() + " ) - Cilindrada: " + this.cilindrada + " - ConCarnet: " + this.necesitaCarnet;
    }

}
