package hoja04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio4 extends JFrame implements ChangeListener {

	private JSlider sldRojo;
	private JSlider sldVerde;
	private JSlider sldAzul;
	private JButton btnColor;
	private JTextField textColor;

	public Ejercicio4() {

		super("Paleta");
		setSize(230, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JLabel lblRojo = new JLabel("Rojo");
		JLabel lblVerde = new JLabel("Verde");
		JLabel lblAzul = new JLabel("Azul");

		sldRojo = new JSlider(0, 250);
		sldRojo.setValue(250);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintLabels(true);
		sldRojo.setPaintTicks(true);
		sldRojo.addChangeListener(this);

		sldVerde = new JSlider(0, 250);
		sldVerde.setValue(200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintLabels(true);
		sldVerde.setPaintTicks(true);
		sldVerde.addChangeListener(this);

		sldAzul = new JSlider(0, 250);
		sldAzul.setValue(50);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintLabels(true);
		sldAzul.setPaintTicks(true);
		sldAzul.addChangeListener(this);

		btnColor = new JButton();
		btnColor.setPreferredSize(new Dimension(80, 30));

		textColor = new JTextField(10);

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColor);
		add(textColor);

		setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {

		int numRojo = sldRojo.getValue();
		int numVerde = sldVerde.getValue();
		int numAzul = sldAzul.getValue();

		btnColor.setBackground(new Color(numRojo, numVerde, numAzul));

		String rojo = Integer.toHexString(numRojo).toUpperCase();
		String verde = Integer.toHexString(numVerde).toUpperCase();
		String azul = Integer.toHexString(numAzul).toUpperCase();
		textColor.setText("#" + rojo + verde + azul);
	}

	public static void main(String[] args) {
		new Ejercicio4();

	}

}
