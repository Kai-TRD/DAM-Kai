package modelos;

public class Cliente {

    //Atributos
    int codigo;
    String nombre;
    String direccion;
    String email;

    // Contructor
    public Cliente() {

    }

    // getters and setterss
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
        return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", email=" + email
                + "]";
    }

}
