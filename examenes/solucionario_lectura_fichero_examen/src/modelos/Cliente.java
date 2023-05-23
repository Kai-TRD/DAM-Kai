package modelos;

public class Cliente {
    
    // Atributo
    private Integer codigo;
    private String nombre;
    private String direccion;
    private String email;

    // Constructor
    public Cliente() {

    }

    // getter y setter
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.codigo;
    }

    

}
