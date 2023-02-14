package Practicas;
public class EquivalenciasTipos {
    public static void main(String[] args) {
        
        
        short datoByte = 4;

        short datoShort= 5;

        //tipo short es mas grande y no cabe un byte
        //datoByte = datoShort

        datoShort = datoByte; //Si es posible por ampliacion

        //Casting

        double datoDouble = 100.04;

        long datoLong = (long)datoDouble;

        int datoInt = (int) datoDouble;
        System.out.println("Dato Doble= "+datoDouble);
        System.out.println("Dato Doble casting con long= " + datoLong);
        System.out.println("Dato Doble casting con int= "+datoInt);
        System.out.println("Data short "+ datoShort);

    }
}