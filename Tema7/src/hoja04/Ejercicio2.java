package hoja04;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame implements ItemListener {

	private JComboBox<String> comboCurso;
	private JLabel lblSeleccion;

	public Ejercicio2() {

		super("Apellidos");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblApellidos = new JLabel("Apellidos");
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblCurso = new JLabel("Curso");
		lblSeleccion = new JLabel("");
		JTextField textApellidos = new JTextField(20);
		JTextField textNombre = new JTextField(20);

		comboCurso = new JComboBox<String>();
		comboCurso.addItemListener(this);

		comboCurso.addItem("Selecciona un curso");
		comboCurso.addItem("1ºESO");
		comboCurso.addItem("2ºESO");
		comboCurso.addItem("3ºESO");
		comboCurso.addItem("4ºESO");

		add(lblApellidos);
		add(textApellidos);
		add(lblNombre);
		add(textNombre);
		add(lblCurso);
		add(comboCurso);
		add(lblSeleccion);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		String seleccion = (String) comboCurso.getSelectedItem();

		if (seleccion.equals("Selecciona un curso")) {
			lblSeleccion.setText("");
		} else {
			lblSeleccion.setText("Curso: " + seleccion);
		}
	}

	public static void main(String[] args) {
		new Ejercicio2();

	}

}
