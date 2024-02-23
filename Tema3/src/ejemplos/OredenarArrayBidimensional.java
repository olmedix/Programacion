package ejemplos;

public class OredenarArrayBidimensional {

	public static void main(String[] args) {

		String[][] sueldos = { { "Pepe", "1900" }, { "Juan", "1700" }, { "Laura", "1600" }, { "Paula", "1800" } };

		// Ordenaremos el array de menos a mayor sueldo (columna 1).
		int posMin;
		;

		// Almacenaremos una fila entera, añadimos tantas columnas como nuestra
		// variable a ordenar tenga.
		String[] aux = new String[2];

		for (int i = 0; i < sueldos.length-1; i++) {
			posMin = i;

			for (int j = i + 1; j < sueldos.length; j++) {
				if (Integer.parseInt(sueldos[j][1]) < Integer.parseInt(sueldos[posMin][1])) {
					posMin = j;
				}
			}

			aux = sueldos[posMin];
			sueldos[posMin] = sueldos[i];
			sueldos[i] = aux;

			// Printing the current state of the array after each iteration
			for (int j = 0; j < sueldos.length; j++) {
				System.out.println(sueldos[j][0] + "\t" + sueldos[j][1]);
			}
			System.out.println();
		}

	}

}
