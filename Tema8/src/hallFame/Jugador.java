package hallFame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Jugador {

	private String nombreJugador, puntuacionJugador;
	public final String ARCHIVO = "ficheros/jugadores.txt";
	static DefaultListModel<String> jugadoresLista = new DefaultListModel<>();
	
	public Jugador() {
		
	}

	public Jugador(String nombreJugador, String puntuacionJugador) {
		this.nombreJugador = nombreJugador;
		this.puntuacionJugador = puntuacionJugador;
	}

	public String toString() {
		return nombreJugador + "... " + puntuacionJugador + " puntos.";
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public String getPuntuacionJugador() {
		return puntuacionJugador;
	}

	// Método llamado desde el listener.
	public void nuevoJugador() {

		Jugador jugador = leerDatosJugador();
		if (jugador != null) {
			guardarJugador(jugador);
			jugadoresLista.addElement(jugador.toString());
		}
	}

	// añade el jugador en formato CSV.
	public void guardarJugador(Jugador jugador) {

		try {
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(ARCHIVO, true));

			bufferEscritura.write(jugador.getNombreJugador() + "," + jugador.getPuntuacionJugador() + "\n");

			bufferEscritura.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error de E/S", "Error", JOptionPane.ERROR_MESSAGE);

		}

	}

	// Lee y detecta malos datos del jugador.
	public Jugador leerDatosJugador() {
		try {

			nombreJugador = JOptionPane.showInputDialog(null, "¿Nombre del jugador?");
			puntuacionJugador = JOptionPane.showInputDialog(null, "¿Puntuación del jugador?");
			
			if(nombreJugador == null || nombreJugador.trim().equals("")) {
				return null;
			}
			
			// Intenta convertir la puntuación a double
			double num = Double.parseDouble(puntuacionJugador);

			// Si la conversión tiene éxito, retorna un nuevo Jugador
			return new Jugador(nombreJugador, puntuacionJugador);

		} catch (NumberFormatException e) {
			// Si la conversión falla, retorna null
			return null;
		}
	}
	
	public void cargarJugadores() {
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(ARCHIVO));
			
			String linea = buffer.readLine();
			String[] datosJugador = new String[2]; 
			
			while(linea != null) {
				
				datosJugador = linea.split(",");
				
				jugadoresLista.addElement(datosJugador[0]+"... "+datosJugador[1]+" puntos.");
				
				linea= buffer.readLine();
			}
			
		} catch (FileNotFoundException e ) {
			JOptionPane.showMessageDialog(null, "No se han encontrado datos guardados de jugadores. Se creará un archivo nuevo.", ARCHIVO, 0);
		} catch (IOException e) {
			System.out.println("Error E/S:");
		}
	}
	
	
	public void borrarArchivo() {
		
		int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar todos los datos de jugadores?", "Advertencia", JOptionPane.OK_OPTION);
				
		if(opcion == 1) {
			JOptionPane.showMessageDialog(null, "Operación cancelada. No se ha borrado ningún dato.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}else {
			jugadoresLista.clear();
			try {
	            FileWriter fileWriter = new FileWriter(ARCHIVO);
	            // Escribir una cadena vacía en el archivo sobrescribirá su contenido
	            fileWriter.write("");
	            fileWriter.close();
	            System.out.println("Contenido del archivo borrado correctamente.");
	        } catch (IOException e) {
	            System.out.println("Error al borrar el contenido del archivo: " + e.getMessage());
	        }
		}
	}

}
