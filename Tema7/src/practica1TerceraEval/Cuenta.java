package practica1TerceraEval;

import javax.swing.JOptionPane;

public class Cuenta {

	public String ENCABEZADO_CUENTA;
	private String[][] articulos;
	private int numArticulos;
	private double precioTotal; // Genero esta variable global para poder utilizar su valor en 2 métodos.

	// Constructor, inicializamos las variables.
	public Cuenta(int maxArticulos) {
		ENCABEZADO_CUENTA = "CAFETERÍA SON FERRER\n" + "C/ Cóndor , 9\n" + "Son Ferrer, Calvià\n"
				+ "------------------------------------\n";
		articulos = new String[maxArticulos][3];
		numArticulos = 0;
		precioTotal=0;
	}

	// Añade un artículo(nombre,precio y unidades) si hay espacio en la cuenta.
	public void addArticulo(String nombre, String precio, String unidades) {

		if (hayEspacio()) {
			articulos[numArticulos] = new String[] { nombre,unidades,precio };

			numArticulos++;
		}
	}

	// Devuelve true si hay espacio en el array, sinó devolverá false.
	public boolean hayEspacio() {

		if (articulos.length > numArticulos) {
			return true;
		}
		return false;
	}

	// Devuelve el encabezado y la lista de artículos de la cuenta.
	public String listadoArticulos() {
		
		String descripcion = String.format("%-25s %4s %8s %8s\n", "\nDESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL(€)");
		String separador = String.format("%-25s %4s %8s %8s\n", "-------------------------", "----",
				"--------", "--------");
		String listaCompleta = "";
		
		//Confirmamos que se resetea el valor de total.
		precioTotal=0;
		
		try {
			// recorremos el array hasta el número de artículos introducido.
			for (int i = 0; i < numArticulos; i++) {
				
				double precioPorUnidad = Double.parseDouble(articulos[i][1]) * Double.parseDouble(articulos[i][2]);
				
				String filasLista = String.format("%-25s %4s %8s %8s\n", articulos[i][0], articulos[i][1],
						articulos[i][2], precioPorUnidad);

				// En cada pasada del bucle añade una fila más al listado.
				listaCompleta += filasLista;
				
				// Sumamos el precio total de los artículos que se van añadiendo.
				precioTotal += precioPorUnidad;
			}

		} catch (NumberFormatException e) {
			//Sí el usuario introduce algo que no sea un número aparecerá este mensaje.
			JOptionPane.showMessageDialog(null, "Debes introducir un número, presiona el botón \"Nueva Cuenta\"\npara volver a empezar.","Caja registradora",JOptionPane.ERROR_MESSAGE);

		}

		return descripcion + separador + listaCompleta;
	}

	// Cálculo de los precios.
	public String totales() {
		
		float IVA =0.1f;
		
		String pago = "\nA PAGAR\n------------------------------\n";
		String totalSinIva = "  * Total: " + redondear(precioTotal) + " €\n";
		String precioIva = "  * Total: " + redondear(precioTotal * IVA) + " €\n";
		String pagoFinal = "  * A pagar: " + redondear(precioTotal + (precioTotal * 0.1)) + " €";

		return pago + totalSinIva + precioIva + pagoFinal;
	}

	// Pone a 0 las variables de numArticulos y el dinero que se ha ido sumando de
	// cada artículo
	// añadido a la anterior cuenta.
	public void resetear() {
		numArticulos = 0;
		precioTotal=0;
	}

	// Redondea los precios en dos decimales.
	private double redondear(double numero) {
		return Math.round(numero * 100) / 100.0;
	}

}
