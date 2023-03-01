package ClasesT6.Trenes.maquinaria;

public class Vagon {

    // tienen un número que los identifica, una carga máxima (kgs), la carga actual
    // y el tipo de mercancía con la que están cargados. Si la carga máxima es
    // superada entonces no se debe de poder enganchar a una locomotora.

    // Valores
    private String id;
    private int cargaMaxima;
    private int cargaActual;
    private String tipoMercancia;
    private boolean poderEnganchar;

    // Contructor
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    public boolean isPoderEnganchar() {
        return poderEnganchar;
    }

    public void setPoderEnganchar(boolean poderEnganchar) {
        this.poderEnganchar = poderEnganchar;
    }

    public Vagon(String id, int cargaMaxima, int cargaActual, String tipoMercancia/** b, oolean poderEnganchar **/
    ) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;

        if (this.cargaActual > this.cargaMaxima) {
            this.poderEnganchar = false;
            this.poderEnganchar = true;

        } else {
            System.out.println("VAGON SUPERA CAPACIDAD MAXIMA!");
        }
    }
}