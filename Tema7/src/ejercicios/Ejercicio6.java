package ejercicios;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio6 extends JFrame {

	public Ejercicio6() {

		super("Comentarios");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel lblComentario = new JLabel("Deja un comentario");

		JTextArea txtMotivo = new JTextArea();
		txtMotivo.setLineWrap(true);
		txtMotivo.setWrapStyleWord(true);
		JScrollPane scpComentairo = new JScrollPane(txtMotivo);
		scpComentairo.setPreferredSize(new Dimension(300, 300));

		JButton btnEnviar = new JButton("Enviar");

		add(lblComentario);
		add(scpComentairo);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio6();

	}

}
