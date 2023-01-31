package Clases.ejemplos;

public class SintonizadorFM {

    private double frecuencia = 80;

    public SintonizadorFM(){
        this.frecuencia = 80;
    }

    public SintonizadorFM(double frecuencia){

        if(frecuencia >= 80 && frecuencia <= 108){
            this.frecuencia = frecuencia;
        } else if(frecuencia < 80){
            this.frecuencia = 80;
        } else {
            this.frecuencia = 108;
        }
    }

    // métodos
    public void up(){
        this.frecuencia += 0.5;
        if(this.frecuencia > 108){
            this.frecuencia = 80;
        }
    }

    public void down(){
        this.frecuencia -= 0.5;
        if(this.frecuencia < 80){
            this.frecuencia = 108;
        }
    }

    public void display(){
        System.out.println("Frecuencia: " + this.frecuencia + "GHz");
    }


}
