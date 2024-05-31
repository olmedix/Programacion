package hoja1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04 {

	static String titulo, encabezado, contenido;

	private static void solicitarDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Título de la página: ");
		titulo = entrada.nextLine();

		System.out.print("Encabezado de la página: ");
		encabezado = entrada.nextLine();

		System.out.print("Contenido de la página: ");
		contenido = entrada.nextLine();
	}

	public static void main(String[] args) {

		solicitarDatos();

		try {

			final FileWriter archivo = new FileWriter("ficheros/index.html", true);

			BufferedWriter bufferEscritura = new BufferedWriter(archivo);
			
			
			bufferEscritura.write(
					"<!DOCTYPE html>\r\n" + "<html lang=\"es\">\r\n" + "<head>\r\n" + "    <meta charset=\"UTF-8\">\r\n"
							+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");

			bufferEscritura.write("<title>" + titulo + "</title>\n");
			bufferEscritura.write("</head>\n<body>\n");

			bufferEscritura.write("<h1>" + encabezado + "</h1>");
			bufferEscritura.write("<p>" + contenido + "</p>");

			bufferEscritura.write("</body>\r\n</html>");
			
			bufferEscritura.close();

		} catch (IOException e) {

			System.out.println("Archivo no encontrado.");
		}
		
		System.out.println("Se ha creado la página en tu carpeta personal, De nada.");

	}

}
