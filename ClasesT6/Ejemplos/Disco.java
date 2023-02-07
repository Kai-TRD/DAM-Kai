package ClasesT6.Ejemplos;

public class Disco {

private String codigo;
private String autor;
private String titulo;
private String genero;
private int duracion;

// Getter and setters
public String getCodigo() {
    return codigo;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String gettitulo() {
    return titulo;
}

public void settitulo(String titulo) {
    this.titulo = titulo;
}

public String getGenero() {
    return genero;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public int getDuracion() {
    return duracion;
}

public void setDuracion(int duracion) {
    this.duracion = duracion;
}

// Constructores
public Disco(String codigo,String autor,String titulo,String genero,int duracion){
    this.codigo = codigo;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
}

public Disco() {
}

public String getTitulo() {
    return null;
}

public void setTitulo(String tituloIntroducido) {
}



}
