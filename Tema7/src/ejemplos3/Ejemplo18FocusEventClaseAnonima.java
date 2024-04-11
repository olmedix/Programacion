package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejemplo18FocusEventClaseAnonima extends JFrame {

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JLabel lblPromedio;
	private int num1,num2,num3;

	public Ejemplo18FocusEventClaseAnonima() {

		super("Media aritmética");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		txtNum1 = new JTextField("0", 5);
		txtNum1.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				try {
					num1 = Integer.parseInt(txtNum1.getText());
					
					double promedio = (num1 + num2 + num3) / 3.0;
					lblPromedio.setText("Promedio = " + promedio);
					
				} catch (NumberFormatException nfe) {
					lblPromedio.setText("ERROR");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {

			}

		});

		txtNum2 = new JTextField("0", 5);
		txtNum2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				try {
					num2 = Integer.parseInt(txtNum2.getText());
					
					double promedio = (num1 + num2 + num3) / 3.0;
					lblPromedio.setText("Promedio = " + promedio);
					
				} catch (NumberFormatException nfe) {
					lblPromedio.setText("ERROR");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub	
			}
			
		});

		txtNum3 = new JTextField("0", 5);
		txtNum3.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				try {
					num3 = Integer.parseInt(txtNum3.getText());
					
					double promedio = (num1 + num2 + num3) / 3.0;
					lblPromedio.setText("Promedio = " + promedio);
					
				} catch (NumberFormatException nfe) {
					lblPromedio.setText("ERROR");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub	
			}
			
		});

		lblPromedio = new JLabel("Promedio = 0");

		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(lblPromedio);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo18FocusEventClaseAnonima();

	}

}
