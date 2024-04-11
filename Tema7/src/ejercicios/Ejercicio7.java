package ejercicios;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejercicio7 extends JFrame {

	public Ejercicio7() {

		super("Suscripción");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblEmail = new JLabel("Email");
		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		JTextField txtNombre = new JTextField(25);
		JTextField txtEmail = new JTextField(25);
		JScrollPane scpMotivo = new JScrollPane(new JTextArea());
		scpMotivo.setPreferredSize(new Dimension(250, 100));

		JCheckBox ckbInformacion = new JCheckBox("Recibir información por correo");
		JButton btnEnviar = new JButton("Enviar");

		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(lblMotivo);
		add(scpMotivo);
		add(ckbInformacion);
		add(btnEnviar);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio7();

	}

}
