package Hoja2;

public class Ejer14 {

	public static void main(String[] args) {

		String[][] precios = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" }, };
		float precioTotal = 0;

		System.out.println("Producto\tPrecio");
		System.out.println("===========================");
		for (int i = 0; i < precios.length; i++) {

			System.out.println(precios[i][0] + "\t" + Float.parseFloat(precios[i][1]));

			precioTotal += Float.parseFloat(precios[i][1]);
		}
			System.out.println("\nTotal: "+ precioTotal + " €");
	}

}
