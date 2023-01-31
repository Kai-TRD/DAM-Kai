package Clases.ejemplos;

public class Horas {
    
    // Atributos
    private int hora;
    private int minuto;
    private int segundo;


    public void pedirHora(){
        System.out.println("Dime la hora");
    }
    
    // Constructor
    public Horas(int hora){
        if(hora < 0 && hora > 23){
            // hora introducida incorrecta
            this.hora = 0;
        } else {
            this.hora = hora;
        }

        this.minuto = 0;
        this.segundo = 0;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String impresion(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    
    public void addsegundos(){
        if(segundo == 59){
            this.segundo = 0;
            this.addMinuto();
        } else {
            this.segundo += 1;
        }
    }


    private void addMinuto(){
        if(minuto == 59){
            this.minuto = 0;
            this.addHora();
        } else {
            this.minuto += 1;
        }
    }
    
    private void addHora(){
        if(minuto == 23){
            this.minuto = 0;
        } else {
            this.minuto += 1;
        }
    }
}
