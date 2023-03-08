package clasesHerencia.Instituto;

public class pruebas {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            double numeroTel = (double)(Math.random()*100+600000000);            
            System.out.println("Telf["+ i +"]: " + (i + 100));
        }
    }
}
