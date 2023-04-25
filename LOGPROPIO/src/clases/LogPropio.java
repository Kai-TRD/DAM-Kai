package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogPropio {

    public enum TipoMensaje {
        ERROR, INFORMACION
    }

    public static void NuevaEntradaALog(String mensaje, TipoMensaje tipoMensaje) {

        String rutaAFicheroLog = "src/log.txt";

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {

            fileWriter = new FileWriter(rutaAFicheroLog, true);
            bufferedWriter = new BufferedWriter(bufferedWriter);

            bufferedWriter.newLine();

            String cadena = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME)
                    + " - " + tipoMensaje.toString()
                    + " - " + mensaje;
            bufferedWriter.write(cadena);

        } catch (IOException ioException) {

            System.out.println(ioException.getMessage());
        }

    }

}
