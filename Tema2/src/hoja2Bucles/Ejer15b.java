package hoja2Bucles;

public class Ejer15b {

	public static void main(String[] args) {
		// Crea una aplicación que calcule una lista con las potencias de 3 menores que
		// 12000.
		// Haz que en cada pasada del bucle se muestre el exponente y el valor de la
		// potencia.
		// Utiliza un bucle do-while
		
		int exponente = 1;
		int base = 3;
		int potencia = 3;
		
		do {
			System.out.println(base + "^" + exponente + ": " + potencia);
			potencia =base*potencia;
			exponente++;
		} while (potencia < 12000);
	}

}