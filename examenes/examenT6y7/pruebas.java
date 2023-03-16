package examenes.examenT6y7;

import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

import examenes.examenT6y7.barco.Barco;
import examenes.examenT6y7.pasajero.Pasajero;
import examenes.examenT6y7.vehiculos.*;

public class pruebas {
    public static void main(String[] args) {

        
        
    }
    
    public void embarcarVehiculo(String[] vehiculo) {
        String[] copia=Arrays.copyOf(garaje, garaje.length+1);
        copia[copia.length-1]=vehiculo;
        this.garaje = copia;
    }
    public void desembarcarVehiculo(String[] vehiculo) {
        String[] copia=Arrays.copyOf(garaje, garaje.length-1);
        this.garaje = copia;
    }
    
}
