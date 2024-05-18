package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo05 {

	public static void main(String[] args) {
		
		
		Map<Mascota,Propietario> mascotas = new HashMap<>();
		
		Mascota mascota1 = new Mascota(1, "Firulais", "Perro");
		Mascota mascota2 = new Mascota(2, "Piolín", "Pájaro");
		Mascota mascota3 = new Mascota(3, "Canela", "Hámster");
		
		Propietario propietario1 = new Propietario("78654957E", "Juan", "Ortíz");
		Propietario propietario2 = new Propietario("78234957T", "Luca", "Vacchio");
		Propietario propietario3 = new Propietario("78654234P", "Mario", "De la fuente");
		
		mascotas.put(mascota1, propietario1);
		mascotas.put(mascota2, propietario2);
		mascotas.put(mascota3, propietario3);
		
		System.out.println("El propietario de " + mascota1.getNombre() + " es " + mascotas.get(mascota1).getNombre());

		System.out.println("\nListado de los datos de los dueños de cada mascota:");
		
		for(Mascota mascota: mascotas.keySet()) {
			System.out.println(mascota.getNombre() + ":");
			System.out.println(mascotas.get(mascota).getNombre()+"\n");
			
		}
		
	}

}
