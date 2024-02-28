import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);

		Direccion dir1 = new Direccion("Son Ferrer", "Calle Cóndor", "9", "Planta baja");
		Direccion dir2 = new Direccion("Palma", "Calle Blanquerna", "35", "4ºA");

//		System.out.println(dir1.toString());
//		System.out.println("\n" + dir2.toString());

		Paquete paquete1 = new Paquete(101, "Juan Pérez", dir1);
		Paquete paquete2 = new Paquete(102, "María González", dir2);
		Paquete paquete3 = new Paquete(103, "Raul Martínez", dir1);
		Paquete paquete4 = new Paquete(104, "Ana López", dir1);

//		System.out.println("\n" + paquete1.toString());
//		System.out.println("\n" + paquete2.toString());

		Camion miCamion = new Camion(5);

		miCamion.addPaquete(paquete1);
		miCamion.addPaquete(paquete2);
		miCamion.addPaquete(paquete3);
		miCamion.addPaquete(paquete4);

		miCamion.showPaquetes();

		System.out.println("\nEl paquete con código 103 está en la posición: " + miCamion.searchPaquetes(103));
		System.out.println("El paquete con código 103 está en la posición: " + miCamion.searchPaquetes(31));

		System.out.println("\nBorramos el paquete  20... ");
		miCamion.delPaquete(20);
		miCamion.showPaquetes();
		
		System.out.println("¿De qué ciudad quieres ver los paquetes?");
		String ciudad = entrada.nextLine();
		
		miCamion.showPaquetes(ciudad);

	}

}
