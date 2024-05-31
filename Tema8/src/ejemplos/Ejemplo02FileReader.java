package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo02FileReader {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = "ficheros/mascotas.txt";

		try {

			BufferedReader buffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			int numPerros = 0;

			String linea = buffer.readLine();

			while (linea != null) {
				if (linea.equals("Perro")) {
					numPerros++;
				}
				System.out.println(linea);
				linea = buffer.readLine();

			}

			System.out.println("En mi lista hay " + numPerros + " perritos");

			buffer.close();

		} catch (FileNotFoundException e) {

			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Error entrada y salida");
		}

	}

}
