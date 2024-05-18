package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Mapa que relacione DNI (clave) y persona (valor).
		Map<String, String> personas = new HashMap<>();

		personas.put("98745668D", "Lucas");
		personas.put("65478912T", "Manuel");
		personas.put("68436975R", "Carlos");
		personas.put("97685197J", "Ramón");

		// Preguntamos al usuario un DNI y le decimos el nombre de la persona.
		System.out.print("Introduce un DNI: ");
		String dni = entrada.nextLine();

		if (personas.containsKey(dni))
			System.out.println("La persona con DNI " + dni + " se llama: " + personas.get(dni));
		else
			System.out.println("DNI no encontrado.");

		// Eliminamos a la persona cuyo DNI hemos leido.
		personas.remove(dni);

		// Ver en forma de tabla la información del mapa.

		for (String element : personas.keySet()) {
			System.out.println(element + "\t" + personas.get(element));

		}
		
		// Lista de nombres en mapa.
		for (String element : personas.values()) {
			System.out.println("- " + element);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
