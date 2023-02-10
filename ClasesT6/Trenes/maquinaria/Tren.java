package ClasesT6.Trenes.maquinaria;

import ClasesT6.Trenes.personal.Maquinista;

public class Tren {

    // está formado por una locomotora y un máximo de 5 vagones. Cada tren tiene
    // asignado un maquinista que es el responsable de él.

    // Crea para los trenes la función para poder ver que locomotora y que vagones
    // tiene enganchados:

    // Locomotora: AAAA1 (120Cv) - [V1 - 50kgs de 100 Madera ] - [V2 - 30kgs de 120
    // Acero] = 70kgs de Carga total - NombreMaquinista (rango)



    // Valores1
    private Locomotora locomotora;
    private Vagon vagon;
    private Maquinista maquinista;

    private int pesoTotalVagon;
    int contador = 1;
    Vagon[] vagones = new Vagon[10];

    // Contructor
    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
    }

    public void enganchaVagon(int cargaActual, int cargaMaxima, String tipoMercancia) {
        if (vagones[5] == vagones[2]) {
            System.out.println("NO SE PUEDE ENGANCHAR, MAXIMA CAPACIDAD");
        } else {
            
            vagones[contador] = new Vagon(null, cargaMaxima, cargaActual, tipoMercancia);
            contador ++;
        }

    }

    @Override
    public String toString() {

        String cadena = "Locomotora: " + this.locomotora.getMatricula() + " (" + this.locomotora.getPotenciaMotor() + "Cv)";
        for (int i = 0; i < vagones.length; i++) {
            cadena += "- [" + this.vagon + " - " + this.vagon.getCargaActual() + "kgs de " + this.vagon.getCargaMaxima() + " " + this.vagon.getTipoMercancia() + " ]";
            pesoTotalVagon += this.vagon.getCargaActual();
        }

        cadena += "= " + this.pesoTotalVagon + "kgs de Carga total - " + this.maquinista.getNombre() + "(" + this.maquinista.getRango() + ")";
        return cadena;
    }
}