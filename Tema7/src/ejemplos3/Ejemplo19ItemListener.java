package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo19ItemListener extends JFrame implements ItemListener {

	private JComboBox<String> comboAsignatura;
	private JLabel lblPreferida;

	public Ejemplo19ItemListener() {

		super("Asignaturas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(null, "NO se ha podido aplicar look and feeel", "error", JOptionPane.ERROR_MESSAGE);
		}
		JLabel lblAsignaturas = new JLabel("Elige tu asignatura favorita:");
		comboAsignatura = new JComboBox<String>();
		comboAsignatura.addItem("Selecciona una");
		comboAsignatura.addItem("Programación");
		comboAsignatura.addItem("Formación y orientación laboral");
		comboAsignatura.addItem("Entornos de desarrollo");
		comboAsignatura.addItem("Base de datos");
		comboAsignatura.addItem("Sistemas informáticos");
		comboAsignatura.addItem("Lenguajes de marcas");

		comboAsignatura.addItemListener(this);

		lblPreferida = new JLabel("");

		add(lblAsignaturas);
		add(comboAsignatura);
		add(lblPreferida);

		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		int seleccionado = comboAsignatura.getSelectedIndex();

		if (seleccionado == 0) {
			lblPreferida.setText("");
		} else {
			String cadena = comboAsignatura.getItemAt(seleccionado);
			lblPreferida.setText("Has seleccionado " + cadena);
		}

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
		new Ejemplo19ItemListener();

	}

}
