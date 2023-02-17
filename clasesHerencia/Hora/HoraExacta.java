package clasesHerencia.Hora;

public class HoraExacta extends Hora{

    private int segundos;

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos (int segundos) {
        boolean pone;
        if(segundos <= 60 || segundos >= 0){
            pone = true;
            this.segundos = segundos;
        } else {
            pone = false;
        }
        return pone;
    }

    public HoraExacta(int hora, int minuto,int segundos){
        super(hora, minuto);
        this.segundos = segundos;
    }
}
    