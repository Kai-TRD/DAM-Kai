public class ejercicio23 {
    public static void main(String[] args) {
        
        int sumaTotal = 0;
        int cantidadNumero = 0;
        int numeroNuevo = 0;
        
        int maximo = 0;
        int minimo = 0;

        maximo = numeroNuevo;
        minimo = numeroNuevo;

        int numeroNuevo1 = (int)(Math.random()*1000);
        
        
        do {
        int numeroNuevo2 = (int)(Math.random()*1000);

        if (cantidadNumero == 0) 
        {
            maximo = numeroNuevo1;
            minimo = numeroNuevo2;
        }
        else
        {
            maximo = Math.max(maximo, numeroNuevo1);
            minimo = Math.min(minimo, numeroNuevo2);
        }

        } while (sumaTotal < 1000);
    }
}
