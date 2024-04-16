package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo07TransformarArchivo {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO_ORIGINAL = "ficheros/nombres.txt";
		final String NOMBRE_ARCHIVO_TEMPORAL = "ficheros/nombres.tmp";

		try {
			// Abrir el archivo original para lectura.
			BufferedReader bufferLectura = new BufferedReader(new FileReader(NOMBRE_ARCHIVO_ORIGINAL));

			// Abrir el archivo temporal para escritura.
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO_TEMPORAL));

			// Bucle
			// - Leer la primera linea original.
			String linea = bufferLectura.readLine();

			while (linea != null) {

				// - Pasamos la linea a mayúsculas.
				linea = linea.toUpperCase();

				// - Escribimos la linea en el archivo temporal.
				bufferEscritura.write(linea+"\n");

				// Leemos la siguiente linea.
				linea = bufferLectura.readLine();

			}

			// Cerramos los buffers.
			bufferLectura.close();
			bufferEscritura.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha localizado el archivo: " + NOMBRE_ARCHIVO_ORIGINAL);
		} catch (IOException e) {
			System.out.println("Error de entrada y salida");
		}

		// Eliminamos el archivo original.

		// Cambiar el nombre al temporal por el nombre del original.

	}

}
