package ClasesT6.Usos;

import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.Set;
import java.util.*;

import ClasesT6.Ejemplos.PersonaBanco;

public class caja {


    public static void main(String[] args) {
        
        double importeInicialCaja = 1000;

        PersonaBanco[] cola = new PersonaBanco[0];

        PersonaBanco persona1 = new PersonaBanco("Jhon", "sacar", 200);
        PersonaBanco persona2 = new PersonaBanco("Kai", "sacar", 300);
        PersonaBanco persona3 = new PersonaBanco("Emili", "ingresar", 300);
        PersonaBanco persona4 = new PersonaBanco("Rosetta", "sacar", 1000);
        PersonaBanco persona5 = new PersonaBanco("Orca", "sacar", 900);
        PersonaBanco persona6 = new PersonaBanco("Palvati", "sacar", 20);
    
        
        ponerEnFila(cola, persona1);
        ponerEnFila(cola, persona2);
        ponerEnFila(cola, persona3);
        ponerEnFila(cola, persona4);
        ponerEnFila(cola, persona5);
        ponerEnFila(cola, persona6);

        // cola[0] = persona1;
        // cola[1] = persona2;
        // cola[2] = persona3;
        // cola[3] = persona4;
        // cola[4] = persona5;
        // cola[5] = persona6;

        for (int i = 0; i < cola.length; i++) {
            System.out.println(cola[i]);
        }
    
    
    }

    public static void ponerEnFila(PersonaBanco[] cola, PersonaBanco persona){

        PersonaBanco a = persona;
        PersonaBanco[] temp = Arrays.copyOf(cola, cola.length + 1);
        cola = temp;
        cola.push(a);
    }
}
