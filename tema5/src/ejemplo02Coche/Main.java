package ejemplo02Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche();
		Coche coche2 = new Coche();

		coche1.matricula = "2718HWP";
		coche1.marca = "Seat";
		coche1.modelo = "Córdoba";
		coche1.quilometros = 150_000;
		coche1.averia = "Cambiar las 4 ruedas.";

		coche2.leerDatos();

		coche2.mostrar();

	}

}
