package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ActividadFinal extends JFrame {

	private JTextArea txtTexto;

	public ActividadFinal() {

		super("Lector");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JMenuItem itemAbrir = new JMenuItem("Abrir");

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemAbrir);

		JMenuBar menu = new JMenuBar();
		menu.add(menuArchivo);

		txtTexto = new JTextArea();

		JScrollPane scbTexto = new JScrollPane(txtTexto);
		scbTexto.setPreferredSize(new Dimension(300, 200));

		setJMenuBar(menu);
		add(scbTexto);

		itemAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				leerArchivo();

			}
		});

		setVisible(true);

	}

	private void leerArchivo() {

		JFileChooser buscador = new JFileChooser();

		int eleccion = buscador.showOpenDialog(buscador);

		if (eleccion == buscador.CANCEL_OPTION) {
			return;
		}

		File archivo = buscador.getSelectedFile();

		try {
			txtTexto.setText("");
			BufferedReader buffer = new BufferedReader(new FileReader(archivo));

			String linea = buffer.readLine();

			while (linea != null) {

				txtTexto.append(linea + "\n");

				linea = buffer.readLine();
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no se ha encontrado.");
		} catch (IOException e) {
			System.out.println("Error de entrada y salida.");
		}

	}

	public static void main(String[] args) {

		new ActividadFinal();

	}

}
