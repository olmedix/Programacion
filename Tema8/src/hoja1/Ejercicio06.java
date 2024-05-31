package hoja1;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio06 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblMostrarRuta;
	private JMenuItem itemOpen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio06 frame = new Ejercicio06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuPrincipal = new JMenuBar();
		setJMenuBar(menuPrincipal);

		JMenu menuFile = new JMenu("File");
		menuPrincipal.add(menuFile);

		itemOpen = new JMenuItem("Open File");
		itemOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				elegirArchivo(arg0);
			}
		});
		menuFile.add(itemOpen);

		JMenuItem itemSave = new JMenuItem("Save");
		itemSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				elegirArchivo(arg0);
			}
		});
		menuFile.add(itemSave);
		contentPane = new JPanel();
		FlowLayout flowLayout = (FlowLayout) contentPane.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setAlignOnBaseline(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		lblMostrarRuta = new JLabel("Selecciona un archivo");
		contentPane.add(lblMostrarRuta);
	}

	private void elegirArchivo(ActionEvent e) {

		int eleccion;
		JFileChooser chooser = new JFileChooser();

		if (e.getSource() == itemOpen) {
			eleccion = chooser.showOpenDialog(chooser);
		} else {
			eleccion = chooser.showSaveDialog(chooser);
		}

		if (eleccion == chooser.CANCEL_OPTION) {
			return;
		}

		File archivo = chooser.getSelectedFile();

		lblMostrarRuta.setText(archivo.toString());

	}

}
