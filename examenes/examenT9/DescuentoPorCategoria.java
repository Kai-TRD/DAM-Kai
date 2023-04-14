package examenes.examenT9;

import java.util.HashMap;
import java.util.Map.Entry;

public class DescuentoPorCategoria {
    static HashMap<String, Integer> descuentoPorCategoria = new HashMap<>();

    public boolean insertar(String categoria, int descuento){
        HashMap<String, Integer> temp;
        for (Entry<String, Integer> entry : descuentoPorCategoria.entrySet()) {
            String clave = entry.getKey();

            if(clave.equals(categoria)){
                return false;
            } else {
                descuentoPorCategoria.put(categoria, descuento);
                return true;
            }

        }
        return false;
    }

    public boolean modificar(String categoria, int nuevoDescuento) {
        HashMap<String, Integer> temp;
        for (Entry<String, Integer> entry : descuentoPorCategoria.entrySet()) {
            String clave = entry.getKey();
            int valor = entry.getValue();

            if(clave.equals(categoria)){
                valor = nuevoDescuento;
                return true;
            }

        }
        return false;
    }

    public boolean eliminar(String categoria) {
        HashMap<String, Integer> temp;
        for (Entry<String, Integer> entry : descuentoPorCategoria.entrySet()) {
            String clave = entry.getKey();

            if(clave.equals(categoria)){
                descuentoPorCategoria.remove(categoria);
                return true;
            }
        }
        return false;
    }

    public int obtener(String categoria) {
        int descuento = 0;
        for (Entry<String, Integer> entry : descuentoPorCategoria.entrySet()) {
            String clave = entry.getKey();
            int valor = entry.getValue();

            if(clave.equals(categoria)){
                descuento = valor; 
            }
        }
        return descuento;
    }



    public String mostrarDescuento(){
        String cadenaDescuentos = "";
        for (Entry<String, Integer> entry : descuentoPorCategoria.entrySet()) {
            String clave = entry.getKey();
            int valor = entry.getValue();

            cadenaDescuentos += clave + " - " + valor + "%";
        }
        return cadenaDescuentos;
    } 

    




}
