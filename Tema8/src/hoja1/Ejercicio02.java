package hoja1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter("ficheros/contactos.txt",true));

			for (int i = 0; i < 3; i++) {

				System.out.print("Nombre: ");
				String nombre = entrada.nextLine();

				System.out.print("Apellidos: ");
				String apellidos = entrada.nextLine();

				System.out.print("Teléfono: ");
				String telefono = entrada.nextLine();

				bufferEscritura.write(nombre + ", " + apellidos + ", " + telefono + "\n");

			}

			bufferEscritura.close();

		} catch (IOException e) {

			System.out.println("Error de entrada y salida.");
		}

	}

}
