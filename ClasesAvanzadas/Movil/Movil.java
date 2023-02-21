package ClasesAvanzadas.Movil;

import java.nio.file.ProviderMismatchException;
import java.text.DecimalFormat;
import ClasesT6.Ejemplos.Terminal;
import Practicas.cadenas;
public class Movil extends Terminal{
    public enum Tarifa{RATA, MONO, BISONTE}

    // NUEVO ATRIBUTO
    private Tarifa tarifa;

    public Movil(String numero, String tarifa){
        super(numero);
        
        // Lo convierto en mayusculas como los nombres de las tarifas posibles
        tarifa = tarifa.toUpperCase();
        Tarifa tarifaEnum = Tarifa.valueOf(tarifa);
        this.tarifa = tarifaEnum;
    }





    @Override
    public String toString(){

        DecimalFormat formatDecimal = new DecimalFormat("#0.00");

        String cadena = "";
        cadena = super.toString() + " - tarificados"+  formatoDecimal.format(totalTarificado()) +" euros";
        return cadena; 
    }

    private Double totalTarificado() {
        
        double total = 0;

        switch(this.tarifa){
            case RATA:
            total = this.tiempoConversacion * 0.06;
            break;
            case MONO:
            total = this.tiempoConversacion * 0.12;
            break;
            case BISONTE:
            total = this.tiempoConversacion * 0.3;
            break;
            default:
            total = 0;
            break;
        }

        return total;
    }
}
