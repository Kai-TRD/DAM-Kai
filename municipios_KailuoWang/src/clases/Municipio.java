package clases;

public class Municipio {
    String municipios;
    String sexo;
    int periodo;
    String total;

    public Municipio(String municipios, String sexo, int periodo, String total) {
        this.municipios = municipios;
        this.sexo = sexo;
        this.periodo = periodo;
        this.total = total;
    }

    @Override
    public String toString() {
        return municipios + "(" + periodo + "):" + total;
    }
}
