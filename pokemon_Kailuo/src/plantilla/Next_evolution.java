package plantilla;

public class Next_evolution {

    // lit no pongas un Map, funciona con 2*Sts
    
    private String num;
    private String name;

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String lista = this.num + " - " + this.name;
        return lista;
    }

}
