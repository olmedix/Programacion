package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo04JComboBox extends JFrame {

	public Ejemplo04JComboBox() {

		super("Províncias");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {
			// Aplicamos el tema (look and feel) llamado Nimbus
			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

			// Aplicamos el tema (look and feel) del sistema operativo.
			// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

			// Esta instrucción asegura que el tema se aplique correctamente a toda la
			// interfaz de usuario.
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {

			System.out.println("Error al cambiar el Look and Feel");
		}

		JLabel lblProvincia = new JLabel("Seleccion tu provincia preferida:");
		JComboBox<String> cmbProvincias = new JComboBox<>();
		cmbProvincias.addItem("Islas Baleares");
		cmbProvincias.addItem("Alicante");
		cmbProvincias.addItem("Murcia");
		cmbProvincias.addItem("Valencia");
		cmbProvincias.addItem("Jaén");
		cmbProvincias.addItem("Albacete");

		// para pasar un tamanyo al desplegable, setSize no funciona para esto.
		cmbProvincias.setPreferredSize(new Dimension(300, 20));

		JLabel lblDescripcion = new JLabel("¿Por qué es tu pronvincia favorita?");

		JTextArea txtDescripcion = new JTextArea();

		// para que no genere scroll horizontal.
		txtDescripcion.setLineWrap(true);

		// para que no corte las palabras.
		txtDescripcion.setWrapStyleWord(true);

		JScrollPane scrPanel = new JScrollPane(txtDescripcion);
		scrPanel.setPreferredSize(new Dimension(300, 80));

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setPreferredSize(new Dimension(130, 25));

		add(lblProvincia);
		add(cmbProvincias);
		add(lblDescripcion);
		add(scrPanel);
		add(btnGuardar);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo04JComboBox ventana = new Ejemplo04JComboBox();
	}

}
