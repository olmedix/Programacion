package ejemplos3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo15ActionEvent extends JFrame {

	public Ejemplo15ActionEvent() {

		super("Eventos");
		setSize(250, 130);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JButton btnPulsar = new JButton("Púlsame");
		btnPulsar.addActionListener(new Ejemplo15ActionListener());
		JLabel lblMensaje = new JLabel("Aún no has pulsado el botón!");

		add(btnPulsar);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo15ActionEvent();

	}

}
