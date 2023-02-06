package ClasesT6.Usos;

import ClasesT6.Ejemplos.TarjetaRegalo;

public class usoTarjetaRegalo {
    public static void main(String[] args) {
        
        TarjetaRegalo t1 = new TarjetaRegalo(100.0);
        TarjetaRegalo t2 = new TarjetaRegalo(120.0);
        System.out.println(t1);
        System.out.println(t2);
        t1.gasta(45.90);
        t2.gasta(5.0);
        t2.gasta(200.0);
        t1.gasta(3.55);
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
