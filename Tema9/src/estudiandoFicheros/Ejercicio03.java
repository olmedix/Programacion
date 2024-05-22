package estudiandoFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		final String FICHERO = "ficheros2/contactos.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(FICHERO));
			
			String linea = br.readLine();
			
			while(linea != null) {
				
				String[]persona = linea.split(",");
				
				System.out.println("Apellidos: " + persona[0]);
				System.out.println("Nombre: " + persona[1]);
				System.out.println("Teléfono: " + persona[2]);
				System.out.println("-----");
				
				linea = br.readLine();
				
			}
			
			
			br.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error de entrada y salida.");
		}
		
		
	}

}
