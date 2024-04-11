package ejemplos3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo17ActionClasesAnonimas extends JFrame {

	private JButton btnAzul;
	private JButton btnRojo;
	private JLabel lblMensaje;
	private JLabel lblPulsaciones;
	private int pulsaciones = 0;

	public Ejemplo17ActionClasesAnonimas() {

		super("Elegir botón");
		setSize(250, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		btnAzul = new JButton("Azul");
		btnAzul.setBackground(new Color(150, 150, 255));
		btnAzul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("Has pulsado el botón azul");
				actualizaPulsaciones();
			}
		});

		btnRojo = new JButton("Rojo");
		btnRojo.setBackground(Color.RED);
		btnRojo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("Has pulsado el botón rojo");
				actualizaPulsaciones();
			}

		});

		lblMensaje = new JLabel("Pulsa uno de los botones.");
		lblPulsaciones = new JLabel("");

		add(btnAzul);
		add(btnRojo);
		add(lblMensaje);
		add(lblPulsaciones);

		setVisible(true);

	}

	private void actualizaPulsaciones() {
		pulsaciones++;
		lblPulsaciones.setText("Has pulsado los botón " + pulsaciones + " veces.");
	}

	public static void main(String[] args) {

		new Ejemplo17ActionClasesAnonimas();

	}

}
