import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Clasificación del jugador (1/2/3): ");
		int clasificion = entrada.nextInt();

		switch (clasificion) {
		case 1:
			System.out.println("Medalla de oro.");
			break;
		case 2:
			System.out.println("Medalla de plata.");
			break;
		case 3:
			System.out.println("Medalla de bronce.");
			break;
		default:
			System.out.println("Lo siento, no tienes medalla");
		}

//		if (clasificion == 1) {
//			System.out.println("Medalla de oro");
//		} else if (clasificion == 2) {
//			System.out.println("Medalla de plata");
//		} else if (clasificion == 3) {
//			System.out.println("Medalla de bronze");
//		} else {
//			System.out.println("Lo siento, no tienes medalla");
//		}

	}

}
