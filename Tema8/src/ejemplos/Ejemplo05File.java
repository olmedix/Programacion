package ejemplos;

import java.io.File;

public class Ejemplo05File {

	public static void main(String[] args) {
		
		// Crear carpetas.
		
		File carpeta = new File("trabajos");
		
		boolean resultado = carpeta.mkdir();
		
		if(resultado) {
			System.out.println("Carpeta creada.");
		}else {
			System.out.println("No se ha podido crear la carpeta.");
		}

		
		// Crear una serie de carpetas, se añade una s en el metodo mkdir().
		
		File carpeta2 = new File("apuntes/prog/tema8");
		resultado = carpeta2.mkdir();
		
		if(resultado) {
			System.out.println("Carpeta creada.");
		}else {
			System.out.println("No se ha podido crear la carpeta.");
		}
		
		
		// Borrar una carpeta.
		
		resultado = carpeta2.delete();
		
		if(resultado) {
			System.out.println("Carpeta borrada.");
		}else {
			System.out.println("No se ha podido borrar la carpeta.");
		}
		
		// Borrar una archivo (igual que borrar una carpeta).
		
				File archivo = new File("ficheros/contactos.txt");
				
				resultado = archivo.delete();
				
				if(resultado) {
					System.out.println("Archivo borrado.");
				}else {
					System.out.println("No se ha podido borrar el archivo.");
				}
		
	}

}
