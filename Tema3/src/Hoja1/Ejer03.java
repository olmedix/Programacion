package Hoja1;

public class Ejer03 {

	public static void main(String[] args) {
		// Crea un array llamado densidades con las densidades (en g/cm3)
		// de los nueve (sí, nueve) planetas del Sistema Solar.
		// Haz que después se muestren todos los valores mediante un bucle for.

		double[] densidades = { 5.43, 5.24, 5.52, 3.93, 1.33, 0.69, 1.27, 1.64, 1.88 };

		for (int i = 0; i < densidades.length; i++) {
			System.out.println((i + 1) + " : " + densidades[i]);
		}

	}

}
