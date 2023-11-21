package hoja2Bucles;

public class Ejer12 {

	public static void main(String[] args) {
		// Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino que
		// al final, simplemente se muestre la suma de todos ellos. Utiliza un bucle while.

		int num = 0;
		int total=0;

		while (num <= 1000) {
			
			total = num + total;
			num = num + 5;
			
		}
		System.out.println(total);
	}

}
