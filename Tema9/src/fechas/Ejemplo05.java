package fechas;

import java.time.LocalTime;

public class Ejemplo05 {

	public static void main(String[] args) {
		
		// Array con la estructura:
		// Hora | paciente
		
		String[][] citas = {
				{"08:20","Álex Cáceres"},
				{"08:40","Agustín Riera"},
				{"08:50","Joel Álvaro"},
				{"08:10","Daniel Sims"},
				{"09:00","Juan López"}
		};
		
		// Buscar la primera cita de la mañana.
		int posMin=0;
		for (int i = 1; i < citas.length; i++) {
			
			if(LocalTime.parse(citas[i][0]).isBefore(LocalTime.parse(citas[posMin][0]))) {
				posMin=i;
			}
		}
		
		System.out.println("Primera cita de la mañana: " + citas[posMin][0] + "h.");
		
		// Ordenar el array por horas.
		
		for (int i = 0; i < citas.length-1; i++) {
			String[] aux;
			posMin=i;
			
			for (int j = i; j < citas.length; j++) {
				if(LocalTime.parse(citas[j][0]).isBefore(LocalTime.parse(citas[posMin][0]))) {
					posMin=j;
				}
			}
			
			aux =citas[i] ;
			citas[i] = citas[posMin];
			citas[posMin] = aux;
		}
		
		System.out.println("\nCitas de hoy ordenadas:");
		for (int i = 0; i < citas.length; i++) {
			System.out.println("- " + citas[i][0] + "h   Paciente: " + citas[i][1]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
