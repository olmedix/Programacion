package Hoja2;

public class Ejer18 {

	public static void main(String[] args) {
		
		String[][] calificaciones= {
				{"José Luis Martínez","7"},
				{"Antonia Ruiz","9"},
				{"Marcos Ramírez","10"},
				{"Juana Herranz","4"},
				{"Alberto López","7"},
		};
		
		double notaMedia=0;
		int posMin=0;
		int posMax=0;
		
		System.out.println("Alumno\t\t\t\tNota");
		System.out.println("====================================");
		
		for (int i = 0; i < calificaciones.length; i++) {
			
			// Mostramos la tabla 
			System.out.println(calificaciones[i][0] +"\t\t\t"+ calificaciones[i][1]);
			
			// Sumamos el valor de todas las notas.
			notaMedia +=Double.parseDouble(calificaciones[i][1]);
		}
		
		System.out.println("\n\nNota media del curso: " + notaMedia/calificaciones.length + " sobre 10\n");

		
		for (int i = 0; i < calificaciones.length; i++) {
			
			// Buscamos el valor mínimo y lo guardamos en posMin su posición.
			// Después hacemos lo mismo pero con la más alta.
			if(Double.parseDouble(calificaciones[i][1]) < Double.parseDouble(calificaciones[posMin][1])) {
				posMin=i;
			}else if(Double.parseDouble(calificaciones[i][1]) > Double.parseDouble(calificaciones[posMax][1])) {
				posMax=i;
				
			}
		}
		
		System.out.println(calificaciones[posMin][0] + " tiene la nota más baja, un " 
						+ calificaciones[posMin][1] + "." );
		
		System.out.println(calificaciones[posMax][0] + " tiene la nota más alta, un " 
				+ calificaciones[posMax][1] + "." );

	}

}
