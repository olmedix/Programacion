package ejemplos;

public class Ejemplo16 {

	public static void main(String[] args) {

		// Como funciona printf para hacer tablas.

		// Ejemplo de uso de printf.
		float temp = 10;
		float humedad = 60;
		System.out.printf("Hoy hace %f grados y hay una humedad de %f. \n", temp, humedad);

		String[][] alturas = { { "Manuel Díaz", "1.75" }, { "Rosa Sánchez", "1.70" }, { "María de la Rosa", "1.65" },
				{ "Jorge Luís Martínez", "1.72" }, };

		System.out.printf("%-20s %4s\n", "Nombre","Estatura");
		System.out.printf("%-20s %4s\n", "===================","========");
		for (int i = 0; i < alturas.length; i++) {

			System.out.printf("%-20s %4s\n", alturas[i][0], alturas[i][1]);

		}

	}

}
