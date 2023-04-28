package clases;

public class Municipio {
    String municipios;
    String sexo;
    int periodo;
    int total;

    public Municipio(String municipios, String sexo, int periodo, int total) {
        this.municipios = municipios;
        this.sexo = sexo;
        this.periodo = periodo;
        this.total = total;
    }

    public String getMunicipios() {
        return municipios;
    }

    public void setMunicipios(String municipios) {
        this.municipios = municipios;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return sexo + "\t" + municipios + "(" + periodo + "):" + total;
    }
}
