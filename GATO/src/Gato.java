import java.io.ObjectInputStream.GetField;

import javax.swing.text.GapContent;

public class Gato {
    /*
     * Crea la clase Gato, con los atributos nombre, raza y sexo. Añade además el
     * método apareaCon.
     * Este método debe comprobar que los gatos son de distinto sexo, tras lo
     * cual, genera un nuevo gato.
     * Por ejemplo, sería válido algo como “Gato cria = garfield.apareaCon(lisa)”
     * En caso de que los gatos sean del mismo sexo, el método debe generar la
     * excepción ExcepcionApareamientoImposible.
     * 
     * Crea un programa desde el que se pruebe el método.
     * 
     */

    // ATRIBUTOS
    private String nombre;
    private String raza;
    private String sexo;

    // CONSTRUCTOR
    public Gato(String nombre, String raza, String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }

    // GETTER Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Gato apareaCon(Gato gato2) {

        Gato cria = null;

        try {
            if (this.sexo.equals(gato2.getSexo())) {
                throw new ExcepcionApareamientoImposible();
            } else {
                System.out.println("se aparean");


                // Raza de los padres
                int randomRaza = (int)(Math.random()*2);
                String razaCria = "";
                if (randomRaza == 0) {
                    razaCria = this.raza;
                } else {
                    razaCria = gato2.getRaza();
                }

                // sexo
                int randomSexo = (int)(Math.random()*2);
                String sexoCria = "";
                if (randomSexo == 0) {
                    sexoCria = this.sexo;
                } else {
                    sexoCria = gato2.getSexo();
                }
                


                cria = new Gato("CRIA", razaCria, sexoCria);
            }
        } catch (ExcepcionApareamientoImposible ex) {
            System.out.println(ex);
        }

        return cria;
    }

    @Override
    public String toString() {
        String gato = "\t---Gato---";
        gato += "\n\t  Nombre: " + this.nombre;
        gato += "\n\t  Raza: " + this.raza;
        gato += "\n\t  Sexo: " + this.sexo;

        return gato;
    }


}
