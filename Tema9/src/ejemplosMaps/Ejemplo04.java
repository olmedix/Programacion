package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo04 {

	public static void main(String[] args) {

		// Creamos un mapa que asocio a cada cliente una ficha con información.
		Map<Cliente, Ficha> registros = new HashMap<>();

		// Hemos añadido unos métodos equals() y hashCode() a la clase Cliente para
		// poder usarla como clave.

		// Creamos algunos clientes y fichas para añadir al mapa.
		
		
		Cliente cliente1 = new Cliente("López", "Fernando", "45678912T");
		Cliente cliente2 = new Cliente("Martínez", "Nuria", "45632442T");
		Cliente cliente3 = new Cliente("González", "Francisco", "42278912T");

		Ficha ficha1 = new Ficha(2000, "España", "1200-1200-1000-1000");
		Ficha ficha2 = new Ficha(1990, "Italia", "0000-1111-3333-4444");
		Ficha ficha3 = new Ficha(2005, "España", "3000-1000-2000-5000");

		// Añadimos los clientes y fichas al mapa.

		registros.put(cliente3, ficha3);
		registros.put(cliente2, ficha2);
		registros.put(cliente1, ficha1);
		
		// Accedemos algún dato.
		System.out.println(registros.get(cliente2).toString());
		System.out.println("\n"+registros.get(cliente1).toString());
		
		// Recorremos el mapa completo.
		System.out.println("\nListado de clientes:");
		for(Cliente cliente: registros.keySet()) {
			System.out.println(cliente.getNombre()+" ->" + registros.get(cliente).getNacionailidad());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
