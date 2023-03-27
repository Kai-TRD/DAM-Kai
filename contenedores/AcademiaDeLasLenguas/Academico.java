package contenedores.AcademiaDeLasLenguas;

public class Academico implements Comparable<Academico>{
    private String nombre;
    private int anoIngreso;

    public Academico(String nombre, int anoIngreso){
        this.nombre = nombre;
        this.anoIngreso = anoIngreso;
    }

    @Override
    public String toString(){
        return "[Academico: " + this.nombre + " año: " + this.anoIngreso + "]";
    } 



    @Override
    public int compareTo(Academico o) {
        return this.nombre.compareTo(o.nombre);
    }
}
    