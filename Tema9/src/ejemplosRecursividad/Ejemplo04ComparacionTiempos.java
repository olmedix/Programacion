package ejemplosRecursividad;

public class Ejemplo04ComparacionTiempos {

	public static void main(String[] args) {

		int[] edades = new int[10000000];
		
		for (int i = 0; i < 10000000; i++) {
			edades[i]=i*10;
		}
		
		int x = 920;
		int pos = busquedaBinaria(x, edades);

		if (pos != 1)
			System.out.println("El número " + x + " se encuentra en la posición " + busquedaBinaria(x, edades));
		else
			System.out.println("El número " + x + " no se encuentra en el array.");

		pos = busquedaSecuencial(x, edades);

		if (pos != 1)
			System.out.println("El número " + x + " se encuentra en la posición " + busquedaBinaria(x, edades));
		else
			System.out.println("El número " + x + " no se encuentra en el array.");

	}



	private static int busquedaSecuencial(int x, int[] numeros) {
		
		// Instante en que empezamos a medir el tiempo. Esta función nos devuelve el tiempo
		// en milisegundos que ha pasado dsde el 1 de enero de 1970.
		long tiempoInicio =  System.currentTimeMillis();
		
		// Instante en el que termina el método.
		long tiempoFin = System.currentTimeMillis();

		for (int i = 0; i < numeros.length; i++) {

			if (x == numeros[i])
				return i;

		}

		return -1;
	}

	private static int busquedaBinaria(int x, int[] numeros) {

		int i = 0; // Extremo izquierdo de búsqueda
		int f = numeros.length - 1; // Extremo derecho de búsqueda
		int m; // Punto medio entre i y f
		
		// Instante en que empezamos a medir el tiempo. Esta función nos devuelve el tiempo
		// en milisegundos que ha pasado dsde el 1 de enero de 1970.
		long tiempoInicio =  System.currentTimeMillis();
		long tiempoFin;
				
		

		while (i <= f) {

			// Calculamos la posición en medio de i y f
			m = (i + f) / 2;

			// Comparamos el valor en m con el valor buscado.
			if (x == numeros[m]) {
				// Instante en el que termina el método.
				tiempoFin = System.currentTimeMillis();
				System.out.println("Tiempo de ejecución: " + (tiempoFin-tiempoInicio) + "ms");
				// Hemos encontrado el valor buscado.
				return m;
			} else if (x < numeros[m]) {
				f = m - 1;
			} else {
				i = m + 1;
			}

		}
		tiempoFin = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución: " + (tiempoFin-tiempoInicio) + "ms");
		return -1;
	}

}
