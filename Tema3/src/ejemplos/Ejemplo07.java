package ejemplos;

public class Ejemplo07 {

	public static void main(String[] args){
		// Ejemplo de busqueda de mínimo y máximo en un array

		// Array cuyo mínimo queremos averiguar
		int[] edades = { 17, 16, 20, 18, 14, 22 };

		// Suponemos que el mínimo está en la posición 0.
		int posMin = 0;

		// Recorremos el array y vamos comparando cada posición
		// con la que apunta posMin.
		for (int i = 1; i < edades.length; i++) {
			System.out.println("Comprobando posición " + i);
			// Si encontramos una posición i donde haya un número menor
			// que en posMin, esa será la nueva posMin.
			if (edades[i] < edades[posMin]) {

				System.out.println("Cambiando posMin a " + i);
				posMin = i;

			}

			
		}

		// Mostramos el resultado
		System.out
				.println("El valor más pequeño del array es " + edades[posMin] + "\n y está en la posición " + posMin);

	}

}
