package ClasesT6.Usos;

import java.lang.reflect.Array;

import ClasesT6.Ejemplos.Carta;
import ClasesT6.Ejemplos.Carta.Palo;

public class JuegoCartas {
    public static void main(String[] args) {
        
        Carta[] baraja = new Carta[12];

        for(Palo palo : Palo.values()){
            for (int i = 1; i < 13; i++) {
                baraja.push(Carta(null, i));
            }
        }









    }
}
