package ClasesT6.Ejemplos;

public class Terminal {
    
    public String numero;
    int tiempo;



    public Terminal(String numero){
        this.numero = numero;
    }

    public Terminal(String numero,int llama){
        this.numero = numero;
        this.tiempo = llama;
    }



    public void llama(Terminal t, int tiempo){
        this.tiempo += tiempo;
        t.tiempo += tiempo;
    }

    @Override
    public String toString(){
        return "No "+ numero +" - "+ tiempo +"s de conversación";
    }

}
