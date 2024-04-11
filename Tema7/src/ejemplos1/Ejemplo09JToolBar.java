package ejemplos1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo09JToolBar extends JFrame {

	public Ejemplo09JToolBar() {

		super("Barra de herramientas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(imgNuevo);

		// Se puede hacer en una linea, no hace falta si no se va a usar el nombre
		// de la variable. new ImageIcon se puede añadir directamente dentro del
		// JButton.
		JButton btnAbrir = new JButton(new ImageIcon("iconos/52.png"));

		JButton btnGuardar = new JButton(new ImageIcon("iconos/22.png"));

		tlbHerramientas.add(btnNuevo);
		// Creamos un separador entre iconos , para separar iconos por grupos por
		// ejemplo.
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnAbrir);
		tlbHerramientas.add(btnGuardar);

		add(tlbHerramientas, BorderLayout.NORTH);

		// Añadimos un panel a la parte central de la ventana, dentro del cual aparecerá
		// un JLabel y un JScrollPane.
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(new FlowLayout());
		// panelCentro.setBackground(Color.RED);

		JLabel lblComentarios = new JLabel("Comentarios:");
		JTextArea txtComentarios = new JTextArea();
		JScrollPane scrComentarios = new JScrollPane(txtComentarios);
		scrComentarios.setPreferredSize(new Dimension(400, 300));

		panelCentro.add(lblComentarios);
		panelCentro.add(scrComentarios);

		add(panelCentro, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo09JToolBar();

	}

}
