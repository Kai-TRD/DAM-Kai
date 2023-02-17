package clasesHerencia.Instrumentos;

public abstract class Instrumento {
    public enum Notas {DO, RE, MI, FA, SOL, LA, SI}

    // Atributos
    private Notas[] melodia;

    public Instrumentos(){
        melodia = new Nota[0];
    }

    // Metodo
    public void ass(Notas nota){

        Notas[]nuevaMelodia = new Notas[this.melodia.length+1];

        for (int i = 0; i < this.melodia.length; i++) {
            nuevaMelodia[i] = this.melodia[i];
        }

        
    }

    abstract void interpretar();

}
