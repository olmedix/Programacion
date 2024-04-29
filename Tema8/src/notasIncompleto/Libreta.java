package notasIncompleto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Libreta {

	private final String NOMBRE_ARCHIVO = "ficheros/notas.txt";
	private final int MAX_NOTAS = 3;

	private Nota[] notas;
	private int numNotas;

	public Libreta() {
		notas = new Nota[MAX_NOTAS];
		numNotas = 0;
		leerNotas();
	}
	

	public void addNota(Nota nota) {

		/*
		 *  Añadir después de la última nota del array la nota que se nos pasa como
		 * parámetro. Utilizar el valor de la variable numNotas. Actualizar después el
		 * valor de numNotas. En caso de que hayamos llegado al máximo de notas, no
		 * hacer nada.
		 */
		if(numNotas < MAX_NOTAS) {
			notas[numNotas] = nota;
			numNotas++;
		}
		

	}

	public void setNota(int posicion, Nota nota) {

		notas[posicion] = nota;

	}
	
	public int getMAX_NOTA() {

		return MAX_NOTAS;

	}

	public Nota getNota(int posicion) {

		return notas[posicion];

	}

	public void delNota(int posicion) {

		/*
		 *  Eliminar el elemento del array notas[] que ocupa la posición indicada.
		 * Para ello, mueve hacia arriba todos los elementos que vengan a continuación
		 * una posición, y actualiza la variable numNotas.
		 */

		for (int i = posicion; i < numNotas - 1; i++) {

			notas[posicion] = notas[posicion + 1];

		}
		numNotas--;

	}

	public void leerNotas() {

		/*
		 *  Leer todas las filas del archivo, y rellenar el array notas[]. Si no se
		 * encuentra el archivo, hacer que se muestre el mensaje indicado en el
		 * enunciado de la práctica. Si se produce otro tipo de excepción, mostrar un
		 * JOptionPane explicándolo.
		 * 
		 * La información de cada nota está guardada en dos líneas de texto, una para el
		 * título y otra para la descripción. Puedes usar el método split() para separar
		 * los datos de los comentarios del archivo.
		 */

		try {
			BufferedReader bufferLectura = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			String linea = bufferLectura.readLine();
			String titulo = "", descripcion = "";

			while (linea != null) {

				String[] lineaResultado = linea.split("=");

				if (linea.indexOf("TITULO=") != -1) {
					titulo = lineaResultado[1];

				}

				if (linea.indexOf("DESCRIPCION=") != -1) {
					descripcion = lineaResultado[1];

					// Al comprobar el 2º dato , agregamos la nota .
					Nota nota = new Nota(titulo, descripcion);
					addNota(nota);
					
				}

				linea = bufferLectura.readLine();

			}
			bufferLectura.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"No se ha podido encontrar un archivo válido de tareas.\n"
							+ " Se creará uno nuevo automáticamente.",
					"Archivo de tareas no encontrado", JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo de tareas.", "Error de E/S",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public void guardarNotas() {

		/*
		 *  Guardar las notas del array notas[] en el archivo "notas.txt". El
		 * formato en que se guardarán debe ser el que aparece en el enunciado de la
		 * práctica. Si se produce una excepción, se mostrará el error que aparece en el
		 * enunciado.
		 */

		try {
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));

			for (int i = 0; i < numNotas; i++) {

				bufferEscritura.write("TITULO=" + notas[i].getTitulo() + "\n");
				bufferEscritura.write("DESCRIPCION=" + notas[i].getDescripcion() + "\n");

			}

			bufferEscritura.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo de tareas.", "Error de E/S",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public int getNumNotas() {
		return numNotas;
	}

}
