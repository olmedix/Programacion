package Hoja1;

public class Ejer05 {

	public static void main(String[] args) {
		// Crea un array llamado notas con cinco posiciones y ve asignando a cada
		// una de ellas el valor de un examen que hayas hecho este curso 
		// (no sólo de programación). Haz que después se muestren
		// todos los valores mediante un bucle while.
		float[] notas = {9,9.2f,10,8.5f,7.4f};
		int i =0;
		while(i<notas.length) {
			
			System.out.println("Nota: " + notas[i]);
			
			i++;
		}

	}

}
