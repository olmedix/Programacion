package ejemplo10Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("2718HWP", "Seat", "Córdoba", "Cambiar las 4 ruedas", 150_000);
		Coche coche2 = new Coche("4578JRE", "BMW", "Serie 1");

		//coche1.leerDatos();

		coche1.mostrar();
		
		//coche2.leerDatos();

		coche2.mostrar();
		
		coche2.setAveria("No gira el volante");
		coche2.setQuilometros(535_500);

		coche2.mostrar();
		
		// Hemos puesto en el setter una restricción de forma que sólo se guarde un valor positivo
		coche2.setQuilometros(-600_000);
		
		// Vemos que coche2 sigue con 535_500 quilometros.
		coche2.mostrar();
	}

}
