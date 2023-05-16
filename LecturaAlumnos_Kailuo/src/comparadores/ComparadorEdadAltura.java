package comparadores;

import java.util.Comparator;

import contenedores.Alumno;

public class ComparadorEdadAltura implements Comparator<Alumno> {

    @Override
    public int compare(Alumno arg0, Alumno arg1) {
        
        W
        
        if (arg0.getEdad() == arg1.getEdad()) {
            Double estatura1 = Double.valueOf(arg1.getEstatura());
            Double estatura0 = Double.valueOf(arg0.getEstatura());

            return estatura1.compareTo(estatura0);
        }



        return 0;

        
    }
    
}
