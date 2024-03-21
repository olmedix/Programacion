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
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);
		
		JLabel lblA = new JLabel("Operando A");
		JLabel lblB = new JLabel("Operando B");
		JLabel lblOperacion = new JLabel("Operación");
		JLabel lblResultado = new JLabel("Resultado");
		
		textA = new JTextField(10);
		textA.addActionListener(this);
		
		textB = new JTextField(10);
		textB.addActionListener(this);
		
		textResultado = new JTextField(10); 
		textResultado.addActionListener(this);
		
		comboOperacion = new JComboBox<String>();
		comboOperacion.addActionListener(this);
		comboOperacion.setPreferredSize(new Dimension(100,30));
		comboOperacion.addItem("Suma");
		comboOperacion.addItem("Resta");
		comboOperacion.addItem("Multiplicación");
		comboOperacion.addItem("División");
		
		
		
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
		double a;
		
		
		
		
		if(comboOperacion.getSelectedItem()=="Suma") {
			//AHORA TOCA BUSCAR LA FORMA DE CONVERTIR EN NUMERO.
			System.out.println("suma");
		}else if(comboOperacion.getSelectedItem()=="Resta") {
			System.out.println("resta");
		}else if(comboOperacion.getSelectedItem()=="Multiplicación") {
			System.out.println("multi");
		}else if(comboOperacion.getSelectedItem()=="División") {
			System.out.println("divison");
		}
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		new Ejercicio3();

	}

	

}
