package clasesHerencia.Hora;

public class Hora {
    private int hora;
    private int minuto;

    private int segundo;

    public Hora(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }

    void inc(){
        this.minuto += 1;
    }

    public boolean setHora(int hora) {
        if(hora >= 0 && hora <= 23){
            return true;
        } else {
            return false;
        }
    }
    public boolean setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 60){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return this.hora + ":" + this.minuto;
    }


}

public class HoraExacta extends Hora{
    
}
