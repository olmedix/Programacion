package ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {
		// Declaramos una array de Strings.
		String[] nombres = { "Ramón", "Agustín", "Margarita", "Tatiana", "Ahmad", "Juan" };

		//Recorremos el array mediante un bucle.
		System.out.println("Nombres de la primera fila:");
		for(int i=0;i<nombres.length;i++) {
			
			System.out.print(nombres[i] + " ");
		}


	}

}
