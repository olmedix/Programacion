package estudiandoFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros2/contactos.txt",true));

			for (int i = 0; i < 3; i++) {

				System.out.print("Nombre: ");
				String nombre = entrada.nextLine();

				System.out.print("Apellidos: ");
				String apellido = entrada.nextLine();

				System.out.print("teléfono: ");
				String telf = entrada.nextLine();

				bw.write(apellido + "," + nombre + "," + telf + "\n");

			}

			bw.close();

		} catch (IOException e) {

			System.out.println("El archivo no se ha podido encontrar o crear.");
		}

	}

}
