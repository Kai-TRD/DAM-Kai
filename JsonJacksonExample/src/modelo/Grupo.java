package modelo;

import java.util.List;

public class Grupo {
    private List<Persona> people;

    public Grupo(){}

    public List<Persona> getPeople() {
        return people;
    }

    public void setPeople(List<Persona> people) {
        this.people = people;
    }

    public Persona get(int n){
        return people.get(n);
    }

    @Override
    public String toString() {
        
        String resultado = "";
        for (int i = 0; i < people.size(); i++) {
            resultado += people.get(i) + " ";
        }

        return resultado;
    }

}
