package ejemplo02Vehiculo;

public class Main {

	public static void main(String[] args) {

		//Vehiculo vehiculo1 = new Vehiculo("2718HWP", 5, 1027.5, "Ford", "Focus", 115);

		Coche coche1 = new Coche("9121TEL", 5, 1200, "Volswagen", "Golf", 120, 5);

		Moto moto1 = new Moto("7895MHL", 2, 131, "Kymco", "Agility S", 11, false);

		System.out.println("\n" + coche1.toString());

		System.out.println("\n" + moto1.toString());

	}

}
