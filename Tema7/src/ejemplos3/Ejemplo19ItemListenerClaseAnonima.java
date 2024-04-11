package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo19ItemListenerClaseAnonima extends JFrame {

	private JComboBox<String> comboAsignatura;
	private JLabel lblPreferida;

	public Ejemplo19ItemListenerClaseAnonima() {

		super("Asignaturas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JLabel lblAsignaturas = new JLabel("Elige tu asignatura favorita:");
		comboAsignatura = new JComboBox<String>();
		comboAsignatura.addItem("Selecciona una");
		comboAsignatura.addItem("Programación");
		comboAsignatura.addItem("Formación y orientación laboral");
		comboAsignatura.addItem("Entornos de desarrollo");
		comboAsignatura.addItem("Base de datos");
		comboAsignatura.addItem("Sistemas informáticos");
		comboAsignatura.addItem("Lenguajes de marcas");

		comboAsignatura.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int seleccionado = comboAsignatura.getSelectedIndex();

				if (seleccionado == 0) {
					lblPreferida.setText("");
				} else {
					String cadena = comboAsignatura.getItemAt(seleccionado);
					lblPreferida.setText("Has seleccionado " + cadena);
				}

			}
		});

		lblPreferida = new JLabel("");

		add(lblAsignaturas);
		add(comboAsignatura);
		add(lblPreferida);

		setVisible(true);
	}

//	@Override
//	public void itemStateChanged(ItemEvent arg0) {
//
//		String seleccionado = (String) comboAsignatura.getSelectedItem();
//
//		if (seleccionado.equals("Selecciona una")) {
//			lblPreferida.setText("");
//		} else {
//
//			lblPreferida.setText("Has seleccionado " + seleccionado);
//		}
//
//	}

	public static void main(String[] args) {
		new Ejemplo19ItemListenerClaseAnonima();

	}

}
