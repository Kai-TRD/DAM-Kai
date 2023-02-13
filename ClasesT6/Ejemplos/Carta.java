package ClasesT6.Ejemplos;

public class Carta {
    
    public enum Palo{ORO, BASTO, ESPADA, COPA};

    // Valores
    private Palo palo;
    private int numero;


    // Contructor
    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Carta(Palo palo, int numero){
        this.palo = palo;
        this.numero = numero;
    }



    // Metodos
    
    /**
     * Devuelve true si la carta que hace la invocacion es menor
     * a la que se le pasa por parametros
     * @param c
     * @return
     */
    public boolean esMayor(Carta c){
        boolean resultado = false;
        if(this.numero < c.numero){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

}
