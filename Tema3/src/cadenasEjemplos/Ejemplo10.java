package cadenasEjemplos;

public class Ejemplo10 {

	public static void main(String[] args) {
		// Programa que lee una frase y nos dice por cuántas palabras está formada. Usa
		// el
		// método indexOf(int caracter, int posicion).

		String frase = "Este mes tiene 31 días.";

		int inicio = 0;
		int fin = frase.indexOf(" ");
		int cuentaPalabras = 1;

		while (fin != -1) {

			frase.indexOf(fin, inicio);

			cuentaPalabras++;

			inicio = fin + 1;
			fin = frase.indexOf(" ", inicio);

		}
		System.out.println(cuentaPalabras);
	}

}
