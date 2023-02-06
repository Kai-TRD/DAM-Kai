package ClasesT6.Ejemplos;

public class TarjetaRegalo {
    // ATRIBUTOS
    Double saldo;
    int id;


    // CONSTRUCTOR
    public TarjetaRegalo(Double saldo){
        this.saldo = saldo;
        this.id = (int)((Math.random()*10000)+10000);
    }

    public void gasta(Double dineroGastado){
        if(dineroGastado > saldo){
            System.out.println("No tiene suficiente saldo para gastar " + dineroGastado + "€");
        } else {
            this.saldo -= dineroGastado;
        }   
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta){
        double saldoTotal = this.saldo + tarjeta.saldo;
        this.saldo = 0.0;
        tarjeta.saldo = 0.0;
        TarjetaRegalo tarjetaNueva = new TarjetaRegalo(saldoTotal);
        return tarjetaNueva;
    }



    @Override
    public String toString(){
        return "Tarjeta no "+ id +" - Saldo "+ saldo +"€";
    }

}
