package clasesHerencia.Hora;

public class Hora {
    private int hora;
    private int minuto;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    void inc() {
        this.minuto += 1;
    }

    public boolean setHora(int hora) {
        boolean pone;
        if (hora >= 0 && hora <= 23) {
            pone = true;
            this.hora = hora;
        } else {
            pone = false;
        }
        return pone;
    }

    public boolean setMinuto(int minuto) {
        boolean pone;
        if (minuto >= 0 && minuto <= 23) {
            pone = true;
            this.minuto = minuto;
        } else {
            pone = false;
        }
        return pone;
    }

    @Override
    public String toString() {

        return this.hora + ":" + this.minuto;
    }

    @Override
    public boolean equals(Object valor){
        boolean resultado = false;
        Hora hora = (Hora)valor;
        if(this.hora == hora.hora && this.minuto == hora.minuto){
            resultado = true;
        }

        return resultado;
    }

}
