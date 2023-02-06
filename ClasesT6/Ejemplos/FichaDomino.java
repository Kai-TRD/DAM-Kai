package ClasesT6.Ejemplos;

public class FichaDomino {
    
    // Atributos
    private int numIzquierda;
    private int numDerecha;


    // Constructor
    public FichaDomino(int numIzquierda, int numDerecha){
        if(numIzquierda == 0){
            
        } else {
            this.numIzquierda = numIzquierda;
        }


        if(numDerecha == 0){

        } else {
            this.numDerecha = numDerecha;
        }
    }

    public FichaDomino voltea(){
        int ladoAux = this.numIzquierda;
        this.numIzquierda = numDerecha;
        this.numDerecha = ladoAux;
        
        return this;
    }

    public boolean encaja(FichaDomino ficha){
        if( ficha.numDerecha == this.numIzquierda || ficha.numDerecha == this.numDerecha || ficha.numIzquierda == this.numIzquierda || ficha.numIzquierda == this.numDerecha){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "["+ this.numIzquierda +"|"+ this.numDerecha +"]";
    }
}
