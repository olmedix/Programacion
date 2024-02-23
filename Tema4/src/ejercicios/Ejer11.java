package ejercicios;

public class Ejer11 {

	public static void main(String[] args) {
		// Crea un método que tome como parámetro un entero representando un año, y
		// devuelva true o
		// false indicando si es bisiesto o no.
		int anyo = 1700;

		System.out.println(bisiesto(anyo));
	}

	static boolean bisiesto(int anyo) {

		if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {
			return true;
		}

		return false;
	}

}
