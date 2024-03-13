package hoja03;


import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Ejercicio5 extends JFrame {

	public Ejercicio5() {

		super("Opciones de la aplicación");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout( FlowLayout.LEFT));

		// Creamos el botón y panel de Editor donde agregamos el botón de Editor.
		JMenu menuEditor = new JMenu("Editor");
		JPanel panelEditor = new JPanel();
		menuEditor.add(panelEditor);
		
		// Creamos el interior del panel de Editor
		JCheckBox checkPalabraClave = new JCheckBox("Resaltar palabras clave");
		JCheckBox checkGuardar = new JCheckBox("Guardar como xml");
		panelEditor.add(checkPalabraClave);
		panelEditor.add(checkGuardar);
		
		// Creamos el botón y panel de Ventanas donde agregamos el botón de Ventanas.
		JMenu menuVentanas = new JMenu("Ventanas");
		JPanel panelVentanas = new JPanel();
		menuVentanas.add(panelVentanas);
		
		// Creamos el interior del panel de Ventanas
		JCheckBox checkMostrarBarraLateral = new JCheckBox("Mostrar barras laterales");
		JCheckBox checkMostrarBarraMenu = new JCheckBox("Mostrar barra de menús");
		panelVentanas.add(checkMostrarBarraLateral);
		panelVentanas.add(checkMostrarBarraMenu);
		
		//Agregamos los botones Editor y Ventanas
		JMenuBar menu = new JMenuBar();
		menu.add(menuEditor);
		menu.add(menuVentanas);
		
		add(menu);
		
		
		
		
		
		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio5();

	}

}
