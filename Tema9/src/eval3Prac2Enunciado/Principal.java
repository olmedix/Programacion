package eval3Prac2Enunciado;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private static List<Alumno> alumnos;

	private static final long serialVersionUID = 1L;

	private final String ARCHIVO_ALUMNOS = "ficheros/alumnos.txt";
	private final String BOLETIN = "ficheros/boletin.txt";
	private JPanel contentPane;
	private JTextField txtAsignatura;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {

		setTitle("Boletín App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(this, "Error al cambiar el look and feel de la aplicación.", "Boletín App",
					JOptionPane.ERROR_MESSAGE);
		}

		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setBounds(10, 10, 100, 13);
		contentPane.add(lblAsignatura);

		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(10, 33, 164, 19);
		contentPane.add(txtAsignatura);
		txtAsignatura.setColumns(10);

		JLabel lblAlumnos = new JLabel("Alumnos");
		lblAlumnos.setBounds(10, 62, 60, 13);
		contentPane.add(lblAlumnos);

		JScrollPane panelAlumnos = new JScrollPane();
		panelAlumnos.setBounds(10, 85, 508, 278);
		contentPane.add(panelAlumnos);

		DefaultListModel<Alumno> modelo = new DefaultListModel<>();
		JList<Alumno> lstAlumnos = new JList<>(modelo);
		lstAlumnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					abrirFichaAlumno(lstAlumnos);
				}
			}
		});
		panelAlumnos.setViewportView(lstAlumnos);

		alumnos = new ArrayList<>();

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarBoletin(BOLETIN);
			}
		});
		btnGuardar.setBounds(142, 373, 115, 21);
		contentPane.add(btnGuardar);

		JButton btnImportarAlumnos = new JButton("Importar alumnos");
		btnImportarAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				importarAlumnos(ARCHIVO_ALUMNOS);

				mostrarAlumnos(modelo);
			}
		});
		btnImportarAlumnos.setBounds(10, 373, 115, 21);
		contentPane.add(btnImportarAlumnos);

	}

	/**
	 * Método que introduce los alumnos en el programa. Los alumnos tendrán nota= -1
	 * por defecto.
	 * 
	 * @param rutaArchivo ruta del archivo de lectura.
	 * @return el arrayList con todos los alumnos.
	 */
	public List<Alumno> importarAlumnos(String rutaArchivo) {

		// Cada vez que pulse el botón "importar alumnos" se reiniciarán los alumnos y
		// las notas y no abrá duplicidades.
		alumnos.clear();

		try {
			BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

			String linea = br.readLine();
			JOptionPane.showMessageDialog(this, "Se van a importar los alumnos de " + linea + ".", "Boletín App",
					JOptionPane.INFORMATION_MESSAGE);

			// Leemos de nuevo para no guardar el curso en el ArrayList.
			linea = br.readLine();
			while (linea != null) {
				// Comprobamos que no haya lineas vacias.
				if (!linea.trim().isEmpty()) {

					alumnos.add(new Alumno(linea, -1));
				}

				linea = br.readLine();
			}

			br.close();

		} catch (FileNotFoundException e) {

			JOptionPane.showMessageDialog(null, "El archivo no ha sido localizado.", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			System.out.println("buffer de lectura no se ha cerrado correctamente.");
		}

		return alumnos;

	}

	/**
	 * Método que muestra los alumnos en el panel principal.
	 * 
	 * @param modelo añadimos los alumnos.
	 */
	public void mostrarAlumnos(DefaultListModel<Alumno> modelo) {

		modelo.clear();

		for (Alumno alumno : alumnos) {
			modelo.addElement(alumno);
		}
	}

	/**
	 * Método que abre la ventana donde introduciremos las notas individualmente de
	 * cada alumno.
	 * 
	 * @param lstAlumnos para seleccionar el alumno al cual deseamos
	 *                   cambiar/introducir la nota.
	 */
	public void abrirFichaAlumno(JList<Alumno> lstAlumnos) {
		Alumno alumno = lstAlumnos.getSelectedValue();
		
		VentanaNota ventana = new VentanaNota();
		
		ventana.setAlumno(alumno);

		ventana.setLocationRelativeTo(this);

		ventana.setCallback(new Callback() {

			@Override
			public void actualizarVentana(int nota) {

				alumno.setNota(nota);
			}
		});

	}

	/**
	 * Método que guarda la asignatura, fecha del día y los alumnos con sus notas ya
	 * puestas. Los alumnos sin nota asignada tendrán el valor de -1. Más detalles
	 * en {@link #importarAlumnos(String)}
	 * 
	 * @param rutaArchivo ruta del archivo en el cual guardaremos el fichero.
	 */
	public void guardarBoletin(String rutaArchivo) {

		String asignatura = txtAsignatura.getText();

		// Verificamos que todo este rellenado.
		if (!asignatura.isEmpty() && !alumnos.isEmpty()) {

			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));

				bw.write("asignatura=" + txtAsignatura.getText() + "\n");
				bw.write("fecha=" + LocalDate.now() + "\n\n");

				for (Alumno alumno : alumnos) {
					bw.write("nombre=" + alumno.getNombre() + "\n");
					bw.write("nota=" + alumno.getNota() + "\n");

				}
				bw.close();
			} catch (IOException e) {

				JOptionPane.showMessageDialog(this, "El archivo no ha sido localizado", "Error", JOptionPane.ERROR);
			}

			JOptionPane.showMessageDialog(this, "Se han guardado las notas de " + txtAsignatura.getText() + ".",
					"Boletín App", JOptionPane.INFORMATION_MESSAGE);

		} else if (asignatura.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, rellene la casilla de asignatura", "Asigntura vacía",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "Debe importar a los alumnos", "Alumnos no importados.",
					JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
