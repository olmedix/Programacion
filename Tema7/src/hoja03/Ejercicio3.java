package hoja03;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejercicio3 extends JFrame {

	public Ejercicio3() {

		super("Parámetros críticos");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JProgressBar pgbCombustible = new JProgressBar(0, 100);
		pgbCombustible.setStringPainted(true);
		pgbCombustible.setValue(20);
		pgbCombustible.setBackground(Color.WHITE);
		pgbCombustible.setForeground(Color.RED);
		JLabel lblCombustible = new JLabel("Combustible");

		JProgressBar pgbMotor1 = new JProgressBar(0, 100);
		pgbMotor1.setStringPainted(true);
		pgbMotor1.setValue(75);
		pgbMotor1.setBackground(Color.WHITE);
		pgbMotor1.setForeground(Color.GREEN);
		JLabel lblMotor1 = new JLabel("Presión motor 1");

		JProgressBar pgbMotor2 = new JProgressBar(0, 100);
		pgbMotor2.setStringPainted(true);
		pgbMotor2.setValue(75);
		pgbMotor2.setBackground(Color.WHITE);
		pgbMotor2.setForeground(Color.GREEN);
		JLabel lblMotor2 = new JLabel("Presión motor 2");

		add(pgbCombustible);
		add(lblCombustible);
		add(pgbMotor1);
		add(lblMotor1);
		add(pgbMotor2);
		add(lblMotor2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio3();

	}

}
