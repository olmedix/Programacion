package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo03JTextField extends JFrame {

	public Ejemplo03JTextField() {

		super("Datos personales");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblNombre = new JLabel("Nombre:");
		JTextField txtNombre = new JTextField(20);

		JLabel lblEdad = new JLabel("Edad:");
		JTextField txtEdad = new JTextField(20);

		JButton btnGuardar = new JButton("Guardar");

		add(lblNombre);
		add(txtNombre);
		add(lblEdad);
		add(txtEdad);

		add(btnGuardar);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo03JTextField ventana = new Ejemplo03JTextField();
	}
}
