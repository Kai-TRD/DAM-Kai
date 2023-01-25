package cuentaCorriente;

public class usoCuentaCorriente {
    public static void main(String[] args) {
        
    
        cuentaCorriente cc_kailuo = new cuentaCorriente("232323K", "Kailuo", 420);
        cuentaCorriente cc_emili = new cuentaCorriente("323232E", "Emili", 435);
        cuentaCorriente cc_jose = new cuentaCorriente("444444J", "Jose", 89);
        cuentaCorriente cc_emma = new cuentaCorriente("709798E", "Emma", 999);

        cc_kailuo.mostrarInformacion();
        cc_emili.mostrarInformacion();
        cc_jose.mostrarInformacion();
        cc_emma.mostrarInformacion();
    
    }
}
