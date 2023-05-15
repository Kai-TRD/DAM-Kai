package clases;

import java.util.Comparator;

public class MunicipioComparator implements Comparator<Municipio> {

    public int compare(Municipio municipio1, Municipio municipio2) {

        int temp = municipio1.getMunicipios().compareTo(municipio2.getMunicipios());

        if (temp != 0) {
            return temp;
        }

        return Integer.compare(municipio1.getPeriodo(), municipio2.getPeriodo());
    }
}
