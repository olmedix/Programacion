package ejemplos;

public class Ejemplo12 {

	public static void main(String[] args) {
		// Actividad: Escribe una tabla con edades y altura de 
		// un grupo de personas
		//		Edad	Altura
		//		12		1,50
		
		
		// La tabla se llamará datos ( almenos 4 filas).
		// Múestrala en forma de tabla.
		
		double[][] datos= {
				{12,1.50},
				{15,1.75},
				{21,1.69},
				{32,1.90}};
		
		System.out.println("Edad\tAltura\n");
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print(datos[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}

}
