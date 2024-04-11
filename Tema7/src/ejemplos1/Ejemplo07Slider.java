package ejemplos1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejemplo07Slider extends JFrame {

	public Ejemplo07Slider() {

		super("Volumen");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		JLabel lblVolumen = new JLabel("Volumen");
		JSlider sldVolumen = new JSlider(JSlider.VERTICAL, 0, 100, 20);
		sldVolumen.setMajorTickSpacing(10);
		sldVolumen.setMinorTickSpacing(5);
		sldVolumen.setPaintLabels(true);
		sldVolumen.setPaintTicks(true);
		sldVolumen.setPreferredSize(new Dimension(100, 300));

		add(lblVolumen);
		add(sldVolumen);

		setVisible(true);
	}

	public static void main(String[] args) {

		Ejemplo07Slider ejemplo = new Ejemplo07Slider();
	}

}
