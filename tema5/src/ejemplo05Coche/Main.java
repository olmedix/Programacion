package ejemplo05Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("2718HWP", "Seat", "Córdoba", "Cambiar las 4 ruedas", 150_000);
		Coche coche2 = new Coche("4578JRE", "BMW", "Serie 1");

		//coche1.leerDatos();

		coche1.mostrar();
		
		//coche2.leerDatos();

		coche2.mostrar();

	}

}
