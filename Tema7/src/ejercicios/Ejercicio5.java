package ejercicios;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejercicio5 extends JFrame {

	public Ejercicio5() {

		super("Termostato");
		setSize(300, 350);
		setLayout(new FlowLayout());

		JLabel lblTemperatura = new JLabel("Temperatura(ºC)");
		JSlider sldTemperatura = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		sldTemperatura.setPreferredSize(new Dimension(100, 300));

		sldTemperatura.setMinorTickSpacing(1);
		sldTemperatura.setMajorTickSpacing(5);
		sldTemperatura.setPaintTicks(true);
		sldTemperatura.setPaintLabels(true);

		add(sldTemperatura);
		add(lblTemperatura);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio5 ejercicio = new Ejercicio5();

	}

}
