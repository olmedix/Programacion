package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo01 {

	public static void main(String[] args) {
	
		// Clave String, Vale String
		Map<String,String> coches = new HashMap<>();
		
		// Añadimos unos coches al mapa.
		coches.put("1000 HWP","Peugeot 308 5P");
		coches.put("2000EBA", "Mercedes CL 200A");
		coches.put("3000APP", "Renault Megane");
		
		// Accedemos a la información (valor) de un coche a partir de su matrícula.
		System.out.println(coches.get("1000 HWP"));
		
		// Mostramos el contenido del mapa.
		System.out.println(coches.toString());
		
		// Reemplazamos la información de la matrícula 1000 HWP
		coches.put("1000 HWP", "Peugeot 307 5P");
		System.out.println(coches.toString());
		
		// Borramos una entrada del mapa
		coches.remove("1000 HWP");
		System.out.println(coches.toString());
		
		// Comprobamos si una matrícula está o no.
		System.out.println("¿Existe la matrícula 2000EBA en el mapa? " + coches.containsKey("2000EBA"));
		
		// Comprobamos si los datos de un coche (valor) están en el mapa.
		System.out.println("¿Existe el coche Renault Megane en el mapa? " + coches.containsValue("Renault Megane"));
		
		// Reemplazamos un valor.
		coches.replace("2000EBA", "Mercedes CL300");
		System.out.println(coches.toString());
		
		// Añadimos una entrada siempre que no existe la clave.
		coches.putIfAbsent("1500FFF", "Ford Fiesta");
		System.out.println(coches.toString());
		
		// Recorremos un mapa.
		System.out.println("\nMapa:");
		for(String matricula: coches.keySet()) {
			
			System.out.println(matricula + "\t" + coches.get(matricula) );
			
		}
		
		// Mostramos las descripciones
		System.out.println("\nDescripciones de los coches en el mapa:");
		for(String descripcion: coches.values()) {
			System.out.println(descripcion);
		}
		
		// Mostramos el tamaño del mapa.
		System.out.println("\nTamaño del mapa: " + coches.size());
		
		// Vemos si el mapa está vacio.
		System.out.println("¿Está vacio el mapa? " + coches.isEmpty());
		
		// Borramos todo el contenido del mapa.
		coches.clear();
		System.out.println("¿Está vacio el mapa? " + coches.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
