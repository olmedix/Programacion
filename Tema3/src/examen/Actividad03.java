package examen;

public class Actividad03 {

	public static void main(String[] args) {

		String[][] usuarios = { { "Ribes", "Cecilio", "20" }, { "Alfonso", "María Paloma", "30" },
				{ "Losada", "Alejandra", "12" }, { "Clemente", "José Juan", "4" }, { "Prat", "Lucía", "26.5" }, };
		int posMin = 1;
		double saldo = 0;
		int clientePobre = 0;

		System.out.println("Relación de saldos:\n");

		System.out.printf("%-15s %-15s %-10s\n", "Apellido", "Nombre", "Saldo");
		System.out.printf("%-15s %-15s %-10s\n", "============", "==========", "=======");

		// Mostramos la tabla.
		for (int i = 0; i < usuarios.length; i++) {
			System.out.printf("%-15s %-15s %-10s\n", usuarios[i][0], usuarios[i][1], usuarios[i][2]);
		}

		// Buscamos el saldo más bajo.
		for (int i = 0; i < usuarios.length; i++) {

			if (Double.parseDouble(usuarios[i][2]) < Double.parseDouble(usuarios[posMin][2])) {
				posMin = i;
			}

			// Sumamos todos los saldos.
			saldo += Double.parseDouble(usuarios[i][2]);

			// Contamos los clientes con saldo inferior a 15€.
			if (Double.parseDouble(usuarios[i][2]) < 15) {
				clientePobre++;
			}
		}

		System.out.println("\nEl cliente con menor saldo es " + usuarios[posMin][1] + " " + usuarios[posMin][0]
				+ ", con " + usuarios[posMin][2] + " euros.");

		System.out.println("\nEl saldo promedio son " + saldo / usuarios.length + " euros.");

		
		if (clientePobre > 0) {
			System.out.println("\nHay " + clientePobre + " clientes que tienen menos de 15 euros en su saldo.");
		} else {
			System.out.println("\nTodos los clientes tienen, al menos, 15 euros en su saldo.");
		}
	}

}
