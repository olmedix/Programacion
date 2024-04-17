package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo07TransformarArchivo {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO_ORIGINAL = "ficheros/nombres.txt";
		final String NOMBRE_ARCHIVO_TEMPORAL = "ficheros/nombres.tmp";
		
		System.out.println("Copiando el archivo...");

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
				bufferEscritura.write(linea + "\n");

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
		System.out.println("Eliminando archivos temporales...");
		
		File archivoOriginal = new File(NOMBRE_ARCHIVO_ORIGINAL);
		boolean resultado = archivoOriginal.delete();

		if (resultado) {
			System.out.println("El archivo ha sido borrado correctamente.");
		} else {
			System.out.println("No se ha podido borrar...");
		}

		// Cambiar el nombre al temporal por el nombre del original.
		File archivoTemportal = new File(NOMBRE_ARCHIVO_TEMPORAL);

		resultado = archivoTemportal.renameTo(archivoOriginal);

		if (resultado) {
			System.out.println("Nombre del archivo se ha cambiado.");
		} else {
			System.out.println("No ha sido posible cambiar el nombre del archivo.");
		}
		
		System.out.println("Ok.");

	}

}
