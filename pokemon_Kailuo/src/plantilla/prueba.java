package plantilla;

public class prueba {
    public static void main(String[] args) {
        
        String prueba = "1.20 m";

        double a = Double.parseDouble(prueba.split(" ")[0]);
        System.out.println(a);
    }
}
