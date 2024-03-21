package hoja05;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame implements FocusListener {

	JTextField text1, text2, text3;

	public Ejercicio1() {

		super("Texto decorado");
		setSize(500, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		text1 = new JTextField(10);
		text1.addFocusListener(this);

		text2 = new JTextField(10);
		text2.addFocusListener(this);

		text3 = new JTextField(10);
		text3.addFocusListener(this);

		add(text1);
		add(text2);
		add(text3);

		setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent arg0) {

		if (text1 == arg0.getSource()) {
			text1.setBackground(Color.YELLOW);
		} else if (text2 == arg0.getSource()) {
			text2.setBackground(Color.YELLOW);
		} else {
			text3.setBackground(Color.YELLOW);
		}

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		if (text1 == arg0.getSource()) {
			text1.setBackground(Color.WHITE);
		} else if (text2 == arg0.getSource()) {
			text2.setBackground(Color.WHITE);
		} else {
			text3.setBackground(Color.WHITE);
		}

	}

	public static void main(String[] args) {
		new Ejercicio1();

	}

}
