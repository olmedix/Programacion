package hoja05;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio3 extends JFrame implements ActionListener {

	private JComboBox<String> comboOperacion;
	private JTextField textA;
	private JTextField textB;
	private JTextField textResultado;

	public Ejercicio3() {

		super();
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JLabel lblA = new JLabel("Operando A");
		JLabel lblB = new JLabel("Operando B");
		JLabel lblOperacion = new JLabel("Operación");
		JLabel lblResultado = new JLabel("Resultado");

		textA = new JTextField("0", 10);
		textA.addActionListener(this);

		textB = new JTextField("0", 10);
		textB.addActionListener(this);

		textResultado = new JTextField(10);
		textResultado.addActionListener(this);

		comboOperacion = new JComboBox<String>();
		comboOperacion.setPreferredSize(new Dimension(100, 30));
		comboOperacion.addItem("Suma");
		comboOperacion.addItem("Resta");
		comboOperacion.addItem("Multiplicación");
		comboOperacion.addItem("División");
		comboOperacion.addActionListener(this);

		add(lblA);
		add(textA);
		add(lblB);
		add(textB);
		add(lblOperacion);
		add(comboOperacion);
		add(lblResultado);
		add(textResultado);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		String operandoA = textA.getText();
		String operandoB = textB.getText();
		double resultado = 0;

		if (comboOperacion.getSelectedItem() == "Suma") {
			try {
				resultado = Double.parseDouble(operandoA) + Double.parseDouble(operandoB);
				textResultado.setText("" + resultado);
			} catch (NumberFormatException e) {
				textResultado.setText("ERROR");
			}

		} else if (comboOperacion.getSelectedItem() == "Resta") {

			try {
				resultado = Double.parseDouble(operandoA) - Double.parseDouble(operandoB);
				textResultado.setText("" + resultado);
			} catch (NumberFormatException e) {
				textResultado.setText("ERROR");
			}

		} else if (comboOperacion.getSelectedItem() == "Multiplicación") {

			try {
				resultado = Double.parseDouble(operandoA) * Double.parseDouble(operandoB);
				textResultado.setText("" + resultado);
			} catch (NumberFormatException e) {
				textResultado.setText("ERROR");
			}

		} else if (comboOperacion.getSelectedItem() == "División") {

			try {
				resultado = Double.parseDouble(operandoA) / Double.parseDouble(operandoB);
				textResultado.setText("" + resultado);
			} catch (NumberFormatException e) {
				textResultado.setText("ERROR");
			}

		}

	}

	public static void main(String[] args) {
		new Ejercicio3();

	}

}
