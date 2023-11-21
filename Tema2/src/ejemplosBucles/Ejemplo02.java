package ejemplosBucles;

public class Ejemplo02 {

	public static void main(String[] args) {
		System.out.println("Escribe tu nombre 5 veces!");
		final String NOMBRE = "Juanjo";
		int contador = 0;

		while (contador < 5) {
			System.out.println(NOMBRE);
			contador++;
		}

	}

}
