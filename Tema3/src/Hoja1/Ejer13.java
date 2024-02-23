package Hoja1;

public class Ejer13 {

	public static void main(String[] args) {

		int[] potencias = new int[20];

		for (int i = 0; i < potencias.length; i++) {

			potencias[i] = (int) Math.pow(2, i);

		}

		for (int i = 0; i < potencias.length; i++) {
			System.out.println(potencias[i]);
		}

	}

}
