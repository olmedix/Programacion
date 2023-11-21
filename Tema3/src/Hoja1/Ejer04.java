package Hoja1;

public class Ejer04 {

	public static void main(String[] args) {
		// Crea un array llamado companyeros con 4 posiciones y ve asignando a cada una
		// de ellas el
		// nombre de uno de los cuatro compañeros más cercanos a tu sitio. Haz que
		// después se muestren
		// todos los valores mediante un bucle for.
		String[] companyeros = new String[4];

		companyeros[0] = "Luka";
		companyeros[1] = "Juan";
		companyeros[2] = "Manu";
		companyeros[3] = "Alex";

		for (int i = 0; i < companyeros.length; i++) {
			System.out.print(companyeros[i] + " ");
		}

	}

}
