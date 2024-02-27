package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo02Button extends JFrame {

	public Ejemplo02Button() {

		super("Concurso");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblPregunta = new JLabel("¿Cómo se escribe 11 en hexadecimal?");
		JLabel lblAyuda = new JLabel("Elige la respuesta correcta.");

		JButton btnRespuestaA = new JButton("A");
		JButton btnRespuestaB = new JButton("B");
		JButton btnRespuestaC = new JButton("C");
		JButton btnRespuestaD = new JButton("D");
		JButton btnRespuestaE = new JButton("E");

		add(lblPregunta);

		add(btnRespuestaA);
		add(btnRespuestaB);
		add(btnRespuestaC);
		add(btnRespuestaD);
		add(btnRespuestaE);

		add(lblAyuda);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo02Button ventana = new Ejemplo02Button();
	}

}
