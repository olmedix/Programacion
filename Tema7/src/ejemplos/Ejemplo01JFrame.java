package ejemplos;

import javax.swing.JFrame;

public class Ejemplo01JFrame extends JFrame {

	public Ejemplo01JFrame() {

		// Le pasa el título de la ventana
		super("Hola, Mundo!");

		// Damos tamaño a la ventana
		setSize(400, 300);

		// Para cerrar el programa al pulsar el botón. Sinó se quedaria en 2 plano
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Centra la ventana en medio de la pantalla
		setLocationRelativeTo(null);

		// Hace que la venta sea visible (INVISIBLE por defecto).
		setVisible(true);

	}
	
	public static void main(String[] args) {

		Ejemplo01JFrame ejemplo = new Ejemplo01JFrame();
	}

}
