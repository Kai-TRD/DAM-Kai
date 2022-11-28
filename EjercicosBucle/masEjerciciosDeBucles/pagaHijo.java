package masEjerciciosDeBucles;

public class pagaHijo {
    public static void main(String[] args) {
        /*
         Javier tiene un hijo al que le quiere dar de paga 0.05€, al ver la cara de tristeza
         de su hijo le promete que cada semana le dará de paga el doble de la anterior semana.
         El hijo le parece genial y sueña con comprarse un bicicleta nueva de 2000 €.
         ¿Cuantas semanas tardará en poder comprarse la bici?
        */
        final int PRECIOBICI = 2000;
        int numeroSemana = 0;
        float dineroSemanaMult = 0.05f;
        float dineroActual = 0f;
        float dineroAhorrado = 0;

        while (dineroAhorrado < PRECIOBICI){
            numeroSemana++;
            System.out.println("Semana " + numeroSemana + ": " + dineroActual + " €");
            dineroActual = dineroSemanaMult * 2;
            dineroSemanaMult = dineroSemanaMult*2;
            dineroAhorrado = dineroAhorrado + dineroActual;
        }
        System.out.println("Tardarias " + (numeroSemana +1) + " semanas en comprar la bici");
        System.out.println(dineroAhorrado);
    }
}
