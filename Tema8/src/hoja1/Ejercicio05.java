package hoja1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio05 {
	

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numPalabras = 0;
		int posicion = 0;

		System.out.print("Escribe el nombre del archivo: ");
		String nombreArchivo = entrada.nextLine();

		System.out.print("Escribe una palabra: ");
		String palabra = entrada.nextLine();

		try {
			FileReader archivo = new FileReader("ficheros/" + nombreArchivo);

			BufferedReader bufferLectura = new BufferedReader(archivo);

			String linea = bufferLectura.readLine();

			while (linea != null) {

				posicion = linea.indexOf(palabra);

				while (posicion != -1) {

					numPalabras++;

					posicion = linea.indexOf(palabra, posicion + 1);

				}

				linea = bufferLectura.readLine();

			}

			bufferLectura.close();

		} catch (FileNotFoundException e) {

			System.out.println("Archivo no localizado.");
		} catch (IOException e) {

			System.out.println("Error entrada y salida.");
		}

		System.out.println(palabra + " aparece " + numPalabras + " veces.");
		
	}
}
