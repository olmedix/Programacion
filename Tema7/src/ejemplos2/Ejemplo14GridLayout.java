package ejemplos2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo14GridLayout extends JFrame {

	public Ejemplo14GridLayout() {

		super("Biblioteca");
		setSize(400, 170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 2, 0, 15));

		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField();
		txtTitulo.setPreferredSize(new Dimension(180, 30));

		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField();
		txtAutor.setPreferredSize(new Dimension(180, 30));

		panelIzquierda.add(lblTitulo);
		panelIzquierda.add(txtTitulo);
		panelIzquierda.add(lblAutor);
		panelIzquierda.add(txtAutor);

		JButton btnAlta = new JButton("Alta");

		add(panelIzquierda);
		add(btnAlta);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo14GridLayout();

	}

}
