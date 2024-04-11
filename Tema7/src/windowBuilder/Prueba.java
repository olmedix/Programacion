package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Prueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public Prueba() {
		setTitle("Pruebas con windowBuilder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu mnArchivo = new JMenu("Archivo");
		barraMenu.add(mnArchivo);
		
		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(itemNuevo);
		
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		mnArchivo.add(itemAbrir);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(itemCerrar);
		
		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnArchivo.add(itemSalir);
		
		JMenu mnEditar = new JMenu("Editar");
		barraMenu.add(mnEditar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(12, 12, 82, 15);
		contentPane.add(label);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(24, 12, 70, 15);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(22, 34, 114, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(24, 65, 70, 15);
		contentPane.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(22, 88, 114, 19);
		contentPane.add(txtApellidos);
		
		JScrollPane scrComentarios = new JScrollPane();
		scrComentarios.setBounds(175, 24, 252, 206);
		contentPane.add(scrComentarios);
		
		JTextArea txtComentarios = new JTextArea();
		scrComentarios.setViewportView(txtComentarios);
		
		JComboBox<String> cmbProvincias = new JComboBox<>();
		cmbProvincias.setModel(new DefaultComboBoxModel(new String[] {"Alicante", "Albacete", "Murcia", "Islas Baleares"}));
		cmbProvincias.setBounds(22, 163, 114, 24);
		contentPane.add(cmbProvincias);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(24, 132, 70, 15);
		contentPane.add(lblProvincia);
	}
}
