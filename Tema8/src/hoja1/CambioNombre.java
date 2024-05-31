package hoja1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class CambioNombre {

	public static void main(String[] args) {

		String archivo = "ficheros/mascotas2.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));

			JFileChooser eleccion = new JFileChooser();

			int resultado = eleccion.showSaveDialog(null);

			if (resultado == eleccion.CANCEL_OPTION) {
				return;
			}
			File archivoSave = eleccion.getSelectedFile();

			BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSave, true));

			String linea = br.readLine();

			while (linea != null) {

				linea = linea.toUpperCase();
				System.out.println(linea);
				bw.write("\n" + linea + "\n");

				linea = br.readLine();
			}

			br.close();
			bw.close();
		} catch (FileNotFoundException e) {

			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Error entrada y salida.");
		}

		File nombreAntiguo = new File("ficheros/mascotas2.txt");

		nombreAntiguo.renameTo(new File("ficheros/nombreNuevo.txt"));

	}

}
