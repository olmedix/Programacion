package hallFame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jugador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static String nombreJugador,puntuacionJugador;
	private static Jugador jugador;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jugador frame = new Jugador();
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
	public Jugador() {
		super("Puntuaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("*** Hall of Fame ***");
		lblNewLabel.setBounds(142, -1, 150, 15);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(289, 11, 3, 3);
		contentPane.add(scrollPane);
		
		JScrollPane scrListado = new JScrollPane();
		scrListado.setBounds(12, 23, 426, 173);
		contentPane.add(scrListado);
		
		JList listado = new JList();
		scrListado.setColumnHeaderView(listado);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Jugador jugador = new Jugador();
				
				nuevoJugador();
				leerDatosJugador();
			}
		});
		btnNuevo.setBounds(78, 208, 117, 25);
		contentPane.add(btnNuevo);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(234, 208, 117, 25);
		contentPane.add(btnBorrar);
	}
	
	
	private static Jugador leerDatosJugador() {
		
		Jugador.nombreJugador = JOptionPane.showInputDialog(null, "¿Nombre del jugador?");
		
		
		
		Jugador.puntuacionJugador = JOptionPane.showInputDialog(null, "¿Puntuación del jugador?");
		
		try {
			double num = Double.parseDouble(puntuacionJugador);
		} catch (NumberFormatException e) {
			Jugador.puntuacionJugador=null;
		}
		
		System.out.println(nombreJugador + "    " + puntuacionJugador);
		return jugador;
	}
	
	// Recogemos los datos del jugador.
	private void nuevoJugador() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
