package hoja03;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejercicio2 extends JFrame {

	public Ejercicio2() {

		super("Selección de modelo");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		String[] modelos = new String[] { "Peugeot", "Volswagen", "Renault", "Seat", "Ferrari", "Porsche", "Jaguar",
				"Dacia", "Kia" };

		JList<String> lstModelo = new JList<String>(modelos);
		JScrollPane scpModelo = new JScrollPane(lstModelo);
		scpModelo.setPreferredSize(new Dimension(100, 150));
		JLabel lblModelo = new JLabel("Modelo?");

		add(scpModelo);
		add(lblModelo);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio2();

	}

}
