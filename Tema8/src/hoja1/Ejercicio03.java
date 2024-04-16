package hoja1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {

	public static void main(String[] args) {

		try {
			BufferedReader bufferLectura = new BufferedReader(new FileReader("ficheros/contactos.txt"));

			String linea = bufferLectura.readLine();
			String[] contacto;

			while (linea != null) {

				contacto = linea.split(",");

				System.out.println("Apellidos: " + contacto[1]);
				System.out.println("Nombre: " + contacto[0]);
				System.out.println("Apellidos: " + contacto[2]);

				System.out.println("-----\n");

				linea = bufferLectura.readLine();
			}

			bufferLectura.close();

		} catch (FileNotFoundException e) {

			System.out.println("No se ha podido encontrar el archivo.");
		} catch (IOException e) {

			System.out.println("Error de entrada y salida.");
		}

	}

}
