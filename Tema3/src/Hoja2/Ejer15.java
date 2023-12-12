package Hoja2;

public class Ejer15 {

	public static void main(String[] args) {
		// Añade al programa anterior otro bucle que recorra el array y encuentre el
		// menor y el mayor
		// precio

		String[][] precios = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" }, };
		float precioTotal = 0;
		int posMin = 0;
		int posMax = 0;

		System.out.println("Producto\tPrecio");
		System.out.println("===========================");
		for (int i = 0; i < precios.length; i++) {

			System.out.println(precios[i][0] + "\t" + Float.parseFloat(precios[i][1]));

			precioTotal += Float.parseFloat(precios[i][1]);
		}
		System.out.println("\nTotal: " + precioTotal + " €");

		// Buscamos el valor mínimo y máximo de la columa 1 de precios.
		for (int i = 0; i < 4; i++) {

			if (Float.parseFloat(precios[i][1]) < Float.parseFloat(precios[posMin][1])) {
				posMin = i;
			} else if (Float.parseFloat(precios[i][1]) > Float.parseFloat(precios[posMax][1])) {
				posMax = i;
			}

		}
		System.out.println("\nPrecio menor: " + Float.parseFloat(precios[posMin][1]) + " €");
		System.out.println("Precio mayor: " + Float.parseFloat(precios[posMax][1]) + " €");
	}

}
