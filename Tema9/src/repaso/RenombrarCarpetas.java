package repaso;

import java.io.File;
import java.util.Scanner;

public class RenombrarCarpetas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Preguntar al usuario que nombre quiere dar a la carpeta y al archivo, cambiarle el nombre, usando File.renameTo¨().
		
		System.out.println("¿Que nombre quieres ponerle a la carpeta?");
		String nombreCarpeta = entrada.nextLine();
		
		System.out.println("¿Que nombre quieres ponerle al archivo");
		String nombreArchivo = entrada.nextLine();
		
		File carpetaOriginal = new File("ficheros/CarpetaOriginal");
		File carpetaNueva = new File("ficheros/" + nombreCarpeta);
		carpetaOriginal.renameTo(carpetaNueva);
		
		File archivoOriginal = new File("ficheros/archivoOriginal");
		File archivoNuevo = new File("ficheros/" + nombreArchivo);
		archivoOriginal.renameTo(archivoNuevo);

		
		
		
	}

}
