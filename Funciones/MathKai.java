import java.lang.Thread.State;

public class MathKai {
    

    /**
	 * 1-Es capicua
     * Clacula si un numero es Capicua
     * @param numero
     * @return
     */
		static boolean esCapicua (int numero){
			boolean resultado = false;

			//Calculo si es capicua
			int numeroComparar = numero;
			int resto = 0;
			int invertido = 0;

			while( numero > 0 ) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
			}

			if(numeroComparar == invertido){
				resultado = true;
			}
			return resultado;
		}

		
	/**
	 * 2-Es Primo
	 * @param numero
	 * @return
	 */
		static boolean esPrimo (int numero){
		
				// El 0, 1 y 4 no son primos
				if (numero == 0 || numero == 1 || numero == 4) {
				return false;
				}
				for (int x = 2; x < numero / 2; x++) {
				// Si es divisible por cualquiera de estos números, no
				// es primo
				if (numero % x == 0)
					return false;
				}
				// Si no se pudo dividir por ninguno de los de arriba, sí es primo
				return true;
		}








	/**
	 * 5-cuenta los diguitos que hay
	 * @param numero
	 * @return
	 */
		static int numeroDigitos (int numero){
			int cuentaNumero = 0;

			while(numero > 0){
				numero = numero/10;
				cuentaNumero++;
			}

			return cuentaNumero;
		}

	/**
	 * 9-quita una cantidad de digitos por la derecha
	 * @param numero
	 * @param cantidad
	 * @return
	 */
		static int quitaPorDetras (int numero, int cantidad){
			
			int numeroTemporal = numero;
			
			while(numeroTemporal > 0){
				numeroTemporal = numeroTemporal/10;
			}

	
			for (int i = cantidad; i > 0; i--) {
				numero = numero / 10;
			}
			return numero;
		}

}
