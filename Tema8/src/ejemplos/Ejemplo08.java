package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo08 extends JFrame {
	
	private JLabel lblArchivoElegido;

	public Ejemplo08() {

		super("Lector de archivos");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btnElegirArchivo = new JButton("Elegir archivo");

		lblArchivoElegido = new JLabel("");

		add(btnElegirArchivo);
		add(lblArchivoElegido);

		btnElegirArchivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				elegirArchivo();
			}
		});

		setVisible(true);
	}
	

	private void elegirArchivo() {
		
		JFileChooser eleccion = new JFileChooser();
		
		int resultado = eleccion.showOpenDialog(null);
		
		if(resultado == eleccion.CANCEL_OPTION) {
			return;
		}
		
		File nombreArchivo = eleccion.getSelectedFile();
		
		// ALTERNATIVA:
		// String nombreArchivo2= eleccion.getSelectedFile().toString();
		lblArchivoElegido.setText(nombreArchivo.toString());
	}
	
	
	public static void main(String[] args) {

		new Ejemplo08();

	}

}
