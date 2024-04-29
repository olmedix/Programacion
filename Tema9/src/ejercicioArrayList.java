import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicioArrayList {

	public static void main(String[] args) {
		
		List<String> actores = new ArrayList<String>(Arrays.asList(
				"Lucy","Cooper Howard","Norm","Aufseher","Michael Emerson","Thaddeus","Betty Pearson",
				"Chet","Dane","Woody Thomas","Dale Dickey","Huey","Monty","Rose MacLean","Davey","Adam",
				"Mike Doyle","Aixa Kendrick","Rodrigo Luzzi","Snake Oil","Cassandra","Frederick")) ;

		//Agregar actpres en última posición y en la 3.
		actores.add("Lloyd");
		actores.add(3,"Maximus");
		
		//Eliminar actores.
		actores.remove("Dane");
		
		//Sustituimos un actor por otro.
		actores.set(0, "Tycho");
		
		//Buscamos un actor, devuelve true/false.
		boolean existe= actores.contains("Dane");
		
		if(existe) {
			System.out.println("Ha sido encontrado\n");
		}else {
			System.out.println("No aparece en el listado de actores.\n");
		}
		
		//Posición de un actor, -1 si no se encuentra.
		int posicion = actores.indexOf("Rodrigo Luzzi");
		
		if(posicion != -1) {
			System.out.println(actores.get(posicion)+ " se encuentra en la posición " + posicion + "\n");
		}else {
			System.out.println("No aparece en el listado de actores.\n");
		}
		
		// Posición buscando desde el final.
		
		posicion = actores.lastIndexOf("Tycho");
		
		if(posicion != -1) {
			System.out.println(actores.get(posicion) +" se encuentra en la posición " + posicion + "\n");
		}else {
			System.out.println("No aparece en el listado de actores.\n");
		}
		
		// Conocer el tamaño del ArrayList.
		System.out.println("El ArrayList tiene " + actores.size() + " posiciones ocupadas.\n");
		
		for (String actor : actores) {
			System.out.println("- "+actor);
		}
	}

}
