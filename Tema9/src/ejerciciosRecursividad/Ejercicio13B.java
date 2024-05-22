package ejerciciosRecursividad;

public class Ejercicio13B {

	public static void main(String[] args) {

		String frase2 = "dabale arroz a la zorra el abad";
		frase2 = quitaEspacios(frase2);

		System.out.println(esPalindromo(frase2, 0, frase2.length() - 1));

	}

	private static String quitaEspacios(String frase) {

		String fraseSinEspacios = frase.replace(" ","");
		System.out.println(fraseSinEspacios);
		

		return fraseSinEspacios;
	}

	private static boolean esPalindromo(String frase, int inicio, int fin) {

		if (inicio > fin) {
			return true;
		}

		if (frase.charAt(inicio) != frase.charAt(fin)) {
			return false;
		}

		return esPalindromo(frase, inicio + 1, fin - 1);

	}

}
