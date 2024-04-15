package hoja1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {

	public static void main(String[] args) {

		try {
			BufferedReader bufferLectura = new BufferedReader(new FileReader("ficheros/nombres.txt"));

			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter("ficheros/nombres.copia.txt"));


			String linea = bufferLectura.readLine();

			while (linea != null) {

				bufferEscritura.write(linea + "\n");
				
				linea= bufferLectura.readLine();

			}
			bufferLectura.close();
			bufferEscritura.close();

		} catch (FileNotFoundException e) {

			System.out.println("Archivo no localizado.");
		} catch (IOException e) {

			System.out.println("Error entrada y salida.");
		}

	}

}
