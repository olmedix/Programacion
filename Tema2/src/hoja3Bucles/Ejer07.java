package hoja3Bucles;

public class Ejer07 {

	public static void main(String[] args) {

		int i = 2;

		while (i <= 200) {

			System.out.println(i);
			if (i % 20 == 0) {
				System.out.println("Divisible por 20!");
			}

			i += 2;
		}

	}

}
