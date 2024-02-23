package ejemplo04PolimorfismoVehiculo;

public class Main {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo("2718HWP", 5, 1027.5, "Ford", "Focus", 115);

		Coche coche1 = new Coche("9121TEL", 5, 1200, "Volswagen", "Golf", 120, 5);

		Moto moto1 = new Moto("7895MHL", 2, 131, "Kymco", "Agility S", 11, false);

		// Guardamos en vehículo2 un objeto Coche, ya que cualquier coche es un
		// vehículo.
		Vehiculo vehiculo2 = coche1;

		// Guardamos en coche 2 un objeto Coche que está dentro de una variable
		// Vehículo.
		Coche coche2 = (Coche) vehiculo2;
		

	}

}
