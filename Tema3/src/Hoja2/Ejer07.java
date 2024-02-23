package Hoja2;

public class Ejer07 {

	public static void main(String[] args) {

		String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		int[] espectadores = { 2_000_000, 2_500_000, 3_100_000, 3_000_000, 1_200_000, 1_800_000, 2_050_000 };
		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < espectadores.length; i++) {

			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			} else if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}

		}

		System.out.println("El " + dias[posMin] + " fue el día con menor día de audiencia con " + espectadores[posMin]);
		System.out.println("El " + dias[posMax] + " fue el día con mayor día de audiencia con " + espectadores[posMax]);
	}

}
