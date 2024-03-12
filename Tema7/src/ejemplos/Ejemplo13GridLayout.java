package ejemplos;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo13GridLayout extends JFrame {

	public Ejemplo13GridLayout() {

		super("");
		setSize(600, 270);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 4, 10, 10));

		JButton btnStream = new JButton("Stream");
		JButton btnCámara = new JButton("Cámara");
		JButton btnSubirVolumen = new JButton("Subir volumen");
		JButton btnBajarVolumen = new JButton("Bajar volumen");
		JButton btnPublicidad = new JButton("Publicidad");
		JButton btnSilenciarMicro = new JButton("Silenciar micro");
		JButton btnEscena1 = new JButton("Escena 1");
		JButton btnEscena2 = new JButton("Escena 2");

		add(btnStream);
		add(btnCámara);
		add(btnSubirVolumen);
		add(btnBajarVolumen);
		add(btnPublicidad);
		add(btnSilenciarMicro);
		add(btnEscena1);
		add(btnEscena2);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo13GridLayout();

	}

}
