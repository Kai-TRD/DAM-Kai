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

    public String voltea(){
        FichaDomino fichaDomino = new FichaDomino(numDerecha, numIzquierda);
        return this.FichaDomino = fichaDomino;
    }

    @Override
    public String toString(){
        return "["+ numIzquierda +"|"+ numDerecha +"]";
    }
}
