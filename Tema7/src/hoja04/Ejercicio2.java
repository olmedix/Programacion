package hoja04;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame implements ItemListener {

	public Ejercicio2() {

		super("Matrícula");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(20);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);

		JLabel lblCurso = new JLabel("Curso");
		JComboBox<String> comboCurso = new JComboBox<>();
		
		// Label que 
		JLabel lblOpcionCurso = new JLabel("");

		comboCurso.addItem("1º ESO");
		comboCurso.addItem("2º ESO");
		comboCurso.addItem("3º ESO");
		comboCurso.addItem("4º ESO");

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(comboCurso);
		add(lblOpcionCurso);

		setVisible(true);

	}
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {

		new Ejercicio2();

	}

	
}
