package ejemplos;

public class Ejemplo17 {

	public static void main(String[] args) {
		
		String[][] calificaciones= {
				{"José Luis Martínez","7"},
				{"Antonia Ruiz","9"},
				{"Marcos Ramírez","10"},
				{"Juana Herranz","4"},
				{"Alberto López","7"},
		};
		
		System.out.printf("%-18s %-2s \n","Nombre","Nota");
		System.out.printf("%-18s %-2s \n","==================","====");
		
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.printf("%-18s %-2s \n",calificaciones[i][0],calificaciones[i][1]);
		}
		
		
	}

}
