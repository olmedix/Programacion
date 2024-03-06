package ejercicios;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

public class Ejercicio4 extends JFrame {

	public Ejercicio4() {

		super("Velocidad de crucero");
		setSize(360, 130);
		setLayout(new FlowLayout());

		JSlider sldVelocidad = new JSlider(JSlider.HORIZONTAL, 10, 120, 90);
		sldVelocidad.setPreferredSize(new Dimension(300, 70));
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setMajorTickSpacing(20);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintLabels(true);

		add(sldVelocidad);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio4 ejercicio = new Ejercicio4();

	}

}
