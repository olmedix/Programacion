package Hoja1;

public class Ejer12 {

	public static void main(String[] args) {
		// Escribe una aplicación que cree un array de 100 posiciones llamado matriculas
		// y rellene todas
		// las posiciones con el valor por defecto "sinmatricula". Haz que después se
		// muestren todos los
		// valores mediante un bucle for.

		String[] matriculas = new String[100];

		for (int i = 0; i < matriculas.length; i++) {

			matriculas[i] = "sinMatricula";

		}

		for (int i = 0; i < matriculas.length; i++) {
			System.out.println(matriculas[i]);
		}

	}

}
