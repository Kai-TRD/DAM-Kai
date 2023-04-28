import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import clases.LeerInformacion;
import clases.Municipio;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * [-] Ordenar los municipios por nombre y año (ascendente ambos)
         * [x] Información de Mijas en 2022
         * [x] Incremento de la población de Fuengirola del año 2016 al 2022
         * [x] Incremento de la población de Mijas del año 2016 al 2022
         * [x] Municipio menos poblado en 2021
         */

        LeerInformacion leer = new LeerInformacion();

        System.out.println("\n+---Ordenar los municipios por nombre y año (ascendente ambos)---+\n");

        ArrayList<Municipio> listaMunicipio = leer.LeerFicheroMunicipio(null);

        Collections.sort(listaMunicipio, new clases.MunicipioComparator());

        for (int i = 0; i < listaMunicipio.size(); i++) {
            System.out.println(listaMunicipio.get(i));
        }

        System.out.println("\n+---Información de Mijas en 2022---+\n");
        ArrayList<Municipio> listaMunicipioBuscar = leer.BuscarMunicipio(listaMunicipio, "Mijas", 2022);
        for (int i = 0; i < listaMunicipioBuscar.size(); i++) {
            System.out.println(listaMunicipioBuscar.get(i));
        }

        System.out.println("\n+---Incremento de la población de Fuengirola del año 2016 al 2022---+\n");

        HashMap<String, Integer> lista = leer.IncrementoPoblacion(listaMunicipio, 2022, 2016);

        int contador = 1;
        for (HashMap.Entry<String, Integer> entrada : lista.entrySet()) {
            String clave = entrada.getKey();
            Integer valor = entrada.getValue();
            if (clave.equals("29054 Fuengirola"))
                System.out.println(contador + " - " + clave + " : " + valor);
            contador++;
        }

        System.out.println("\n+---Incremento de la población de Mijas del año 2016 al 2022---+\n");

        HashMap<String, Integer> lista2 = leer.IncrementoPoblacion(listaMunicipio, 2022, 2016);

        int contador2 = 1;
        for (HashMap.Entry<String, Integer> entrada : lista2.entrySet()) {
            String clave = entrada.getKey();
            Integer valor = entrada.getValue();
            if (clave.equals("29070 Mijas"))
                System.out.println(contador2 + " - " + clave + " : " + valor);
            contador++;
        }

        System.out.println("\n+---Municipio menos poblado en 2021---+\n");

        ArrayList<Municipio> listaMunicipio2 = leer.LeerFicheroMunicipio(2021);

        int menosPoblado = 0;
        int actual = 999999999;

        for (int i = 0; i < listaMunicipio2.size(); i++) {
            if (listaMunicipio2.get(i).getTotal() < actual) {
                actual = listaMunicipio2.get(i).getTotal();
                menosPoblado = i;
            }
        }

        System.out.println(listaMunicipio2.get(menosPoblado));
    }
}
