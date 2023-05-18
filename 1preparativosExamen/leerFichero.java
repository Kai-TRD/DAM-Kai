

public class leerFichero {
    public static void main(String[] args) {
        // importa las 3 jar de la carpeta lib para poder leer archivos

        	/**
	 * Convierte un objeto en un Json
	 */
	public static void convertToJson() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			// convert Object to json string
			Employee emp1 = createEmployee();
			// configure Object mapper for pretty print
			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

			// Puedo imprimirlo por consola
			// writing to console, can write to any output stream such as file
			// StringWriter stringEmp = new StringWriter();
			// Sacar por consola el Json
			// objectMapper.writeValue(stringEmp, emp1);
			// System.out.println("Employee JSON is\n"+stringEmp);

			// Puedo guardarlo en un fichero
			File fileEmp1 = new File("src/recursos/empleado1.txt");
			objectMapper.writeValue(fileEmp1, emp1);

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

        
    }
}
